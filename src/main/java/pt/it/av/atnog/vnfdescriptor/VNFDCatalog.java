package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class VNFDCatalog {
    @JsonIgnore
    public List<VNFDescriptor> vnfDescriptors;

    @JsonSetter("vnfd:vnfd")
    public void addVNFD_1(List<VNFDescriptor> descriptors) {
        this.vnfDescriptors = descriptors;
    }

    @JsonSetter("vnfd")
    public void addVNFD_2(List<VNFDescriptor> descriptors) {
        this.vnfDescriptors = descriptors;
    }

    @Override
    public String toString() {
        return "VNFDCatalog{" +
                "vnfDescriptors=" + vnfDescriptors +
                '}';
    }
}
