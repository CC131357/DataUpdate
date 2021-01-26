package com.example.spring_dingshi.entity;

public class TVGRT {
    private  String VKGRP;
    private String BEZEI;

    public String getVKGRP() {
        return VKGRP;
    }

    public void setVKGRP(String VKGRP) {
        this.VKGRP = VKGRP;
    }

    public String getBEZEI() {
        return BEZEI;
    }

    public void setBEZEI(String BEZEI) {
        this.BEZEI = BEZEI;
    }

    @Override
    public String toString() {
        return "TVGRT{" +
                "VKGRP='" + VKGRP + '\'' +
                ", BEZEI='" + BEZEI + '\'' +
                '}';
    }
}
