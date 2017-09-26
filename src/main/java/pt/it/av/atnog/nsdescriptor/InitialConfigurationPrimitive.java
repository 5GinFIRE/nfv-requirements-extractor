package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class InitialConfigurationPrimitive {
    @JsonIgnore
    public String name;

    @JsonIgnore
    public List<InitialConfigurationPrimitiveParameter> parameters;

    @JsonIgnore
    public Integer sequence;

    @JsonIgnore
    public String userDefinedScript;

    @JsonSetter("nsd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("nsd:parameter")
    public void setParameters_1(List<InitialConfigurationPrimitiveParameter> parameters) {
        this.parameters = parameters;
    }

    @JsonSetter("parameter")
    public void setParameters_2(List<InitialConfigurationPrimitiveParameter> parameters) {
        this.parameters = parameters;
    }

    @JsonSetter("nsd:seq")
    public void setSequence_1(Integer sequence) {
        this.sequence = sequence;
    }

    @JsonSetter("seq")
    public void setSequence_2(Integer sequence) {
        this.sequence = sequence;
    }

    @JsonSetter("nsd:user-defined-script")
    public void setUserDefinedScript_1(String userDefinedScript) {
        this.userDefinedScript = userDefinedScript;
    }

    @JsonSetter("user-defined-script")
    public void setUserDefinedScript_2(String userDefinedScript) {
        this.userDefinedScript = userDefinedScript;
    }

    @Override
    public String toString() {
        return "InitialConfigurationPrimitive{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                ", sequence=" + sequence +
                ", userDefinedScript='" + userDefinedScript + '\'' +
                '}';
    }
}
