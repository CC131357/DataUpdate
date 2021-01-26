package com.example.spring_dingshi.entity;

public class T005U {
    private String LAND1;
    private String BLAND;
    private String BEZEI;

    public String getLAND1() {
        return LAND1;
    }

    public void setLAND1(String LAND1) {
        this.LAND1 = LAND1;
    }

    public String getBLAND() {
        return BLAND;
    }

    public void setBLAND(String BLAND) {
        this.BLAND = BLAND;
    }

    public String getBEZEI() {
        return BEZEI;
    }

    public void setBEZEI(String BEZEI) {
        this.BEZEI = BEZEI;
    }

    @Override
    public String toString() {
        return "T005U{" +
                "LAND1='" + LAND1 + '\'' +
                ", BLAND='" + BLAND + '\'' +
                ", BEZEI='" + BEZEI + '\'' +
                '}';
    }
}
