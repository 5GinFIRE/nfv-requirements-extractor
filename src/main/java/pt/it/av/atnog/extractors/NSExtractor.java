package pt.it.av.atnog.extractors;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import pt.it.av.atnog.nsdescriptor.NSDescriptor;
import pt.it.av.atnog.nsdescriptor.NSTopLevelContainer;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd;

public class NSExtractor {
	private static int BUFFER_SIZE = 4 * 1024;

	private File NSDescriptorFile;

	private String descriptorYAMLfile;

	public NSExtractor(File NSDescriptorFile) {
		this.NSDescriptorFile = NSDescriptorFile;
	}

	public Nsd extractNsDescriptor() throws IOException  {
		try (InputStream in = new FileInputStream(NSDescriptorFile);
				GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
				TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)) {
			TarArchiveEntry entry, root = null;

			while ((entry = tarIn.getNextTarEntry()) != null) {
				if (root == null && entry.getName().indexOf("/") == entry.getName().length() - 1) {
					root = entry;
					continue;
				}

				if (entry.getName().indexOf("/", root.getName().length()) == -1 && entry.getName().endsWith(".yaml")) {
					ByteArrayOutputStream file = new ByteArrayOutputStream();

					int count;
					byte data[] = new byte[BUFFER_SIZE];

					while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						file.write(data, 0, count);
					}

					ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

					this.descriptorYAMLfile = new String(file.toByteArray());

					JsonNode tr = mapper.readTree(this.descriptorYAMLfile).findValue("nsd:nsd").get(0);
					String s = tr.toString();
					
					s = s.replaceAll("nsd:", ""); //some yaml files contain  nsd: prefix in every key which is not common in json
					
					
					Nsd descriptor = mapper.readValue( s , Nsd.class);

					return descriptor;

				}
			}
		}

		return null;
	}
	
	public NSDescriptor extractDescriptor() throws IOException {
		try (InputStream in = new FileInputStream(NSDescriptorFile);
				GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
				TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)) {
			TarArchiveEntry entry, root = null;

			while ((entry = tarIn.getNextTarEntry()) != null) {
				if (root == null && entry.getName().indexOf("/") == entry.getName().length() - 1) {
					root = entry;
					continue;
				}

				if (entry.getName().indexOf("/", root.getName().length()) == -1 && entry.getName().endsWith(".yaml")) {
					ByteArrayOutputStream file = new ByteArrayOutputStream();

					int count;
					byte data[] = new byte[BUFFER_SIZE];

					while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						file.write(data, 0, count);
					}

					ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
					mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

					this.descriptorYAMLfile = new String(file.toByteArray());
					NSTopLevelContainer container = mapper.readValue(file.toByteArray(), NSTopLevelContainer.class);

					if (container != null) {
						NSDescriptor descriptor = container.catalog.descriptors.get(0);

						try {
							mapper = new ObjectMapper(new YAMLFactory());
							mapper.readValue(file.toByteArray(), NSTopLevelContainer.class);
							descriptor.unknownFields = false;
						} catch (JsonMappingException ex) {
							ex.printStackTrace();
							descriptor.unknownFields = true;
						}

						return descriptor;
					} else {
						return null;
					}
				}
			}
		}

		return null;
	}

	public String getDescriptorYAMLfile() {
		return descriptorYAMLfile;
	}

	public void setDescriptorYAMLfile(String descriptorYAMLfile) {
		this.descriptorYAMLfile = descriptorYAMLfile;
	}

	
}
