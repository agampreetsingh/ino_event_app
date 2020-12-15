
package com.inotech.management.eventapp.entities.demographics.util.entities;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Message",
    "Status",
    "PostOffice"
})
public class PincodeDetails implements Serializable
{

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PostOffice")
    private List<PostOffice> postOffice = null;
    private final static long serialVersionUID = -863405795179630036L;

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("PostOffice")
    public List<PostOffice> getPostOffice() {
        return postOffice;
    }

    @JsonProperty("PostOffice")
    public void setPostOffice(List<PostOffice> postOffice) {
        this.postOffice = postOffice;
    }

    @Override
    public String toString() {
        return "PincodeDetails{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", postOffice=" + postOffice +
                '}';
    }
}
