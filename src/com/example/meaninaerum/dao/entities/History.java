package com.example.meaninaerum.dao.entities;

import java.util.Date;


public class History {
    private String owner;

    private int total;
    private int success;

    private Date date = new Date();

    public History(User owner, int total, int success) {
        this.setOwner(owner);
        this.setTotal(total);
        this.setSuccess(success);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner.getName();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
