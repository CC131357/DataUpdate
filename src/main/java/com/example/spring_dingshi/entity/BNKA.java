package com.example.spring_dingshi.entity;

public class BNKA {
    private String BANKS;
    private String BANKL;
    private String BANKA;

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

    public String getBANKA() {
        return BANKA;
    }

    public void setBANKA(String BANKA) {
        this.BANKA = BANKA;
    }

    @Override
    public String toString() {
        return "BNKA{" +
                "BANKS='" + BANKS + '\'' +
                ", BANKL='" + BANKL + '\'' +
                ", BANKA='" + BANKA + '\'' +
                '}';
    }
}
