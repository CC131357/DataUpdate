package com.example.spring_dingshi.config;

/**
 *
 */
public class ApiConstant {
    //物料主数据查询接口，适用于物料主数据查询以及采购申请流程物料编码查询
    public static final String REQUESTPATH = "http://10.10.10.30:50000/RESTAdapter/OA/S0035MaterialGet";
    public static final String I_MATNR = "{\n" +
            "    \"I_MTART\": \"Z001\"\n" +
            "}\n";
    public static final String SUPPLIERURL = "http://10.10.10.30:50000/RESTAdapter/OA/S0034VMget";

}
