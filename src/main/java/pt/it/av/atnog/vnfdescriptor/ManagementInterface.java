package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ManagementInterface {
    @JsonIgnore
    public DashboardParameters dashboardParameters;

    @JsonIgnore
    public Integer port;

    @JsonIgnore
    public String vduIdentification;

    @JsonSetter("vnfd:dashboard-params")
    public void setDashboardParameters_1(DashboardParameters dashboardParameters) {
        this.dashboardParameters = dashboardParameters;
    }

    @JsonSetter("dashboard-params")
    public void setDashboardParameters_2(DashboardParameters dashboardParameters) {
        this.dashboardParameters = dashboardParameters;
    }

    @JsonSetter("vnfd:port")
    public void setPort_1(Integer port) {
        this.port = port;
    }

    @JsonSetter("port")
    public void setPort_2(Integer port) {
        this.port = port;
    }

    @JsonSetter("vnfd:vdu-id")
    public void setVduIdentification_1(String vduIdentification) {
        this.vduIdentification = vduIdentification;
    }

    @JsonSetter("vdu-id")
    public void setVduIdentification_2(String vduIdentification) {
        this.vduIdentification = vduIdentification;
    }

    @Override
    public String toString() {
        return "ManagementInterface{" +
                "dashboardParameters=" + dashboardParameters +
                ", port=" + port +
                ", vduIdentification='" + vduIdentification + '\'' +
                '}';
    }
}
