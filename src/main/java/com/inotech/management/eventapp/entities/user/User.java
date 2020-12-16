package com.inotech.management.eventapp.entities.user;

import com.inotech.management.eventapp.entities.common.Role;
import com.inotech.management.eventapp.entities.common.Status;
import com.inotech.management.eventapp.entities.demographics.City;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the user database table.
 */
@Entity
@Table(name = "user")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ADDRESS", nullable = false, length = 500)
    private String address;

    @Column(name = "CREATED_ON", nullable = false)
    private Timestamp createdOn;

    @Column(name = "DOB", nullable = false)
    private Timestamp dob;

    @Column(name = "EMAIL", nullable = false, length = 200)
    private String email;

    @Column(name = "FIRST_NAME", nullable = false, length = 200)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 200)
    private String lastName;

    @Column(name = "MIDDLE_NAME", nullable = false, length = 200)
    private String middleName;

    @Column(name = "PINCODE", nullable = false, length = 500)
    private String pincode;

   // @Column(name = "ROLE_ID", nullable = false)
    //private Role role;

    //@Column(name = "STATUS", nullable = false)
   // private Status status;

    @Column(nullable = false, length = 200)
    private String token;

    @Column(name = "UPDATED_ON", nullable = false)
    private Timestamp updatedOn;
/*
    //bi-directional many-to-one association to City
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID", nullable = false)
    private City city;
*/
    public User() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getDob() {
        return this.dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
/*
    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
*/
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }
/*
    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }
*/
}