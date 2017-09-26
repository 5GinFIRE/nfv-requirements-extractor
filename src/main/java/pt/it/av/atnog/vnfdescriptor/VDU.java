package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class VDU {
    @JsonIgnore
    public String cloudInitFile;

    @JsonIgnore
    public Integer count = 0;

    @JsonIgnore
    public List<ExternalInterface> externalInterfaces;

    @JsonIgnore
    public String identifier;

    @JsonIgnore
    public String image;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public VMFlavor vmFlavor = new VMFlavor();

    @JsonSetter("vnfd:cloud-init-file")
    public void setCloudInitFile_1(String cloudInitFile) {
        this.cloudInitFile = cloudInitFile;
    }

    @JsonSetter("cloud-init-file")
    public void setCloudInitFile_2(String cloudInitFile) {
        this.cloudInitFile = cloudInitFile;
    }

    @JsonSetter("vnfd:count")
    public void setCount_1(Integer count) {
        this.count = count;
    }

    @JsonSetter("count")
    public void setCount_2(Integer count) {
        this.count = count;
    }

    @JsonSetter("vnfd:external-interface")
    public void setExternalInterfaces_1(List<ExternalInterface> externalInterfaces) {
        this.externalInterfaces = externalInterfaces;
    }

    @JsonSetter("external-interface")
    public void setExternalInterfaces_2(List<ExternalInterface> externalInterfaces) {
        this.externalInterfaces = externalInterfaces;
    }

    @JsonSetter("vnfd:id")
    public void setIdentifier_1(String identifier) {
        this.identifier = identifier;
    }

    @JsonSetter("id")
    public void setIdentifier_2(String identifier) {
        this.identifier = identifier;
    }

    @JsonSetter("vnfd:image")
    public void setImage_1(String image) {
        this.image = image;
    }

    @JsonSetter("image")
    public void setImage_2(String image) {
        this.image = image;
    }

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:vm-flavor")
    public void setVmFlavor_1(VMFlavor vmFlavor) {
        this.vmFlavor = vmFlavor;
    }

    @JsonSetter("vm-flavor")
    public void setVmFlavor_2(VMFlavor vmFlavor) {
        this.vmFlavor = vmFlavor;
    }

    @Override
    public String toString() {
        return "VDU{" +
                "cloudInitFile='" + cloudInitFile + '\'' +
                ", count=" + count +
                ", externalInterfaces=" + externalInterfaces +
                ", identifier='" + identifier + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", vmFlavor=" + vmFlavor +
                '}';
    }
}
