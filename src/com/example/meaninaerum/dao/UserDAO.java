package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.User;


public class UserDAO {
    private User currentUser = null;

    public User getUser() {
        return currentUser;
    }

    public void setUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
