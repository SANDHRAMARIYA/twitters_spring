package com.nestdigital.twitterbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class TwitterModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phnum;
    private String dob;
    private String place;
    private String emailid;
    private String password;
    private String conpass;

    public TwitterModel() {
    }

    public TwitterModel(int id, String name, String phnum, String dob, String place, String emailid, String password, String conpass) {
        this.id = id;
        this.name = name;
        this.phnum = phnum;
        this.dob = dob;
        this.place = place;
        this.emailid = emailid;
        this.password = password;
        this.conpass = conpass;
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

    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConpass() {
        return conpass;
    }

    public void setConpass(String conpass) {
        this.conpass = conpass;
    }
}
