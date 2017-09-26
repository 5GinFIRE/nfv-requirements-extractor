package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPProfile {
    @JsonIgnore
    public String description;

    @JsonIgnore
    public IPProfileParameters ipProfileParameters;

    @JsonIgnore
    public String name;

    @JsonSetter("nsd:description")
    public void setDescription_1(String description) {
        this.description = description;
    }

    @JsonSetter("description")
    public void setDescription_2(String description) {
        this.description = description;
    }

    @JsonSetter("nsd:ip-profile-params")
    public void setIpProfileParameters_1(IPProfileParameters ipProfileParameters) {
        this.ipProfileParameters = ipProfileParameters;
    }

    @JsonSetter("ip-profile-params")
    public void setIpProfileParameters_2(IPProfileParameters ipProfileParameters) {
        this.ipProfileParameters = ipProfileParameters;
    }

    @JsonSetter("nsd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IPProfile{" +
                "description='" + description + '\'' +
                ", ipProfileParameters=" + ipProfileParameters +
                ", name='" + name + '\'' +
                '}';
    }
}
