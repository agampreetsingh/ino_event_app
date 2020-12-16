package com.inotech.management.eventapp.entities.demographics;

import com.inotech.management.eventapp.entities.user.User;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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
    private Integer id;

    @Column(name = "NAME", length = 100)
    private String name;

    //bi-directional many-to-one association to District
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "DISTRICT_ID", nullable = false)
    private District district;

    /*
    //bi-directional many-to-one association to User
    @OneToMany(mappedBy = "city")
    private List<User> users;
*/
    public City() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
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