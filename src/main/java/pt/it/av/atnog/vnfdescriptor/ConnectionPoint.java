package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConnectionPoint {
    @JsonIgnore
    public String name;

    @JsonIgnore
    public String type;

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

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
        return "ConnectionPoint{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
