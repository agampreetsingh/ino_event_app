package com.inotech.management.eventapp.entities.common;

import com.inotech.management.eventapp.entities.TestClass;
import com.inotech.management.eventapp.entities.demographics.District;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the status database table.
 */
@Entity
@Table(name = "status")
@NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s")
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 50)
    private String name;


    //bi-directional many-to-one association to District
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Test_id", nullable = false)
    private TestClass testClass;

    public Status() {
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

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }
}