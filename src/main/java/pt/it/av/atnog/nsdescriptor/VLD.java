package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class VLD {
    @JsonIgnore
    public String id;

    @JsonIgnore
    public String description;

    @JsonIgnore
    public String ipProfileReference;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public String shortName;

    @JsonIgnore
    public String type;

    @JsonIgnore
    public String vendor;

    @JsonIgnore
    public String version;

    @JsonIgnore
    public Boolean managementNetwork = false;

    @JsonIgnore
    public List<VNFDConnectionPointReference> vnfdConnectionPointReferenceList;

    @JsonSetter("nsd:id")
    public void setId_1(String id) {
        this.id = id;
    }

    @JsonSetter("id")
    public void setId_2(String id) {
        this.id = id;
    }

    @JsonSetter("nsd:description")
    public void setDescription_1(String description) {
        this.description = description;
    }

    @JsonSetter("description")
    public void setDescription_2(String description) {
        this.description = description;
    }

    @JsonSetter("nsd:ip-profile-ref")
    public void setIpProfileReference_1(String ipProfileReference) {
        this.ipProfileReference = ipProfileReference;
    }

    @JsonSetter("ip-profile-ref")
    public void setIpProfileReference_2(String ipProfileReference) {
        this.ipProfileReference = ipProfileReference;
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

    @JsonSetter("nsd:type")
    public void setType_1(String type) {
        this.type = type;
    }

    @JsonSetter("type")
    public void setType_2(String type) {
        this.type = type;
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

    @JsonSetter("nsd:mgmt-network")
    public void setManagementNetwork_1(Boolean managementNetwork) {
        this.managementNetwork = managementNetwork;
    }

    @JsonSetter("mgmt-network")
    public void setManagementNetwork_2(Boolean managementNetwork) {
        this.managementNetwork = managementNetwork;
    }

    @JsonSetter("nsd:vnfd-connection-point-ref")
    public void setVnfdConnectionPointReferenceList_1(List<VNFDConnectionPointReference> vnfdConnectionPointReferenceList) {
        this.vnfdConnectionPointReferenceList = vnfdConnectionPointReferenceList;
    }

    @JsonSetter("vnfd-connection-point-ref")
    public void setVnfdConnectionPointReferenceList_2(List<VNFDConnectionPointReference> vnfdConnectionPointReferenceList) {
        this.vnfdConnectionPointReferenceList = vnfdConnectionPointReferenceList;
    }

    @Override
    public String toString() {
        return "VLD{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", ipProfileReference='" + ipProfileReference + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", type='" + type + '\'' +
                ", vendor='" + vendor + '\'' +
                ", version='" + version + '\'' +
                ", managementNetwork=" + managementNetwork +
                ", vnfdConnectionPointReferenceList=" + vnfdConnectionPointReferenceList +
                '}';
    }
}
