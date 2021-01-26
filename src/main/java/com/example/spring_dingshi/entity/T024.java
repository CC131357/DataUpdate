package com.example.spring_dingshi.entity;

public class T024 {
    private  String EKGRP;
    private String EKNAM;

    public String getEKGRP() {
        return EKGRP;
    }

    public void setEKGRP(String EKGRP) {
        this.EKGRP = EKGRP;
    }

    public String getEKNAM() {
        return EKNAM;
    }

    public void setEKNAM(String EKNAM) {
        this.EKNAM = EKNAM;
    }

    @Override
    public String toString() {
        return "T024{" +
                "EKGRP='" + EKGRP + '\'' +
                ", EKNAM='" + EKNAM + '\'' +
                '}';
    }
}
