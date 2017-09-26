package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConstituentVNFD {
    @JsonIgnore
    public Integer memberVNFIndex;

    @JsonIgnore
    public String vnfdIdentifierReference;

    @JsonSetter("nsd:member-vnf-index")
    public void setMemberVNFIndex_1(Integer memberVNFIndex) {
        this.memberVNFIndex = memberVNFIndex;
    }

    @JsonSetter("member-vnf-index")
    public void setMemberVNFIndex_2(Integer memberVNFIndex) {
        this.memberVNFIndex = memberVNFIndex;
    }

    @JsonSetter("nsd:vnfd-id-ref")
    public void setVnfdIdentifierReference_1(String vnfdIdentifierReference) {
        this.vnfdIdentifierReference = vnfdIdentifierReference;
    }

    @JsonSetter("vnfd-id-ref")
    public void setVnfdIdentifierReference_2(String vnfdIdentifierReference) {
        this.vnfdIdentifierReference = vnfdIdentifierReference;
    }

    @Override
    public String toString() {
        return "ConstituentVNFD{" +
                "memberVNFIndex=" + memberVNFIndex +
                ", vnfdIdentifierReference='" + vnfdIdentifierReference + '\'' +
                '}';
    }
}
