package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitialConfigurationPrimitiveParameter {
    @JsonProperty("nsd:name")
    public String name;

    @JsonProperty("nsd:value")
    public String value;

    @Override
    public String toString() {
        return "InitialConfigurationPrimitiveParameter{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
