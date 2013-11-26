package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jazz
 * Date: 25.11.13
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class TestDAO {
    private List<Test> allTests = new ArrayList<Test>();
    public TestDAO() {
        allTests.add(new Test(
                "Jazz",
                "A student",
                "A teacher",
                "A cat",
                3
        ));
    }

    public int maxTests(){
        return allTests.size();
    }

    public List<Test> getTests(int count){
        return allTests;
    }
}
