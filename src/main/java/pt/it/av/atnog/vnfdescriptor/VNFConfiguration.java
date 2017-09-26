package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class VNFConfiguration {
    @JsonIgnore
    public ConfigurationAttributes configurationAttributes;

    @JsonIgnore
    public List<ServicePrimitive> servicePrimitives;

    @JsonIgnore
    public List<InitialConfigurationPrimitive> initialConfigurationPrimitives;

    @JsonIgnore
    public JujuCharm jujuCharm;

    @JsonSetter("vnfd:config-attributes")
    public void setConfigurationAttributes_1(ConfigurationAttributes configurationAttributes) {
        this.configurationAttributes = configurationAttributes;
    }

    @JsonSetter("config-attributes")
    public void setConfigurationAttributes_2(ConfigurationAttributes configurationAttributes) {
        this.configurationAttributes = configurationAttributes;
    }

    @JsonSetter("vnfd:service-primitive")
    public void setServicePrimitives_1(List<ServicePrimitive> servicePrimitives) {
        this.servicePrimitives = servicePrimitives;
    }

    @JsonSetter("service-primitive")
    public void setServicePrimitives_2(List<ServicePrimitive> servicePrimitives) {
        this.servicePrimitives = servicePrimitives;
    }

    @JsonSetter("vnfd:initial-config-primitive")
    public void setInitialConfigurationPrimitives_1(List<InitialConfigurationPrimitive> initialConfigurationPrimitives) {
        this.initialConfigurationPrimitives = initialConfigurationPrimitives;
    }

    @JsonSetter("initial-config-primitive")
    public void setInitialConfigurationPrimitives_2(List<InitialConfigurationPrimitive> initialConfigurationPrimitives) {
        this.initialConfigurationPrimitives = initialConfigurationPrimitives;
    }

    @JsonSetter("vnfd:juju")
    public void setJujuCharm_1(JujuCharm jujuCharm) {
        this.jujuCharm = jujuCharm;
    }

    @JsonSetter("juju")
    public void setJujuCharm_2(JujuCharm jujuCharm) {
        this.jujuCharm = jujuCharm;
    }

    @Override
    public String toString() {
        return "VNFConfiguration{" +
                "configurationAttributes=" + configurationAttributes +
                ", servicePrimitives=" + servicePrimitives +
                ", initialConfigurationPrimitives=" + initialConfigurationPrimitives +
                ", jujuCharm=" + jujuCharm +
                '}';
    }
}
