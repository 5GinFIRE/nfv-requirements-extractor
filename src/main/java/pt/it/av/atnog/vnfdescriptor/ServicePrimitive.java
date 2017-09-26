package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class ServicePrimitive {
    @JsonIgnore
    public String name;

    @JsonIgnore
    public List<ServicePrimitiveParameter> parameters;

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:parameter")
    public void setParameters_1(List<ServicePrimitiveParameter> parameters) {
        this.parameters = parameters;
    }

    @JsonSetter("parameter")
    public void setParameters_2(List<ServicePrimitiveParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "ServicePrimitive{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
