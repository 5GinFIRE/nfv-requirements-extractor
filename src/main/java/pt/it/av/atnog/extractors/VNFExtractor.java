package pt.it.av.atnog.extractors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import pt.it.av.atnog.vnfdescriptor.VNFDescriptor;
import pt.it.av.atnog.vnfdescriptor.VNFTopLevelContainer;

import java.io.*;

public class VNFExtractor {
    private static int BUFFER_SIZE = 4 * 1024;

    private File VNFDescriptorFile;

    public VNFExtractor(File VNFDescriptorFile) {
        this.VNFDescriptorFile = VNFDescriptorFile;
    }

    public VNFDescriptor extractDescriptor() throws IOException {
        try (InputStream in = new FileInputStream(VNFDescriptorFile);
             GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
             TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)){
            TarArchiveEntry entry, root = null;

            while ((entry = tarIn.getNextTarEntry()) != null) {
                if(root == null && entry.getName().indexOf("/") == entry.getName().length()-1) {
                    root = entry;
                    continue;
                }

                if(entry.getName().indexOf("/", root.getName().length()) == -1 &&
                        entry.getName().endsWith(".yaml")) {
                    ByteArrayOutputStream file = new ByteArrayOutputStream();

                    int count;
                    byte data[] = new byte[BUFFER_SIZE];

                    while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
                        file.write(data, 0, count);
                    }

                    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

                    VNFTopLevelContainer container = mapper.readValue(file.toByteArray(), VNFTopLevelContainer.class);

                    return container.catalog.vnfDescriptors.get(0);
                }
            }
        }

        return null;
    }
}
