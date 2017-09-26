package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ServicePrimitiveParameter {
    @JsonIgnore
    public String dataType;

    @JsonIgnore
    public String defaultValue;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public Boolean readOnly = false;

    @JsonSetter("vnfd:data-type")
    public void setDataType_1(String dataType) {
        this.dataType = dataType;
    }

    @JsonSetter("data-type")
    public void setDataType_2(String dataType) {
        this.dataType = dataType;
    }

    @JsonSetter("vnfd:default-value")
    public void setDefaultValue_1(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonSetter("default-value")
    public void setDefaultValue_2(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:read-only")
    public void setReadOnly_1(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonSetter("read-only")
    public void setReadOnly_2(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        return "ServicePrimitiveParameter{" +
                "dataType='" + dataType + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                ", name='" + name + '\'' +
                ", readOnly=" + readOnly +
                '}';
    }
}
