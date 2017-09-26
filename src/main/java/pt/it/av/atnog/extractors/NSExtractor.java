package pt.it.av.atnog.extractors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import pt.it.av.atnog.nsdescriptor.NSDescriptor;
import pt.it.av.atnog.nsdescriptor.NSTopLevelContainer;

import java.io.*;

public class NSExtractor {
    private static int BUFFER_SIZE = 4 * 1024;

    private File NSDescriptorFile;

    public NSExtractor(File NSDescriptorFile) {
        this.NSDescriptorFile = NSDescriptorFile;
    }

    public NSDescriptor extractDescriptor() throws IOException {
        try (InputStream in = new FileInputStream(NSDescriptorFile);
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
                    NSTopLevelContainer container = mapper.readValue(file.toByteArray(), NSTopLevelContainer.class);

                    return container.catalog.descriptors.get(0);
                }
            }
        }

        return null;
    }
}
