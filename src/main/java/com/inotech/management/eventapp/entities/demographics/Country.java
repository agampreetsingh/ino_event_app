package com.inotech.management.eventapp.entities.demographics;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the country database table.
 */
@Entity
@Table(name = "country")
@NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c")
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Zone> zones;

    public Country() {
    }

    public Long getId() {
        return id;
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

    public List<Zone> getZones() {
        return this.zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public Zone addZone(Zone zone) {
        getZones().add(zone);
        zone.setCountry(this);
        return zone;
    }

    public Zone removeZone(Zone zone) {
        getZones().remove(zone);
        zone.setCountry(null);
        return zone;
    }

}