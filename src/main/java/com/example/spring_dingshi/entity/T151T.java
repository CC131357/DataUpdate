package com.example.spring_dingshi.entity;

public class T151T {
    private  String KDGPR;
    private String KTEXT;

    public String getKDGPR() {
        return KDGPR;
    }

    public void setKDGPR(String KDGPR) {
        this.KDGPR = KDGPR;
    }

    public String getKTEXT() {
        return KTEXT;
    }

    public void setKTEXT(String KTEXT) {
        this.KTEXT = KTEXT;
    }

    @Override
    public String toString() {
        return "T151T{" +
                "KDGPR='" + KDGPR + '\'' +
                ", KTEXT='" + KTEXT + '\'' +
                '}';
    }
}
