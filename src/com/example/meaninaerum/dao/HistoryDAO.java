package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.History;
import com.example.meaninaerum.dao.entities.User;

import java.util.List;


public class HistoryDAO {
    private List<History> allHistory;

    public void addHistory(History h){
        allHistory.add(h);
    }

    public List<History> getByUser(User u){
        return allHistory;
    }


    public void clearByUser(User u){
        allHistory.clear();
    }
}
