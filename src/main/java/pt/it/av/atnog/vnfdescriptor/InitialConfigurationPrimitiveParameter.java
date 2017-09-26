package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InitialConfigurationPrimitiveParameter {
    @JsonIgnore
    public String name;

    @JsonIgnore
    public String value;

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:value")
    public void setValue_1(String value) {
        this.value = value;
    }

    @JsonSetter("value")
    public void setValue_2(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "InitialConfigurationPrimitiveParameter{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
