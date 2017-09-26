package pt.it.av.atnog.vnfdescriptor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HTTPEndpoint {
    @JsonIgnore
    public String path;

    @JsonIgnore
    public Integer pollingIntervalSecs;

    @JsonIgnore
    public Integer port;

    @JsonSetter("vnfd:path")
    public void setPath_1(String path) {
        this.path = path;
    }

    @JsonSetter("path")
    public void setPath_2(String path) {
        this.path = path;
    }

    @JsonSetter("vnfd:polling_interval_secs")
    public void setPollingIntervalSecs_1(Integer pollingIntervalSecs) {
        this.pollingIntervalSecs = pollingIntervalSecs;
    }

    @JsonSetter("polling_interval_secs")
    public void setPollingIntervalSecs_2(Integer pollingIntervalSecs) {
        this.pollingIntervalSecs = pollingIntervalSecs;
    }

    @JsonSetter("vnfd:port")
    public void setPort_1(Integer port) {
        this.port = port;
    }

    @JsonSetter("port")
    public void setPort_2(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "HTTPEndpoint{" +
                "path='" + path + '\'' +
                ", pollingIntervalSecs=" + pollingIntervalSecs +
                ", port=" + port +
                '}';
    }
}
