package pt.it.av.atnog.nsdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class PlacementGroup {
    @JsonIgnore
    public List<MemberVNFD> memberVNFDs;

    @JsonIgnore
    public String name;

    @JsonIgnore
    public String requirement;

    @JsonIgnore
    public String strategy;

    @JsonSetter("nsd:member-vnfd")
    public void setMemberVNFDs_1(List<MemberVNFD> memberVNFDs) {
        this.memberVNFDs = memberVNFDs;
    }

    @JsonSetter("member-vnfd")
    public void setMemberVNFDs_2(List<MemberVNFD> memberVNFDs) {
        this.memberVNFDs = memberVNFDs;
    }

    @JsonSetter("nsd:name")
    public void setName_1(String name) {
        this.name = name;
    }

    @JsonSetter("name")
    public void setName_2(String name) {
        this.name = name;
    }

    @JsonSetter("nsd:requirement")
    public void setRequirement_1(String requirement) {
        this.requirement = requirement;
    }

    @JsonSetter("requirement")
    public void setRequirement_2(String requirement) {
        this.requirement = requirement;
    }

    @JsonSetter("nsd:strategy")
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
                "memberVNFDs=" + memberVNFDs +
                ", name='" + name + '\'' +
                ", requirement='" + requirement + '\'' +
                ", strategy='" + strategy + '\'' +
                '}';
    }
}
