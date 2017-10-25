package pt.it.av.atnog.examples;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import pt.it.av.atnog.extractors.NSExtractor;
import pt.it.av.atnog.extractors.VNFExtractor;
import pt.it.av.atnog.requirements.NSRequirements;
import pt.it.av.atnog.requirements.VNFRequirements;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd;


public class Example {
    private static URL pingVnfUrl;
    private static URL pongVnfUrl;
    private static URL pingPongNsUrl;

    public static void main(String[] args) throws IOException {
        pingVnfUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/ping_vnf.tar.gz");
        pongVnfUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/pong_vnf.tar.gz");
        pingPongNsUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/ping_pong_ns.tar.gz");
        //pingVnfUrl = new URL("http://150.140.184.212:13000/5ginfireportal/services/api/repo/packages/67ce4a0f-8c41-40e9-a2ad-bd2f8a783fe8/lab_vnfd.tar.gz");

        File pingVnfFile = File.createTempFile("ping_vnf", ".tar.gz");
        File pongVnfFile = File.createTempFile("pong_vnf", ".tar.gz");
        File pingPongNsFile = File.createTempFile("ping_pong_ns", ".tar.gz");

        pingVnfFile.deleteOnExit();
        pongVnfFile.deleteOnExit();
        pingPongNsFile.deleteOnExit();

        System.out.println("Downloading Ping VNF, Pong VNF and PingPong NS");

        FileUtils.copyURLToFile(pingVnfUrl, pingVnfFile);
        FileUtils.copyURLToFile(pongVnfUrl, pongVnfFile);
        FileUtils.copyURLToFile(pingPongNsUrl, pingPongNsFile);

        System.out.println("Calculating requirements...");

        VNFExtractor vnfPingExtract = new VNFExtractor(pingVnfFile);
        Vnfd pingVnfDescriptor = vnfPingExtract.extractVnfdDescriptor();
        VNFRequirements pingVnfRequirements = new VNFRequirements(pingVnfDescriptor);

        VNFExtractor vnfPongExtract = new VNFExtractor(pongVnfFile);
        Vnfd pongVnfDescriptor = vnfPongExtract.extractVnfdDescriptor();
        VNFRequirements pongVnfRequirements = new VNFRequirements(pongVnfDescriptor);

//        List<VNFDescriptor> vnfDescriptorList = new ArrayList<>();
//        vnfDescriptorList.add(pingVnfDescriptor);
//        vnfDescriptorList.add(pongVnfDescriptor);

        NSExtractor nsExtractor = new NSExtractor(pingPongNsFile);
        Nsd pingPongNsDescriptor = nsExtractor.extractNsDescriptor();
        NSRequirements pingPongNsRequirements = new NSRequirements(pingPongNsDescriptor);

        System.out.println("Presenting requirements:");

        System.out.println("Ping VNF: " + pingVnfRequirements.toHTML());
        System.out.println("Ping VNF: " + pingVnfRequirements.toHTML());
        System.out.println("Pong VNF: " + pongVnfRequirements.toHTML());
        System.out.println("Ping Pong NS: " + pingPongNsRequirements.toHTML());

        System.out.println("Unknown fields:");

//        System.out.println("Ping VNF: " + pingVnfRequirements.unknownFields);
//        System.out.println("Pong VNF: " + pongVnfRequirements.unknownFields);
//        System.out.println("Ping Pong NS: " + pingPongNsRequirements.unknownFields);
        

        System.out.println("Vnfd = " + pingVnfDescriptor.toString() );
        System.out.println("Ping VNF Icon : " + vnfPingExtract.getIconfilePath() );
        System.out.println("Vnfd = " + pongVnfDescriptor.toString() );
        System.out.println("Pong VNF Icon : " + vnfPongExtract.getIconfilePath() );
        System.out.println("Nsd = " + pingPongNsDescriptor.toString() );
        System.out.println("Ping Pong Icon : " + nsExtractor.getIconfilePath() );
        
    }
}
