package com.example.spring_dingshi.entity;

public class T001 {
    private  String BUKRS;
    private String BUTXT;

    public String getBUKRS() {
        return BUKRS;
    }

    public void setBUKRS(String BUKRS) {
        this.BUKRS = BUKRS;
    }

    public String getBUTXT() {
        return BUTXT;
    }

    public void setBUTXT(String BUTXT) {
        this.BUTXT = BUTXT;
    }

    @Override
    public String toString() {
        return "T001{" +
                "BUKRS='" + BUKRS + '\'' +
                ", BUTXT='" + BUTXT + '\'' +
                '}';
    }
}
