package com.example.spring_dingshi.entity;

public class TVKOT {
    private  String VKORG;
    private String VTEXT;

    public String getVKORG() {
        return VKORG;
    }

    public void setVKORG(String VKORG) {
        this.VKORG = VKORG;
    }

    public String getVTEXT() {
        return VTEXT;
    }

    public void setVTEXT(String VTEXT) {
        this.VTEXT = VTEXT;
    }

    @Override
    public String toString() {
        return "TVKOT{" +
                "VKORG='" + VKORG + '\'' +
                ", VTEXT='" + VTEXT + '\'' +
                '}';
    }
}
