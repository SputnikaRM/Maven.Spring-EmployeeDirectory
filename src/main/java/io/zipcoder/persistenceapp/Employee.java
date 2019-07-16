package io.zipcoder.persistenceapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long EmployeeNumber;
    String firstName;
    String lastName;   String title;
    String phoneNumber;
    String email;
    Date hireDate;
    String manager;
    Long dptNumber;

    public Employee(){}

    public Employee(String firstName, String lastName, String title, String phoneNumber, String email, Date hireDate, String manager, Long dptNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.manager = manager;
        this.dptNumber = dptNumber;
    }


    public Long getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Long getDptNumber() {
        return dptNumber;
    }

    public void setDptNumber(Long dptNumber) {
        this.dptNumber = dptNumber;
    }


}
