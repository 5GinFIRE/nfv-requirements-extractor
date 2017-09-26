package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

public class VNFDescriptor {
    @JsonIgnore
    public String id;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public String shortName;

    @JsonIgnore
    public String logo;

    @JsonIgnore
    public String vendor;

    @JsonIgnore
    public String version;

    @JsonIgnore
    public String description;

    @JsonIgnore
    public List<ConnectionPoint> connectionPoints;

    @JsonIgnore
    public List<HTTPEndpoint> httpEndpoints;

    @JsonIgnore
    public ManagementInterface managementInterface;

    @JsonIgnore
    public List<PlacementGroup> placementGroups;

    @JsonIgnore
    public List<VDU> vduList = new ArrayList<>();

    @JsonIgnore
    public VNFConfiguration vnfConfiguration;

    @JsonSetter("vnfd:id")
    public void setId_1(String id) {
        this.id = id;
    }

    @JsonSetter("id")
    public void setId_2(String id) {
        this.id = id;
    }

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:short-name")
    public void setShortName_1(String shortName) {
        this.shortName = shortName;
    }

    @JsonSetter("short-name")
    public void setShortName_2(String shortName) {
        this.shortName = shortName;
    }

    @JsonSetter("vnfd:logo")
    public void setLogo_1(String logo) {
        this.logo = logo;
    }

    @JsonSetter("logo")
    public void setLogo_2(String logo) {
        this.logo = logo;
    }

    @JsonSetter("vnfd:vendor")
    public void setVendor_1(String vendor) {
        this.vendor = vendor;
    }

    @JsonSetter("vendor")
    public void setVendor_2(String vendor) {
        this.vendor = vendor;
    }

    @JsonSetter("vnfd:version")
    public void setVersion_1(String version) {
        this.version = version;
    }

    @JsonSetter("version")
    public void setVersion_2(String version) {
        this.version = version;
    }

    @JsonSetter("vnfd:description")
    public void setDescription_1(String description) {
        this.description = description;
    }

    @JsonSetter("description")
    public void setDescription_2(String description) {
        this.description = description;
    }

    @JsonSetter("vnfd:connection-point")
    public void setConnectionPoints_1(List<ConnectionPoint> connectionPoints) {
        this.connectionPoints = connectionPoints;
    }

    @JsonSetter("connection-point")
    public void setConnectionPoints_2(List<ConnectionPoint> connectionPoints) {
        this.connectionPoints = connectionPoints;
    }

    @JsonSetter("vnfd:http-endpoint")
    public void setHttpEndpoints_1(List<HTTPEndpoint> httpEndpoints) {
        this.httpEndpoints = httpEndpoints;
    }

    @JsonSetter("http-endpoint")
    public void setHttpEndpoints_2(List<HTTPEndpoint> httpEndpoints) {
        this.httpEndpoints = httpEndpoints;
    }

    @JsonSetter("vnfd:mgmt-interface")
    public void setManagementInterface_1(ManagementInterface managementInterface) {
        this.managementInterface = managementInterface;
    }

    @JsonSetter("mgmt-interface")
    public void setManagementInterface_2(ManagementInterface managementInterface) {
        this.managementInterface = managementInterface;
    }

    @JsonSetter("vnfd:placement-groups")
    public void setPlacementGroups_1(List<PlacementGroup> placementGroups) {
        this.placementGroups = placementGroups;
    }

    @JsonSetter("placement-groups")
    public void setPlacementGroups_2(List<PlacementGroup> placementGroups) {
        this.placementGroups = placementGroups;
    }

    @JsonSetter("vnfd:vdu")
    public void setVduList_1(List<VDU> vduList) {
        this.vduList = vduList;
    }

    @JsonSetter("vdu")
    public void setVduList_2(List<VDU> vduList) {
        this.vduList = vduList;
    }

    @JsonSetter("vnfd:vnf-configuration")
    public void setVnfConfiguration_1(VNFConfiguration vnfConfiguration) {
        this.vnfConfiguration = vnfConfiguration;
    }

    @JsonSetter("vnf-configuration")
    public void setVnfConfiguration_2(VNFConfiguration vnfConfiguration) {
        this.vnfConfiguration = vnfConfiguration;
    }

    @Override
    public String toString() {
        return "VNFDescriptor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", logo='" + logo + '\'' +
                ", vendor='" + vendor + '\'' +
                ", version='" + version + '\'' +
                ", description='" + description + '\'' +
                ", connectionPoints=" + connectionPoints +
                ", httpEndpoints=" + httpEndpoints +
                ", managementInterface=" + managementInterface +
                ", placementGroups=" + placementGroups +
                ", vduList=" + vduList +
                ", vnfConfiguration=" + vnfConfiguration +
                '}';
    }
}
