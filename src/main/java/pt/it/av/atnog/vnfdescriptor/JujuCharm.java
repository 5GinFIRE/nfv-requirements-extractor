package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JujuCharm {
    @JsonIgnore
    public String charm;

    @JsonSetter("vnfd:charm")
    public void setCharm_1(String charm) {
        this.charm = charm;
    }

    @JsonSetter("charm")
    public void setCharm_2(String charm) {
        this.charm = charm;
    }

    @Override
    public String toString() {
        return "JujuCharm{" +
                "charm='" + charm + '\'' +
                '}';
    }
}
