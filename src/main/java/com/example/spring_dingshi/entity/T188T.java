package com.example.spring_dingshi.entity;

public class T188T {
    private  String KONDA;
    private String VTEXT;

    public String getKONDA() {
        return KONDA;
    }

    public void setKONDA(String KONDA) {
        this.KONDA = KONDA;
    }

    public String getVTEXT() {
        return VTEXT;
    }

    public void setVTEXT(String VTEXT) {
        this.VTEXT = VTEXT;
    }

    @Override
    public String toString() {
        return "T188T{" +
                "KONDA='" + KONDA + '\'' +
                ", VTEXT='" + VTEXT + '\'' +
                '}';
    }
}
