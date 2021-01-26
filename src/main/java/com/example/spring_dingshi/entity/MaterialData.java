package com.example.spring_dingshi.entity;

import java.util.List;

public class MaterialData {
    private List<ET_MARA> et_maras;
    private List<ET_MARC> et_marcs;
    private List<ET_MVKE> et_mvkes;

    public List<ET_MARA> getEt_maras() {
        return et_maras;
    }

    public void setEt_maras(List<ET_MARA> et_maras) {
        this.et_maras = et_maras;
    }

    public List<ET_MARC> getEt_marcs() {
        return et_marcs;
    }

    public void setEt_marcs(List<ET_MARC> et_marcs) {
        this.et_marcs = et_marcs;
    }

    public List<ET_MVKE> getEt_mvkes() {
        return et_mvkes;
    }

    public void setEt_mvkes(List<ET_MVKE> et_mvkes) {
        this.et_mvkes = et_mvkes;
    }

    @Override
    public String toString() {
        return "MaterialData{" +
                "et_maras=" + et_maras +
                ", et_marcs=" + et_marcs +
                ", et_mvkes=" + et_mvkes +
                '}';
    }
}
