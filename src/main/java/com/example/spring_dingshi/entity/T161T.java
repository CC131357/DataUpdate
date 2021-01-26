package com.example.spring_dingshi.entity;

public class T161T {
    private String BSTYP;
    private String BSART;
    private String BATXT;

    public String getBSTYP() {
        return BSTYP;
    }

    public void setBSTYP(String BSTYP) {
        this.BSTYP = BSTYP;
    }

    public String getBSART() {
        return BSART;
    }

    public void setBSART(String BSART) {
        this.BSART = BSART;
    }

    public String getBATXT() {
        return BATXT;
    }

    public void setBATXT(String BATXT) {
        this.BATXT = BATXT;
    }

    @Override
    public String toString() {
        return "T161T{" +
                "BSTYP='" + BSTYP + '\'' +
                ", BSART='" + BSART + '\'' +
                ", BATXT='" + BATXT + '\'' +
                '}';
    }
}
