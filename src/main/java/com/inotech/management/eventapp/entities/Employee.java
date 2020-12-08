package com.inotech.management.eventapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@NamedQuery(name = "Employee.findAll", query = "SELECT c FROM Country c")
public class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name", length = 200)
        private String name;

        @Column(name = "role", length = 100)
        private String role;

    public Employee() {
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

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
