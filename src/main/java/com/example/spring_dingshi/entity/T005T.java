package com.example.spring_dingshi.entity;

public class T005T {
    private String LAND1;
    private String LANDX;

    public String getLAND1() {
        return LAND1;
    }

    public void setLAND1(String LAND1) {
        this.LAND1 = LAND1;
    }

    public String getLANDX() {
        return LANDX;
    }

    public void setLANDX(String LANDX) {
        this.LANDX = LANDX;
    }

    @Override
    public String toString() {
        return "T005T{" +
                "LAND1='" + LAND1 + '\'' +
                ", LANDX='" + LANDX + '\'' +
                '}';
    }
}
