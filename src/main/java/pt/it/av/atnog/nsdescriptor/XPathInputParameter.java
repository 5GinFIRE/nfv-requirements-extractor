package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class XPathInputParameter {
    @JsonIgnore
    public String xpath;

    @JsonSetter("nsd:xpath")
    public void setXpath_1(String xpath) {
        this.xpath = xpath;
    }

    @JsonSetter("xpath")
    public void setXpath_2(String xpath) {
        this.xpath = xpath;
    }

    @Override
    public String toString() {
        return "XPathInputParameter{" +
                "xpath='" + xpath + '\'' +
                '}';
    }
}
