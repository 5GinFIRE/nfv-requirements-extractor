package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConfigurationAttributes {
    @JsonIgnore
    public Integer configurationDelay;

    @JsonSetter("vnfd:config-delay")
    public void setConfigurationDelay_1(Integer configurationDelay) {
        this.configurationDelay = configurationDelay;
    }

    @JsonSetter("config-delay")
    public void setConfigurationDelay_2(Integer configurationDelay) {
        this.configurationDelay = configurationDelay;
    }

    @Override
    public String toString() {
        return "ConfigurationAttributes{" +
                "configurationDelay=" + configurationDelay +
                '}';
    }
}
