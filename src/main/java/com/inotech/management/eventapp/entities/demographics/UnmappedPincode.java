package com.inotech.management.eventapp.entities.demographics;

import javax.persistence.*;

@Entity
@Table(name = "pincodes_unmapped")
public class UnmappedPincode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "PINCODE_IDE")
    private Pincodes pincode;

    public UnmappedPincode() {
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

}
