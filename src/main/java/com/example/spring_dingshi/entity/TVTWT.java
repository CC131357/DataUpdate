package com.example.spring_dingshi.entity;

public class TVTWT {
    private String VTWEG;;
    private String VTEXT;

    public String getVTWEG() {
        return VTWEG;
    }

    public void setVTWEG(String VTWEG) {
        this.VTWEG = VTWEG;
    }

    public String getVTEXT() {
        return VTEXT;
    }

    public void setVTEXT(String VTEXT) {
        this.VTEXT = VTEXT;
    }

    @Override
    public String toString() {
        return "TVTWT{" +
                "VTWEG='" + VTWEG + '\'' +
                ", VTEXT='" + VTEXT + '\'' +
                '}';
    }
}
