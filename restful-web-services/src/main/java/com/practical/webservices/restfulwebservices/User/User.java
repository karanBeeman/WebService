package com.practical.webservices.restfulwebservices.User;

import java.util.Date;

public class User {

    private String name;

    private Integer id;

    private Date dob;

    public User(String name, Integer id, Date dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
