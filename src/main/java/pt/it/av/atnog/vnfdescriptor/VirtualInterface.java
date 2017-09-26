package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VirtualInterface {
    @JsonIgnore
    public String type;

    @JsonSetter("vnfd:type")
    public void setType_1(String type) {
        this.type = type;
    }

    @JsonSetter("type")
    public void setType_2(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VirtualInterface{" +
                "type='" + type + '\'' +
                '}';
    }
}
