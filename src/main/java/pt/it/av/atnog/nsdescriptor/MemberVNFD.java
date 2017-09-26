package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MemberVNFD {
    @JsonIgnore
    public Integer indexReference;

    @JsonIgnore
    public String reference;

    @JsonSetter("nsd:member-vnf-index-ref")
    public void setIndexReference_1(Integer indexReference) {
        this.indexReference = indexReference;
    }

    @JsonSetter("member-vnf-index-ref")
    public void setIndexReference_2(Integer indexReference) {
        this.indexReference = indexReference;
    }

    @JsonSetter("nsd:vnfd-id-ref")
    public void setReference_1(String reference) {
        this.reference = reference;
    }

    @JsonSetter("vnfd-id-ref")
    public void setReference_2(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "MemberVNFD{" +
                "indexReference=" + indexReference +
                ", reference='" + reference + '\'' +
                '}';
    }
}
