package io.zipcoder.persistenceapp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long dptNumber;
    String dptName;
    String dptManagaer;

    public Department(){}

    public Long getDptNumber() {
        return dptNumber;
    }

    public void setDptNumber(Long dptNumber) {
        this.dptNumber = dptNumber;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getDptManagaer() {
        return dptManagaer;
    }

    public void setDptManagaer(String dptManagaer) {
        this.dptManagaer = dptManagaer;
    }

    public Department(String dptName, String dptManagaer) {
        this.dptName = dptName;
        this.dptManagaer = dptManagaer;
    }
}
