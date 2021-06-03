package com.inotech.management.eventapp.entities.demographics;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the city database table.
 */
@Entity
@Table(name = "city")
@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DISTRICT_ID", nullable = false)
    private District district;

    /*
    //bi-directional many-to-one association to User
    @OneToMany(mappedBy = "city")
    private List<User> users;
*/
    public City() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return this.name;
    }

    public void setCity(String city) {
        this.name = city;
    }

    public District getDistrict() {
        return this.district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
/*
    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User addUser(User user) {
        getUsers().add(user);
        user.setCity(this);

        return user;
    }

    public User removeUser(User user) {
        getUsers().remove(user);
        user.setCity(null);

        return user;
    }
*/
}