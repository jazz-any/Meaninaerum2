package com.example.meaninaerum.dao.entities;


public class User {
    private String name;

    public User(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
