package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VMFlavor {
    @JsonIgnore
    public Integer memoryMb = 0;

    @JsonIgnore
    public Integer storageGb = 0;

    @JsonIgnore
    public Integer vcpuCount = 0;

    @JsonSetter("vnfd:memory-mb")
    public void setMemoryMb_1(Integer memoryMb) {
        this.memoryMb = memoryMb;
    }

    @JsonSetter("memory-mb")
    public void setMemoryMb_2(Integer memoryMb) {
        this.memoryMb = memoryMb;
    }

    @JsonSetter("vnfd:storage-gb")
    public void setStorageGb_1(Integer storageGb) {
        this.storageGb = storageGb;
    }

    @JsonSetter("storage-gb")
    public void setStorageGb_2(Integer storageGb) {
        this.storageGb = storageGb;
    }

    @JsonSetter("vnfd:vcpu-count")
    public void setVcpuCount_1(Integer vcpuCount) {
        this.vcpuCount = vcpuCount;
    }

    @JsonSetter("vcpu-count")
    public void setVcpuCount_2(Integer vcpuCount) {
        this.vcpuCount = vcpuCount;
    }

    @Override
    public String toString() {
        return "VMFlavor{" +
                "memoryMb=" + memoryMb +
                ", storageGb=" + storageGb +
                ", vcpuCount=" + vcpuCount +
                '}';
    }
}
