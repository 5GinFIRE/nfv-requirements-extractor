package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VNFDConnectionPointReference {
    @JsonIgnore
    public Integer indexReference;

    @JsonIgnore
    public String vnfdConnectionPointReference;

    @JsonIgnore
    public String vnfdIdReference;

    @JsonSetter("nsd:member-vnf-index-ref")
    public void setIndexReference_1(Integer indexReference) {
        this.indexReference = indexReference;
    }

    @JsonSetter("member-vnf-index-ref")
    public void setIndexReference_2(Integer indexReference) {
        this.indexReference = indexReference;
    }

    @JsonSetter("nsd:vnfd-connection-point-ref")
    public void setVnfdConnectionPointReference_1(String vnfdConnectionPointReference) {
        this.vnfdConnectionPointReference = vnfdConnectionPointReference;
    }

    @JsonSetter("vnfd-connection-point-ref")
    public void setVnfdConnectionPointReference_2(String vnfdConnectionPointReference) {
        this.vnfdConnectionPointReference = vnfdConnectionPointReference;
    }

    @JsonSetter("nsd:vnfd-id-ref")
    public void setVnfdIdReference_1(String vnfdIdReference) {
        this.vnfdIdReference = vnfdIdReference;
    }

    @JsonSetter("vnfd-id-ref")
    public void setVnfdIdReference_2(String vnfdIdReference) {
        this.vnfdIdReference = vnfdIdReference;
    }

    @Override
    public String toString() {
        return "VNFDConnectionPointReference{" +
                "indexReference=" + indexReference +
                ", vnfdConnectionPointReference='" + vnfdConnectionPointReference + '\'' +
                ", vnfdIdReference='" + vnfdIdReference + '\'' +
                '}';
    }
}
