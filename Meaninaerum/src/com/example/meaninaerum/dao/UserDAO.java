package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.User;

/**
 * Created with IntelliJ IDEA.
 * User: vitalik1700
 * Date: 25.11.13
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class UserDAO {
    private User currentUser = null;

    public User getUser() {
        return currentUser;
    }

    public void setUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
