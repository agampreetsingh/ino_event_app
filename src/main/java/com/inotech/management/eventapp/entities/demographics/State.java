package com.inotech.management.eventapp.entities.demographics;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the state database table.
 */
@Entity
@Table(name = "state")
@NamedQuery(name = "State.findAll", query = "SELECT s FROM State s")
public class State implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    //bi-directional many-to-one association to District
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<District> districts;

    //bi-directional many-to-one association to Zone
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ZONE_ID")
    private Zone zone;

    public State() {
    }

    public State(String stateName) {
        this.setName(stateName);
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

    public List<District> getDistricts() {
        return this.districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public District addDisctrict(District district) {
        getDistricts().add(district);
        district.setState(this);
        return district;
    }

    public District removeDisctrict(District district) {
        getDistricts().remove(district);
        district.setState(null);
        return district;
    }

    public Zone getZone() {
        return this.zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

}