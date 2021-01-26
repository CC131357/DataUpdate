package com.example.spring_dingshi.entity;

public class T438X {
    private String SPRAS ;
    private String WERKS;
    private String DISGR;
    private String TEXT40;

    public String getSPRAS() {
        return SPRAS;
    }

    public void setSPRAS(String SPRAS) {
        this.SPRAS = SPRAS;
    }

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getDISGR() {
        return DISGR;
    }

    public void setDISGR(String DISGR) {
        this.DISGR = DISGR;
    }

    public String getTEXT40() {
        return TEXT40;
    }

    public void setTEXT40(String TEXT40) {
        this.TEXT40 = TEXT40;
    }

    @Override
    public String toString() {
        return "T438X{" +
                "SPRAS='" + SPRAS + '\'' +
                ", WERKS='" + WERKS + '\'' +
                ", DISGR='" + DISGR + '\'' +
                ", TEXT40='" + TEXT40 + '\'' +
                '}';
    }
}
