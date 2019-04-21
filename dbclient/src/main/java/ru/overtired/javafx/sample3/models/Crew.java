package ru.overtired.javafx.sample3.models;


import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crew")
public class Crew {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Surname",nullable = false)
    private  String surname;  //можно любое имя, лишь бы в аннотации совпадало

    @Column(name = "Firstname", nullable = false)
    private  String firstname;

    @Column(name = "Secondname", nullable = true)
    private  String secondname;

    @Column(name = "Status", nullable = false)
    private  int status_key;

    @Column(name = "yearofbirthday",nullable = false)
    private  int year;

    public Status getDescribeStatus() {
        return describeStatus;
    }

    public void setDescribeStatus(Status describeStatus) {
        this.describeStatus = describeStatus;
    }


    @OneToOne(optional=false)
    @JoinColumn(name="Status", insertable=false, updatable=false)
    private Status describeStatus;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getStatus_key() {
        return status_key;
    }

    public void setStatus_key(int status_key) {
        this.status_key = status_key;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
