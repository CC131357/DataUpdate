package com.example.spring_dingshi.entity;

public class T042ZT {
    private String LAND1;
    private String ZLSCH;
    private String TEXT2;

    public String getLAND1() {
        return LAND1;
    }

    public void setLAND1(String LAND1) {
        this.LAND1 = LAND1;
    }

    public String getZLSCH() {
        return ZLSCH;
    }

    public void setZLSCH(String ZLSCH) {
        this.ZLSCH = ZLSCH;
    }

    public String getTEXT2() {
        return TEXT2;
    }

    public void setTEXT2(String TEXT2) {
        this.TEXT2 = TEXT2;
    }

    @Override
    public String toString() {
        return "T042ZT{" +
                "LAND1='" + LAND1 + '\'' +
                ", ZLSCH='" + ZLSCH + '\'' +
                ", TEXT2='" + TEXT2 + '\'' +
                '}';
    }
}
