package com.example.spring_dingshi.entity;

public class T052U {
    private  String ZTERM;
    private String TEXT1;

    public String getZTERM() {
        return ZTERM;
    }

    public void setZTERM(String ZTERM) {
        this.ZTERM = ZTERM;
    }

    public String getTEXT1() {
        return TEXT1;
    }

    public void setTEXT1(String TEXT1) {
        this.TEXT1 = TEXT1;
    }

    @Override
    public String toString() {
        return "T052U{" +
                "ZTERM='" + ZTERM + '\'' +
                ", TEXT1='" + TEXT1 + '\'' +
                '}';
    }
}
