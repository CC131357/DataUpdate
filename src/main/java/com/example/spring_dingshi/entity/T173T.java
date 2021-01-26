package com.example.spring_dingshi.entity;

public class T173T {
    private String VSART;
    private String BEZEI;

    public String getVSART() {
        return VSART;
    }

    public void setVSART(String VSART) {
        this.VSART = VSART;
    }

    public String getBEZEI() {
        return BEZEI;
    }

    public void setBEZEI(String BEZEI) {
        this.BEZEI = BEZEI;
    }

    @Override
    public String toString() {
        return "T173T{" +
                "VSART='" + VSART + '\'' +
                ", BEZEI='" + BEZEI + '\'' +
                '}';
    }
}
