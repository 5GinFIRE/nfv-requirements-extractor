package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class PlacementGroup {
    @JsonIgnore
    public List<MemberVDUReference> memberVDUs;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public String requirement;

    @JsonIgnore
    public String strategy;

    @JsonSetter("vnfd:member-vdus")
    public void setMemberVDUs_1(List<MemberVDUReference> memberVDUs) {
        this.memberVDUs = memberVDUs;
    }

    @JsonSetter("member-vdus")
    public void setMemberVDUs_2(List<MemberVDUReference> memberVDUs) {
        this.memberVDUs = memberVDUs;
    }

    @JsonSetter("vnfd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("vnfd:requirement")
    public void setRequirement_1(String requirement) {
        this.requirement = requirement;
    }

    @JsonSetter("requirement")
    public void setRequirement_2(String requirement) {
        this.requirement = requirement;
    }

    @JsonSetter("vnfd:strategy")
    public void setStrategy_1(String strategy) {
        this.strategy = strategy;
    }

    @JsonSetter("strategy")
    public void setStrategy_2(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "PlacementGroup{" +
                "memberVDUs=" + memberVDUs +
                ", name='" + name + '\'' +
                ", requirement='" + requirement + '\'' +
                ", strategy='" + strategy + '\'' +
                '}';
    }
}
