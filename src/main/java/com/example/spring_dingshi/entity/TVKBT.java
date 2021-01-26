package com.example.spring_dingshi.entity;

public class TVKBT {
    private  String VKBUR;
    private String VTEXT;

    public String getVKBUR() {
        return VKBUR;
    }

    public void setVKBUR(String VKBUR) {
        this.VKBUR = VKBUR;
    }

    public String getVTEXT() {
        return VTEXT;
    }

    public void setVTEXT(String VTEXT) {
        this.VTEXT = VTEXT;
    }

    @Override
    public String toString() {
        return "TVKBT{" +
                "VKBUR='" + VKBUR + '\'' +
                ", VTEXT='" + VTEXT + '\'' +
                '}';
    }
}
