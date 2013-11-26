package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.Test;
import junit.framework.TestCase;

import java.util.List;


public class TestDAOTest extends TestCase {
    public void testGetTests() throws Exception {
        TestDAO testedEntity = new TestDAO();

        int maxTest = testedEntity.maxTests();

        List<Test> tests = testedEntity.getTests(maxTest);

        assertEquals(tests.size(), maxTest);

        for(Test x : tests){
            assertNotNull(x);
        }
    }
}
