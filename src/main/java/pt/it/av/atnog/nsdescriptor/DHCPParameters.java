package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DHCPParameters {
    @JsonIgnore
    public Integer count;

    @JsonIgnore
    public String startAddress;

    @JsonSetter("nsd:count")
    public void setCount_1(Integer count) {
        this.count = count;
    }

    @JsonSetter("count")
    public void setCount_2(Integer count) {
        this.count = count;
    }

    @JsonSetter("nsd:start-address")
    public void setStartAddress_1(String startAddress) {
        this.startAddress = startAddress;
    }

    @JsonSetter("start-address")
    public void setStartAddress_2(String startAddress) {
        this.startAddress = startAddress;
    }

    @Override
    public String toString() {
        return "DHCPParameters{" +
                "count=" + count +
                ", startAddress='" + startAddress + '\'' +
                '}';
    }
}
