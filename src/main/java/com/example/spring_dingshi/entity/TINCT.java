package com.example.spring_dingshi.entity;

public class TINCT {
    private  String INCO1;
    private String BEZEI;

    public String getINCO1() {
        return INCO1;
    }

    public void setINCO1(String INCO1) {
        this.INCO1 = INCO1;
    }

    public String getBEZEI() {
        return BEZEI;
    }

    public void setBEZEI(String BEZEI) {
        this.BEZEI = BEZEI;
    }

    @Override
    public String toString() {
        return "TINCT{" +
                "INCO1='" + INCO1 + '\'' +
                ", BEZEI='" + BEZEI + '\'' +
                '}';
    }
}
