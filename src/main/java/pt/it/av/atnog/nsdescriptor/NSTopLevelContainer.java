package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NSTopLevelContainer {
    @JsonIgnore
    public NSDCatalog catalog;

    @JsonSetter("nsd:nsd-catalog")
    public void setCatalog_1(NSDCatalog nsdCatalog) {
        this.catalog = nsdCatalog;
    }

    @JsonSetter("nsd-catalog")
    public void setCatalog_2(NSDCatalog nsdCatalog) {
        this.catalog = nsdCatalog;
    }

    @Override
    public String toString() {
        return "NSTopLevelContainer{" +
                "catalog=" + catalog +
                '}';
    }
}
