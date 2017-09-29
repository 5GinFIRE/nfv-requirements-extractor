package pt.it.av.atnog.requirements;

import pt.it.av.atnog.nsdescriptor.ConstituentVNFD;
import pt.it.av.atnog.nsdescriptor.NSDescriptor;
import pt.it.av.atnog.vnfdescriptor.VNFDescriptor;

import java.util.Formatter;
import java.util.List;

public class NSRequirements {
    public NSDescriptor nsDescriptor;
    public List<VNFDescriptor> vnfDescriptors;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;

    public NSRequirements(NSDescriptor nsDescriptor, List<VNFDescriptor> vnfDescriptors) {
        this.nsDescriptor = nsDescriptor;
        this.vnfDescriptors = vnfDescriptors;

        this.unknownFields = this.nsDescriptor.unknownFields;
        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;

        for(ConstituentVNFD vnfd : nsDescriptor.constituentVNFDs) {
            for(VNFDescriptor vnf : vnfDescriptors) {
                if(vnfd.vnfdIdentifierReference.equals(vnf.id)) {
                    VNFRequirements requirements = new VNFRequirements(vnf);

                    this.unknownFields |= requirements.unknownFields;
                    this.memoryMB += requirements.memoryMB;
                    this.storageGB += requirements.storageGB;
                    this.vcpuCount += requirements.vcpuCount;
                    this.vmCount += requirements.vmCount;
                }
            }
        }
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", this.nsDescriptor.name);
        fmt.format("<b>%s: </b>%d<br>", "VNF Count", this.nsDescriptor.constituentVNFDs.size());
        fmt.format("<b>%s: </b>%d<br>", "VM Count", this.vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", this.vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", this.memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", this.storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "NSRequirements{" +
                "nsName=" + nsDescriptor.name +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
