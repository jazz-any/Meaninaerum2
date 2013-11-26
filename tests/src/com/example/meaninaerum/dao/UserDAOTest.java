package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.User;
import junit.framework.TestCase;


public class UserDAOTest extends TestCase {
    public void testGetUser() throws Exception {
        UserDAO testedEntity = new UserDAO();

        String userName = "Jazz";
        User testUser = new User(userName);

        User nullUser = testedEntity.getUser();
        assertNull(nullUser);

        testedEntity.setUser(testUser);

        User fetchedUser = testedEntity.getUser();
        assertNotNull(fetchedUser);

        assertEquals(fetchedUser.getName(), userName);
    }
}
