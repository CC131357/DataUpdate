package com.example.spring_dingshi.entity;

public class T001L {
    private String WERKS;
    private String LGORT;
    private String LGOBE;

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getLGORT() {
        return LGORT;
    }

    public void setLGORT(String LGORT) {
        this.LGORT = LGORT;
    }

    public String getLGOBE() {
        return LGOBE;
    }

    public void setLGOBE(String LGOBE) {
        this.LGOBE = LGOBE;
    }

    @Override
    public String toString() {
        return "T001L{" +
                "WERKS='" + WERKS + '\'' +
                ", LGORT='" + LGORT + '\'' +
                ", LGOBE='" + LGOBE + '\'' +
                '}';
    }
}
