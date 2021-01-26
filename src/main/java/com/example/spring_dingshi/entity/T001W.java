package com.example.spring_dingshi.entity;

public class T001W {
    private String WERKS;
    private String NAME1;

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getNAME1() {
        return NAME1;
    }

    public void setNAME1(String NAME1) {
        this.NAME1 = NAME1;
    }

    @Override
    public String toString() {
        return "T001W{" +
                "WERKS='" + WERKS + '\'' +
                ", NAME1='" + NAME1 + '\'' +
                '}';
    }
}
