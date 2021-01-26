package com.example.spring_dingshi.entity;

public class LFBK {
    private String LIFNR;
    private String BANKS;
    private String BANKL;
    private String BANKN;
    private String BVTYP;
    private String KOINH;
    private String BKREF;

    public String getBKREF() {
        return BKREF;
    }

    public void setBKREF(String BKREF) {
        this.BKREF = BKREF;
    }

    public String getLIFNR() {
        return LIFNR;
    }

    public void setLIFNR(String LIFNR) {
        this.LIFNR = LIFNR;
    }

    public String getBANKS() {
        return BANKS;
    }

    public void setBANKS(String BANKS) {
        this.BANKS = BANKS;
    }

    public String getBANKL() {
        return BANKL;
    }

    public void setBANKL(String BANKL) {
        this.BANKL = BANKL;
    }

    public String getBANKN() {
        return BANKN;
    }

    public void setBANKN(String BANKN) {
        this.BANKN = BANKN;
    }

    public String getBVTYP() {
        return BVTYP;
    }

    public void setBVTYP(String BVTYP) {
        this.BVTYP = BVTYP;
    }

    public String getKOINH() {
        return KOINH;
    }

    public void setKOINH(String KOINH) {
        this.KOINH = KOINH;
    }

    @Override
    public String toString() {
        return "LFBK{" +
                "LIFNR='" + LIFNR + '\'' +
                ", BANKS='" + BANKS + '\'' +
                ", BANKL='" + BANKL + '\'' +
                ", BANKN='" + BANKN + '\'' +
                ", BVTYP='" + BVTYP + '\'' +
                ", KOINH='" + KOINH + '\'' +
                '}';
    }
}
