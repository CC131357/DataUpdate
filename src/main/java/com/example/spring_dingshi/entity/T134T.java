package com.example.spring_dingshi.entity;

public class T134T {
    private  String MTART;
    private String MTBEZ;

    public String getMTART() {
        return MTART;
    }

    public void setMTART(String MTART) {
        this.MTART = MTART;
    }

    public String getMTBEZ() {
        return MTBEZ;
    }

    public void setMTBEZ(String MTBEZ) {
        this.MTBEZ = MTBEZ;
    }

    @Override
    public String toString() {
        return "T134T{" +
                "MTART='" + MTART + '\'' +
                ", MTBEZ='" + MTBEZ + '\'' +
                '}';
    }
}
