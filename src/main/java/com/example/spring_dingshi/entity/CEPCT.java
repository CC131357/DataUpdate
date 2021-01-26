package com.example.spring_dingshi.entity;

public class CEPCT {
    private String SPRAS;
    private String PRCTR;
    private String DATBI;
    private String KOKRS;
    private String KTEXT;
    private String LTEXT;
    private String MCTXT;

    public String getSPRAS() {
        return SPRAS;
    }

    public void setSPRAS(String SPRAS) {
        this.SPRAS = SPRAS;
    }

    public String getPRCTR() {
        return PRCTR;
    }

    public void setPRCTR(String PRCTR) {
        this.PRCTR = PRCTR;
    }

    public String getDATBI() {
        return DATBI;
    }

    public void setDATBI(String DATBI) {
        this.DATBI = DATBI;
    }

    public String getKOKRS() {
        return KOKRS;
    }

    public void setKOKRS(String KOKRS) {
        this.KOKRS = KOKRS;
    }

    public String getKTEXT() {
        return KTEXT;
    }

    public void setKTEXT(String KTEXT) {
        this.KTEXT = KTEXT;
    }

    public String getLTEXT() {
        return LTEXT;
    }

    public void setLTEXT(String LTEXT) {
        this.LTEXT = LTEXT;
    }

    public String getMCTXT() {
        return MCTXT;
    }

    public void setMCTXT(String MCTXT) {
        this.MCTXT = MCTXT;
    }

    @Override
    public String toString() {
        return "CEPCT{" +
                "SPRAS='" + SPRAS + '\'' +
                ", PRCTR='" + PRCTR + '\'' +
                ", DATBI='" + DATBI + '\'' +
                ", KOKRS='" + KOKRS + '\'' +
                ", KTEXT='" + KTEXT + '\'' +
                ", LTEXT='" + LTEXT + '\'' +
                ", MCTXT='" + MCTXT + '\'' +
                '}';
    }
}
