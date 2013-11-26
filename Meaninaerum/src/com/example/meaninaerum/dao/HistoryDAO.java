package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.History;
import com.example.meaninaerum.dao.entities.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vitalik1700
 * Date: 25.11.13
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 */
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
