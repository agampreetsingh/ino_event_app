package com.inotech.management.eventapp.entities.demographics;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the district database table.
 */
@Entity
@Table(name = "district")
@NamedQuery(name = "District.findAll", query = "SELECT d FROM District d")
public class District implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
/*
    //bi-directional many-to-one association to City
    @OneToMany(mappedBy = "district")
    private List<City> cities;
*/
    //bi-directional many-to-one association to State
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "STATE_ID", nullable = false)
    private State state;

    public District() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public List<City> getCities() {
        return this.cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public City addCity(City city) {
        getCities().add(city);
        city.setDistrict(this);
        return city;
    }

    public City removeCity(City city) {
        getCities().remove(city);
        city.setDistrict(null);
        return city;
    }
*/
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

}