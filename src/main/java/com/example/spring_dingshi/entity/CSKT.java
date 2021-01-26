package com.example.spring_dingshi.entity;

public class CSKT {
    private String KOSTL;
    private String KTEXT;

    public String getKOSTL() {
        return KOSTL;
    }

    public void setKOSTL(String KOSTL) {
        this.KOSTL = KOSTL;
    }

    public String getKTEXT() {
        return KTEXT;
    }

    public void setKTEXT(String KTEXT) {
        this.KTEXT = KTEXT;
    }

    @Override
    public String toString() {
        return "CSKS{" +
                "KOSTL='" + KOSTL + '\'' +
                ", KTEXT='" + KTEXT + '\'' +
                '}';
    }
}
