package com.example.spring_dingshi.entity;

public class ZSKA1 {
    private String SAKNR;
    private String BUKRS;
    private String TXT20;

    public String getSAKNR() {
        return SAKNR;
    }

    public void setSAKNR(String SAKNR) {
        this.SAKNR = SAKNR;
    }

    public String getBUKRS() {
        return BUKRS;
    }

    public void setBUKRS(String BUKRS) {
        this.BUKRS = BUKRS;
    }

    public String getTXT20() {
        return TXT20;
    }

    public void setTXT20(String TXT20) {
        this.TXT20 = TXT20;
    }

    @Override
    public String toString() {
        return "ZSKA1{" +
                "SAKNR='" + SAKNR + '\'' +
                ", BUKRS='" + BUKRS + '\'' +
                ", TXT20='" + TXT20 + '\'' +
                '}';
    }
}
