package com.example.meaninaerum.dao;

import com.example.meaninaerum.dao.entities.Test;

import java.util.ArrayList;
import java.util.List;


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
