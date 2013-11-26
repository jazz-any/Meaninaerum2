package com.example.meaninaerum.dao.entities;

/**
 * Created with IntelliJ IDEA.
 * User: vitalik1700
 * Date: 25.11.13
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
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
