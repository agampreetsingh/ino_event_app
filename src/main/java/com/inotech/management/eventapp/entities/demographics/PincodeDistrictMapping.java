package com.inotech.management.eventapp.entities.demographics;

import javax.persistence.*;

@Entity
@Table(name = "pincodes_districts")
public class PincodeDistrictMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    private Pincodes pincode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DISTRICT_ID")
    private District district;

    public PincodeDistrictMapping() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pincodes getPincode() {
        return pincode;
    }

    public void setPincode(Pincodes pincode) {
        this.pincode = pincode;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
