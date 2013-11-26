package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.History;
import com.example.meaninaerum.dao.entities.User;
import junit.framework.TestCase;

import java.util.List;


public class HistoryDAOTest extends TestCase {
    public void testClearAndGetByUser() throws Exception {
        HistoryDAO testedEntity = new HistoryDAO();

        String userName = "Jazz";
        User testUser = new User(userName);

        testedEntity.clearByUser(testUser);

        List<History> listNoHistory = testedEntity.getByUser(testUser);
        assertEquals(0, listNoHistory.size());

        History realObject = new History(testUser,5,5);

        testedEntity.addHistory(realObject);

        List<History> listHistory = testedEntity.getByUser(testUser);
        assertEquals(1, listNoHistory.size());
    }
}
