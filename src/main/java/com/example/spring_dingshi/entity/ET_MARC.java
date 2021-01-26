package com.example.spring_dingshi.entity;

/**
 * 物料主数据工厂视图
 */
public class ET_MARC {
    private String MATNR;
    private String WERKS;
    private String NAME1;
    private String ZBISM;
    private String EKGRP;
    private String XCHAR;
    private String DISGR;
    private String DISMM;
    private String DISPO;
    private String DISLS;
    private String BESKZ;
    private String LGFSB;
    private String PLIFZ;
    private String SBDKZ;
    private String BKLAS;
    private String LADGR;

    public String getMATNR() {
        return MATNR;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getNAME1() {
        return NAME1;
    }

    public void setNAME1(String NAME1) {
        this.NAME1 = NAME1;
    }

    public String getZBISM() {
        return ZBISM;
    }

    public void setZBISM(String ZBISM) {
        this.ZBISM = ZBISM;
    }

    public String getEKGRP() {
        return EKGRP;
    }

    public void setEKGRP(String EKGRP) {
        this.EKGRP = EKGRP;
    }

    public String getXCHAR() {
        return XCHAR;
    }

    public void setXCHAR(String XCHAR) {
        this.XCHAR = XCHAR;
    }

    public String getDISGR() {
        return DISGR;
    }

    public void setDISGR(String DISGR) {
        this.DISGR = DISGR;
    }

    public String getDISMM() {
        return DISMM;
    }

    public void setDISMM(String DISMM) {
        this.DISMM = DISMM;
    }

    public String getDISPO() {
        return DISPO;
    }

    public void setDISPO(String DISPO) {
        this.DISPO = DISPO;
    }

    public String getDISLS() {
        return DISLS;
    }

    public void setDISLS(String DISLS) {
        this.DISLS = DISLS;
    }


    public String getBESKZ() {
        return BESKZ;
    }

    public void setBESKZ(String BESKZ) {
        this.BESKZ = BESKZ;
    }

    public String getLGFSB() {
        return LGFSB;
    }

    public void setLGFSB(String LGFSB) {
        this.LGFSB = LGFSB;
    }

    public String getPLIFZ() {
        return PLIFZ;
    }

    public void setPLIFZ(String PLIFZ) {
        this.PLIFZ = PLIFZ;
    }


    public String getSBDKZ() {
        return SBDKZ;
    }

    public void setSBDKZ(String SBDKZ) {
        this.SBDKZ = SBDKZ;
    }

    public String getBKLAS() {
        return BKLAS;
    }

    public void setBKLAS(String BKLAS) {
        this.BKLAS = BKLAS;
    }

    public String getLADGR() {
        return LADGR;
    }

    public void setLADGR(String LADGR) {
        this.LADGR = LADGR;
    }

    @Override
    public String toString() {
        return "ET_MARC{" +
                "MATNR='" + MATNR + '\'' +
                ", WERKS='" + WERKS + '\'' +
                ", NAME1='" + NAME1 + '\'' +
                ", ZBISM='" + ZBISM + '\'' +
                ", EKGRP='" + EKGRP + '\'' +
                ", XCHAR='" + XCHAR + '\'' +
                ", DISGR='" + DISGR + '\'' +
                ", DISMM='" + DISMM + '\'' +
                ", DISPO='" + DISPO + '\'' +
                ", DISLS='" + DISLS + '\'' +
                ", BESKZ='" + BESKZ + '\'' +
                ", LGFSB='" + LGFSB + '\'' +
                ", PLIFZ='" + PLIFZ + '\'' +
                ", SBDKZ='" + SBDKZ + '\'' +
                ", BKLAS='" + BKLAS + '\'' +
                ", LADGR='" + LADGR + '\'' +
                '}';
    }
}
