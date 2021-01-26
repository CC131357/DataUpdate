package com.example.spring_dingshi.entity;

public class TSPAT {
    private String SPRAS;
    private String SPART;
    private String VTEXT;

    public String getSPRAS() {
        return SPRAS;
    }

    public void setSPRAS(String SPRAS) {
        this.SPRAS = SPRAS;
    }

    public String getSPART() {
        return SPART;
    }

    public void setSPART(String SPART) {
        this.SPART = SPART;
    }

    public String getVTEXT() {
        return VTEXT;
    }

    public void setVTEXT(String VTEXT) {
        this.VTEXT = VTEXT;
    }

    @Override
    public String toString() {
        return "PSPAT{" +
                "SPRAS='" + SPRAS + '\'' +
                ", SPART='" + SPART + '\'' +
                ", VTEXT='" + VTEXT + '\'' +
                '}';
    }
}
