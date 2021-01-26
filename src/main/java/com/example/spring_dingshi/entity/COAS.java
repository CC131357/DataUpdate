package com.example.spring_dingshi.entity;

public class COAS {
    private String AUFNR;
    private String AUART;

    public String getAUFNR() {
        return AUFNR;
    }

    public void setAUFNR(String AUFNR) {
        this.AUFNR = AUFNR;
    }

    public String getAUART() {
        return AUART;
    }

    public void setAUART(String AUART) {
        this.AUART = AUART;
    }

    @Override
    public String toString() {
        return "COAS{" +
                "AUFNR='" + AUFNR + '\'' +
                ", AUART='" + AUART + '\'' +
                '}';
    }
}
