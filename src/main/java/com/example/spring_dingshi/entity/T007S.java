package com.example.spring_dingshi.entity;

public class T007S {
    private String MWSKZ;
    private String TEXT1;
    private String KALSM;

    public String getMWSKZ() {
        return MWSKZ;
    }

    public void setMWSKZ(String MWSKZ) {
        this.MWSKZ = MWSKZ;
    }

    public String getTEXT1() {
        return TEXT1;
    }

    public void setTEXT1(String TEXT1) {
        this.TEXT1 = TEXT1;
    }

    public String getKALSM() {
        return KALSM;
    }

    public void setKALSM(String KALSM) {
        this.KALSM = KALSM;
    }

    @Override
    public String toString() {
        return "T007S{" +
                "MWSKZ='" + MWSKZ + '\'' +
                ", TEXT1='" + TEXT1 + '\'' +
                ", KALSM='" + KALSM + '\'' +
                '}';
    }
}
