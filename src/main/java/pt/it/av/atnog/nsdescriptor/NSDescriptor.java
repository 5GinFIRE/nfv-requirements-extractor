package pt.it.av.atnog.nsdescriptor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NSDescriptor {
    @JsonIgnore
    public String id;

    @JsonIgnore
    public String logo;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public String shortName;

    @JsonIgnore
    public String vendor;

    @JsonIgnore
    public String version;

    @JsonIgnore
    public String description;

    @JsonIgnore
    public List<ConstituentVNFD> constituentVNFDs;

    @JsonIgnore
    public List<InitialConfigurationPrimitive> initialConfigurationPrimitives;

    @JsonIgnore
    public List<XPathInputParameter> xpathInputParameters;

    @JsonIgnore
    public List<IPProfile> ipProfiles;

    @JsonIgnore
    public List<PlacementGroup> placementGroups;

    @JsonIgnore
    public List<VLD> vldList;

    @JsonIgnore
    public boolean unknownFields;

    @JsonSetter("nsd:id")
    public void setId_1(String id) {
        this.id = id;
    }

    @JsonSetter("id")
    public void setId_2(String id) {
        this.id = id;
    }

    @JsonSetter("nsd:logo")
    public void setLogo_1(String logo) {
        this.logo = logo;
    }

    @JsonSetter("logo")
    public void setLogo_2(String logo) {
        this.logo = logo;
    }

    @JsonSetter("nsd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("nsd:short-name")
    public void setShortName_1(String shortName) {
        this.shortName = shortName;
    }

    @JsonSetter("short-name")
    public void setShortName_2(String shortName) {
        this.shortName = shortName;
    }

    @JsonSetter("nsd:vendor")
    public void setVendor_1(String vendor) {
        this.vendor = vendor;
    }

    @JsonSetter("vendor")
    public void setVendor_2(String vendor) {
        this.vendor = vendor;
    }

    @JsonSetter("nsd:version")
    public void setVersion_1(String version) {
        this.version = version;
    }

    @JsonSetter("version")
    public void setVersion_2(String version) {
        this.version = version;
    }

    @JsonSetter("nsd:description")
    public void setDescription_1(String description) {
        this.description = description;
    }

    @JsonSetter("description")
    public void setDescription_2(String description) {
        this.description = description;
    }

    @JsonSetter("nsd:constituent-vnfd")
    public void setConstituentVNFDs_1(List<ConstituentVNFD> constituentVNFDs) {
        this.constituentVNFDs = constituentVNFDs;
    }

    @JsonSetter("constituent-vnfd")
    public void setConstituentVNFDs_2(List<ConstituentVNFD> constituentVNFDs) {
        this.constituentVNFDs = constituentVNFDs;
    }

    @JsonSetter("nsd:initial-config-primitive")
    public void setInitialConfigurationPrimitives_1(List<InitialConfigurationPrimitive> initialConfigurationPrimitives) {
        this.initialConfigurationPrimitives = initialConfigurationPrimitives;
    }

    @JsonSetter("initial-config-primitive")
    public void setInitialConfigurationPrimitives_2(List<InitialConfigurationPrimitive> initialConfigurationPrimitives) {
        this.initialConfigurationPrimitives = initialConfigurationPrimitives;
    }

    @JsonSetter("nsd:input-parameter-xpath")
    public void setXpathInputParameters_1(List<XPathInputParameter> xpathInputParameters) {
        this.xpathInputParameters = xpathInputParameters;
    }

    @JsonSetter("input-parameter-xpath")
    public void setXpathInputParameters_2(List<XPathInputParameter> xpathInputParameters) {
        this.xpathInputParameters = xpathInputParameters;
    }

    @JsonSetter("nsd:ip-profiles")
    public void setIpProfiles_1(List<IPProfile> ipProfiles) {
        this.ipProfiles = ipProfiles;
    }

    @JsonSetter("ip-profiles")
    public void setIpProfiles_2(List<IPProfile> ipProfiles) {
        this.ipProfiles = ipProfiles;
    }

    @JsonSetter("nsd:placement-groups")
    public void setPlacementGroups_1(List<PlacementGroup> placementGroups) {
        this.placementGroups = placementGroups;
    }

    @JsonSetter("placement-groups")
    public void setPlacementGroups_2(List<PlacementGroup> placementGroups) {
        this.placementGroups = placementGroups;
    }

    @JsonSetter("nsd:vld")
    public void setVldList_1(List<VLD> vldList) {
        this.vldList = vldList;
    }

    @JsonSetter("vld")
    public void setVldList_2(List<VLD> vldList) {
        this.vldList = vldList;
    }

    @Override
    public String toString() {
        return "NSDescriptor{" +
                "id='" + id + '\'' +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", vendor='" + vendor + '\'' +
                ", version='" + version + '\'' +
                ", description='" + description + '\'' +
                ", constituentVNFDs=" + constituentVNFDs +
                ", initialConfigurationPrimitives=" + initialConfigurationPrimitives +
                ", xpathInputParameters=" + xpathInputParameters +
                ", ipProfiles=" + ipProfiles +
                ", placementGroups=" + placementGroups +
                ", vldList=" + vldList +
                '}';
    }
}
