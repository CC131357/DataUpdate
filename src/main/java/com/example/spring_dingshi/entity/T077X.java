package com.example.spring_dingshi.entity;

public class T077X {
    private String KTOKD;
    private String TXT30;

    public String getKTOKD() {
        return KTOKD;
    }

    public void setKTOKD(String KTOKD) {
        this.KTOKD = KTOKD;
    }

    public String getTXT30() {
        return TXT30;
    }

    public void setTXT30(String TXT30) {
        this.TXT30 = TXT30;
    }

    @Override
    public String toString() {
        return "T077X{" +
                "KTOKD='" + KTOKD + '\'' +
                ", TXT30='" + TXT30 + '\'' +
                '}';
    }
}
