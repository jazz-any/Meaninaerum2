package com.example.meaninaerum.dao.entities;

/**
 * Created with IntelliJ IDEA.
 * User: vitalik1700
 * Date: 25.11.13
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    private String word;
    private String meaning1;
    private String meaning2;
    private String meaning3;

    private int correctMeaning;

    public Test(String word, String meaning1, String meaning2, String meaning3, int correctMeaning) {
        this.setWord(word);
        this.setMeaning1(meaning1);
        this.setMeaning2(meaning2);
        this.setMeaning3(meaning3);
        this.setCorrectMeaning(correctMeaning);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning1() {
        return meaning1;
    }

    public void setMeaning1(String meaning1) {
        this.meaning1 = meaning1;
    }

    public String getMeaning2() {
        return meaning2;
    }

    public void setMeaning2(String meaning2) {
        this.meaning2 = meaning2;
    }

    public String getMeaning3() {
        return meaning3;
    }

    public void setMeaning3(String meaning3) {
        this.meaning3 = meaning3;
    }

    public int getCorrectMeaning() {
        return correctMeaning;
    }

    public void setCorrectMeaning(int correctMeaning) {
        this.correctMeaning = correctMeaning;
    }
}
