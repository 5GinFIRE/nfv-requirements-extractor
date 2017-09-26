package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VNFTopLevelContainer {
    @JsonIgnore
    public VNFDCatalog catalog;

    @JsonSetter("vnfd:vnfd-catalog")
    public void setCatalog_1(VNFDCatalog catalog) {
        this.catalog = catalog;
    }

    @JsonSetter("vnfd-catalog")
    public void setCatalog_2(VNFDCatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "TopLevelContainer{" +
                "catalog=" + catalog +
                '}';
    }
}
