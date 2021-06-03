package com.inotech.management.eventapp.entities.demographics;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;


    @JsonManagedReference
    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL)
    private List<City> cities;


    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STATE_ID", nullable = false)
    private State state;

    public District() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

}