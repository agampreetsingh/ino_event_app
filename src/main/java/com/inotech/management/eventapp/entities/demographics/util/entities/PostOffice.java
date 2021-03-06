
package com.inotech.management.eventapp.entities.demographics.util.entities;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "Description",
    "BranchType",
    "DeliveryStatus",
    "Circle",
    "District",
    "Division",
    "Region",
    "State",
    "Country"
})
public class PostOffice implements Serializable
{

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("BranchType")
    private String branchType;
    @JsonProperty("DeliveryStatus")
    private String deliveryStatus;
    @JsonProperty("Circle")
    private String circle;
    @JsonProperty("District")
    private String district;
    @JsonProperty("Division")
    private String division;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Country")
    private String country;
    private final static long serialVersionUID = 5246220525634844373L;

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("BranchType")
    public String getBranchType() {
        return branchType;
    }

    @JsonProperty("BranchType")
    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    @JsonProperty("DeliveryStatus")
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    @JsonProperty("DeliveryStatus")
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @JsonProperty("Circle")
    public String getCircle() {
        return circle;
    }

    @JsonProperty("Circle")
    public void setCircle(String circle) {
        this.circle = circle;
    }

    @JsonProperty("District")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("Division")
    public String getDivision() {
        return division;
    }

    @JsonProperty("Division")
    public void setDivision(String division) {
        this.division = division;
    }

    @JsonProperty("Region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", branchType='" + branchType + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", circle='" + circle + '\'' +
                ", district='" + district + '\'' +
                ", division='" + division + '\'' +
                ", region='" + region + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
