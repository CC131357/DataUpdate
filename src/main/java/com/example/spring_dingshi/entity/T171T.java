package com.example.spring_dingshi.entity;

public class T171T {
    private  String BZIRK;
    private String BZTXT;

    public String getBZIRK() {
        return BZIRK;
    }

    public void setBZIRK(String BZIRK) {
        this.BZIRK = BZIRK;
    }

    public String getBZTXT() {
        return BZTXT;
    }

    public void setBZTXT(String BZTXT) {
        this.BZTXT = BZTXT;
    }

    @Override
    public String toString() {
        return "T171T{" +
                "BZIRK='" + BZIRK + '\'' +
                ", BZTXT='" + BZTXT + '\'' +
                '}';
    }
}
