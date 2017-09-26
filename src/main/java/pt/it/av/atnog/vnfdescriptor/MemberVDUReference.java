package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MemberVDUReference {
    @JsonIgnore
    public String reference;

    @JsonSetter("vnfd:member-vdu-ref")
    public void setReference_1(String reference) {
        this.reference = reference;
    }

    @JsonSetter("member-vdu-ref")
    public void setReference_2(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "MemberVDUReference{" +
                "reference='" + reference + '\'' +
                '}';
    }
}
