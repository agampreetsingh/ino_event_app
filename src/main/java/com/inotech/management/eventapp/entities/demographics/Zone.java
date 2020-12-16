package com.inotech.management.eventapp.entities.demographics;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the zone database table.
 */
@Entity
@Table(name = "zone")
@NamedQuery(name = "Zone.findAll", query = "SELECT z FROM Zone z")
public class Zone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "NAME", length = 100)
    private String name;
/*
    //bi-directional many-to-one association to State
    @OneToMany(mappedBy = "zone")
    private List<State> states;
*/
    //bi-directional many-to-one association to Country
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    public Zone() {
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
    public List<State> getStates() {
        return this.states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public State addState(State state) {
        getStates().add(state);
        state.setZone(this);
        return state;
    }

    public State removeState(State state) {
        getStates().remove(state);
        state.setZone(null);
        return state;
    }
*/
    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}