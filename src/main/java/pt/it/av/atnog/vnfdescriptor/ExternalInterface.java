package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ExternalInterface {
    @JsonIgnore
    public String name;

    @JsonIgnore
    public VirtualInterface virtualInterface;

    @JsonIgnore
    public String vnfdConnectionPointReference;

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:virtual-interface")
    public void setVirtualInterface_1(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
    }

    @JsonSetter("virtual-interface")
    public void setVirtualInterface_2(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
    }

    @JsonSetter("vnfd:vnfd-connection-point-ref")
    public void setVnfdConnectionPointReference_1(String vnfdConnectionPointReference) {
        this.vnfdConnectionPointReference = vnfdConnectionPointReference;
    }

    @JsonSetter("vnfd-connection-point-ref")
    public void setVnfdConnectionPointReference_2(String vnfdConnectionPointReference) {
        this.vnfdConnectionPointReference = vnfdConnectionPointReference;
    }

    @Override
    public String toString() {
        return "ExternalInterface{" +
                "name='" + name + '\'' +
                ", virtualInterface=" + virtualInterface +
                ", vnfdConnectionPointReference='" + vnfdConnectionPointReference + '\'' +
                '}';
    }
}
