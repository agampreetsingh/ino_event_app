package com.inotech.management.eventapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "testclass")
@NamedQuery(name = "TestClass.findAll", query = "SELECT s FROM Status s")
public class TestClass {
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true, nullable = false)
        private int id;

        @Column(nullable = false, length = 50)
        private String name;

        public TestClass(){

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
