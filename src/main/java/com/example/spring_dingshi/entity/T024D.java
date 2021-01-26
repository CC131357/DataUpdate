package com.example.spring_dingshi.entity;

public class T024D {
    private String WERKS ;
    private String DISPO;
    private String DSNAM;

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getDISPO() {
        return DISPO;
    }

    public void setDISPO(String DISPO) {
        this.DISPO = DISPO;
    }

    public String getDSNAM() {
        return DSNAM;
    }

    public void setDSNAM(String DSNAM) {
        this.DSNAM = DSNAM;
    }

    @Override
    public String toString() {
        return "T024D{" +
                "WERKS='" + WERKS + '\'' +
                ", DISPO='" + DISPO + '\'' +
                ", DSNAM='" + DSNAM + '\'' +
                '}';
    }
}
