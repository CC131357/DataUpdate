package com.example.spring_dingshi.entity;

public class T025T {
    private String BKLAS;
    private String BKBEZ;

    public String getBKLAS() {
        return BKLAS;
    }

    public void setBKLAS(String BKLAS) {
        this.BKLAS = BKLAS;
    }

    public String getBKBEZ() {
        return BKBEZ;
    }

    public void setBKBEZ(String BKBEZ) {
        this.BKBEZ = BKBEZ;
    }

    @Override
    public String toString() {
        return "T025T{" +
                "BKLAS='" + BKLAS + '\'' +
                ", BKBEZ='" + BKBEZ + '\'' +
                '}';
    }
}
