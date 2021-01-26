package com.example.spring_dingshi.entity;

public class T024E {
    private  String EKORG;
    private String EKOTX;

    public String getEKORG() {
        return EKORG;
    }

    public void setEKORG(String EKORG) {
        this.EKORG = EKORG;
    }

    public String getEKOTX() {
        return EKOTX;
    }

    public void setEKOTX(String EKOTX) {
        this.EKOTX = EKOTX;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "EKORG='" + EKORG + '\'' +
                ", EKOTX='" + EKOTX + '\'' +
                '}';
    }
}
