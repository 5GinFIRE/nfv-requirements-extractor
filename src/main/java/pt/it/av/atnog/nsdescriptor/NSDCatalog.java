package pt.it.av.atnog.nsdescriptor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NSDCatalog {
    @JsonIgnore
    public List<NSDescriptor> descriptors;

    @JsonSetter("nsd:nsd")
    public void setDescriptors_1(List<NSDescriptor> nsDescriptors) {
        this.descriptors = nsDescriptors;
    }

    @JsonSetter("nsd")
    public void setDescriptors_2(List<NSDescriptor> nsDescriptors) {
        this.descriptors = nsDescriptors;
    }

    @Override
    public String toString() {
        return "NSDCatalog{" +
                "descriptors=" + descriptors +
                '}';
    }
}
