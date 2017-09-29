package pt.it.av.atnog.requirements;

import pt.it.av.atnog.vnfdescriptor.VDU;
import pt.it.av.atnog.vnfdescriptor.VNFDescriptor;

import java.util.Formatter;

public class VNFRequirements {
    public VNFDescriptor descriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;

    public VNFRequirements(VNFDescriptor descriptor) {
        this.descriptor = descriptor;

        this.unknownFields = this.descriptor.unknownFields;
        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;

        for(VDU vdu : descriptor.vduList) {
            this.memoryMB += vdu.count * vdu.vmFlavor.memoryMb;
            this.storageGB += vdu.count * vdu.vmFlavor.storageGb;
            this.vcpuCount += vdu.count * vdu.vmFlavor.vcpuCount;
            this.vmCount += vdu.count;
        }
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", descriptor.name);
        fmt.format("<b>%s: </b>%d<br>", "VM Count", this.vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", this.vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", this.memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", this.storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "VNFRequirements{" +
                "vnfName=" + descriptor.name +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
