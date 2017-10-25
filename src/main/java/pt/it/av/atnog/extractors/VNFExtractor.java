package pt.it.av.atnog.extractors;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import pt.it.av.atnog.vnfdescriptor.VNFDescriptor;
import pt.it.av.atnog.vnfdescriptor.VNFTopLevelContainer;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd;

public class VNFExtractor {
    private static int BUFFER_SIZE = 4 * 1024;

    private File VNFDescriptorFile;

	private String descriptorYAMLfile;	
	
	private ByteArrayOutputStream iconfilePath;	


	public VNFExtractor(File VNFDescriptorFile) {
        this.VNFDescriptorFile = VNFDescriptorFile;
    }
    
    public Vnfd extractVnfdDescriptor() throws IOException {
    	Vnfd descriptor = null;
    	 
        try (InputStream in = new FileInputStream(VNFDescriptorFile);
             GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
             TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)){
            TarArchiveEntry entry, root = null;

            while ((entry = tarIn.getNextTarEntry()) != null) {
                if(root == null && entry.getName().indexOf("/") == entry.getName().length()-1) {
                    root = entry;
                    continue;
                }

                if(entry.getName().indexOf("/", root.getName().length()) == -1 && entry.getName().endsWith(".yaml")) {
                    ByteArrayOutputStream file = new ByteArrayOutputStream();

                    int count;
                    byte data[] = new byte[BUFFER_SIZE];

                    while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
                        file.write(data, 0, count);
                    }

                    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
                    //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    
                    this.descriptorYAMLfile = new String(file.toByteArray());
                    
                    JsonNode tr = mapper.readTree( this.descriptorYAMLfile ).findValue("vnfd:vnfd");
                    if ( tr == null ) {
                    	tr = mapper.readTree( this.descriptorYAMLfile ).findValue("vnfd");
                    }
                    tr = tr.get(0);
                    String s = tr.toString();                     

					s = s.replaceAll("vnfd:", ""); //some yaml files contain  nsd: prefix in every key which is not common in json
					
                    descriptor = mapper.readValue( s , Vnfd.class);

                }
                if(entry.getName().indexOf("/icons", root.getName().length()) == -1 && ( entry.getName().endsWith(".png") || entry.getName().endsWith(".jpg")) ) {
                	
                	this.iconfilePath = new ByteArrayOutputStream();

                     int count;
                     byte data[] = new byte[BUFFER_SIZE];

                     while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
                    	 this.iconfilePath.write(data, 0, count);
                     }
                }
            }
        }

        return descriptor;
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
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    
                    this.descriptorYAMLfile = new String(file.toByteArray());
                    VNFTopLevelContainer container = mapper.readValue(file.toByteArray(), VNFTopLevelContainer.class);

                	if (container != null) {
                	    VNFDescriptor descriptor = container.catalog.vnfDescriptors.get(0);

                	    try {
                	        mapper = new ObjectMapper(new YAMLFactory());
                	        mapper.readValue(file.toByteArray(), VNFTopLevelContainer.class);
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


    public ByteArrayOutputStream getIconfilePath() {
		return iconfilePath;
	}
}
