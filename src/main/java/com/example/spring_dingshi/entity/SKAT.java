package com.example.spring_dingshi.entity;

public class SKAT {
    private String SAKNR;
    private String KTOPL;
    private String TXT20;
    private String TXT50;

    public String getSAKNR() {
        return SAKNR;
    }

    public void setSAKNR(String SAKNR) {
        this.SAKNR = SAKNR;
    }

    public String getKTOPL() {
        return KTOPL;
    }

    public void setKTOPL(String KTOPL) {
        this.KTOPL = KTOPL;
    }

    public String getTXT20() {
        return TXT20;
    }

    public void setTXT20(String TXT20) {
        this.TXT20 = TXT20;
    }

    public String getTXT50() {
        return TXT50;
    }

    public void setTXT50(String TXT50) {
        this.TXT50 = TXT50;
    }

    @Override
    public String toString() {
        return "SKAT{" +
                "SAKNR='" + SAKNR + '\'' +
                ", KTOPL='" + KTOPL + '\'' +
                ", TXT20='" + TXT20 + '\'' +
                ", TXT50='" + TXT50 + '\'' +
                '}';
    }
}
