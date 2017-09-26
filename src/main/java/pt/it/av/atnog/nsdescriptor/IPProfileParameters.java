package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPProfileParameters {
    @JsonIgnore
    public String gatewayAddress;

    @JsonIgnore
    public String ipVersion;

    @JsonIgnore
    public String subnetAddress;

    @JsonIgnore
    public DHCPParameters dhcpParameters;

    @JsonSetter("nsd:gateway-address")
    public void setGatewayAddress_1(String gatewayAddress) {
        this.gatewayAddress = gatewayAddress;
    }

    @JsonSetter("gateway-address")
    public void setGatewayAddress_2(String gatewayAddress) {
        this.gatewayAddress = gatewayAddress;
    }

    @JsonSetter("nsd:ip-version")
    public void setIpVersion_1(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    @JsonSetter("ip-version")
    public void setIpVersion_2(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    @JsonSetter("nsd:subnet-address")
    public void setSubnetAddress_1(String subnetAddress) {
        this.subnetAddress = subnetAddress;
    }

    @JsonSetter("subnet-address")
    public void setSubnetAddress_2(String subnetAddress) {
        this.subnetAddress = subnetAddress;
    }

    @JsonSetter("nsd:dhcp-params")
    public void setDhcpParameters_1(DHCPParameters dhcpParameters) {
        this.dhcpParameters = dhcpParameters;
    }

    @JsonSetter("dhcp-params")
    public void setDhcpParameters_2(DHCPParameters dhcpParameters) {
        this.dhcpParameters = dhcpParameters;
    }

    @Override
    public String toString() {
        return "IPProfileParameters{" +
                "gatewayAddress='" + gatewayAddress + '\'' +
                ", ipVersion='" + ipVersion + '\'' +
                ", subnetAddress='" + subnetAddress + '\'' +
                ", dhcpParameters=" + dhcpParameters +
                '}';
    }
}
