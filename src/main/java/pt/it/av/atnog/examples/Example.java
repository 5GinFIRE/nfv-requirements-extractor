package pt.it.av.atnog.examples;

import org.apache.commons.io.FileUtils;
import pt.it.av.atnog.extractors.NSExtractor;
import pt.it.av.atnog.extractors.VNFExtractor;
import pt.it.av.atnog.nsdescriptor.NSDescriptor;
import pt.it.av.atnog.requirements.NSRequirements;
import pt.it.av.atnog.requirements.VNFRequirements;
import pt.it.av.atnog.vnfdescriptor.VNFDescriptor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Example {
    private static URL pingVnfUrl;
    private static URL pongVnfUrl;
    private static URL pingPongNsUrl;

    public static void main(String[] args) throws IOException {
        pingVnfUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/ping_vnf.tar.gz");
        pongVnfUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/pong_vnf.tar.gz");
        pingPongNsUrl = new URL("https://osm-download.etsi.org/ftp/examples/ping_pong_ns/ping_pong_ns.tar.gz");

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

        VNFExtractor vnfExtract = new VNFExtractor(pingVnfFile);
        VNFDescriptor pingVnfDescriptor = vnfExtract.extractDescriptor();
        VNFRequirements pingVnfRequirements = new VNFRequirements(pingVnfDescriptor);

        vnfExtract = new VNFExtractor(pongVnfFile);
        VNFDescriptor pongVnfDescriptor = vnfExtract.extractDescriptor();
        VNFRequirements pongVnfRequirements = new VNFRequirements(pongVnfDescriptor);

        List<VNFDescriptor> vnfDescriptorList = new ArrayList<>();
        vnfDescriptorList.add(pingVnfDescriptor);
        vnfDescriptorList.add(pongVnfDescriptor);

        NSExtractor nsExtractor = new NSExtractor(pingPongNsFile);
        NSDescriptor pingPongNsDescriptor = nsExtractor.extractDescriptor();
        NSRequirements pingPongNsRequirements = new NSRequirements(pingPongNsDescriptor, vnfDescriptorList);

        System.out.println("Presenting requirements:");

        System.out.println("Ping VNF: " + pingVnfRequirements.toHTML());
        System.out.println("Pong VNF: " + pongVnfRequirements.toHTML());
        System.out.println("Ping Pong NS: " + pingPongNsRequirements.toHTML());

        System.out.println("Unknown fields:");

        System.out.println("Ping VNF: " + pingVnfRequirements.unknownFields);
        System.out.println("Pong VNF: " + pongVnfRequirements.unknownFields);
        System.out.println("Ping Pong NS: " + pingPongNsRequirements.unknownFields);
    }
}
