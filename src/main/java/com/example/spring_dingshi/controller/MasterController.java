package com.example.spring_dingshi.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.Dao.BasicDao;
import com.example.spring_dingshi.config.ApiConstant;
import com.example.spring_dingshi.config.Constant;
import com.example.spring_dingshi.rfcUtil.ConnectPooledTest;
import com.example.spring_dingshi.util.ApiUtil;
import com.example.spring_dingshi.util.CustomUtil;
import com.example.spring_dingshi.util.MaterialGet;
import com.example.spring_dingshi.util.SupplierGet;
import com.sap.conn.jco.JCoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

//@EnableScheduling
@RestController
@RequestMapping("/other")
public class MasterController {
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    BasicDao basicDao;
    @Autowired
    ApiUtil apiUtil;
    @Autowired
    MaterialGet materialGet;
    @Autowired
    CustomUtil customUtil;
    @Autowired
    private ConnectPooledTest connectPooledTest;
    @Autowired
    SupplierGet supplierGet;

    /**
     * 插入ET_MARC数据
     */
    @RequestMapping("/insertET_MARC")
    @Scheduled(cron = "0/60 * * * * ?")
    public void et_marc(){
        basicDao.deleteET_MARC();
        System.out.println("表ET_MARC执行时间："+ LocalDateTime.now());
        JSONObject data = materialGet.materialGet(Constant.Z007);
        List<Map<String,String>> et_mara_list = (List<Map<String,String>>) data.get("ET_MARC");
        for (Map<String,String> map:et_mara_list){
            basicDao.insertET_MARC(map);
        }
        JSONObject data1 = materialGet.materialGet(Constant.Z008);
        List<Map<String,String>> et_mara_list1 = (List<Map<String,String>>) data1.get("ET_MARC");
        for (Map<String,String> map:et_mara_list1){
            basicDao.insertET_MARC(map);
        }
        JSONObject data2 = materialGet.materialGet(Constant.Z009);
        List<Map<String,String>> et_mara_list2 = (List<Map<String,String>>) data2.get("ET_MARC");
        for (Map<String,String> map:et_mara_list2){
            basicDao.insertET_MARC(map);
        }
        JSONObject data3 = materialGet.materialGet(Constant.Z010);
        List<Map<String,String>> et_mara_list3 = (List<Map<String,String>>) data3.get("ET_MARC");
        for (Map<String,String> map:et_mara_list3){
            basicDao.insertET_MARC(map);
        }
        System.out.println("表ET_MARC执行成功");
    }
    /**
     * 插入ET_MVKE数据
     */
    @RequestMapping("/insertET_MVKE")
    @Scheduled(cron = "0/60 * * * * ?")
    public void et_mvke(){
        basicDao.deleteET_MVKE();
        System.out.println("表ET_MVKE执行时间："+ LocalDateTime.now());
        JSONObject data = materialGet.materialGet(Constant.Z007);
        List<Map<String,String>> et_mara_list = (List<Map<String,String>>) data.get("ET_MVKE");
        for (Map<String,String> map:et_mara_list){
            basicDao.insertET_MVKE(map);
        }
        JSONObject data1 = materialGet.materialGet(Constant.Z008);
        List<Map<String,String>> et_mara_list1 = (List<Map<String,String>>) data1.get("ET_MVKE");
        for (Map<String,String> map:et_mara_list1){
            basicDao.insertET_MVKE(map);
        }
        JSONObject data2 = materialGet.materialGet(Constant.Z009);
        List<Map<String,String>> et_mara_list2 = (List<Map<String,String>>) data2.get("ET_MVKE");
        for (Map<String,String> map:et_mara_list2){
            basicDao.insertET_MVKE(map);
        }
        JSONObject data3 = materialGet.materialGet(Constant.Z010);
        List<Map<String,String>> et_mara_list3 = (List<Map<String,String>>) data3.get("ET_MVKE");
        for (Map<String,String> map:et_mara_list3){
            basicDao.insertET_MVKE(map);
        }
        System.out.println("表ET_MVKE执行成功");
    }
    /**
     * 插入成品物料
     * rfc函数方式获取
     */
    //@RequestMapping("/insertZ001")
    //@Scheduled(cron = "0 */10 * * * ?")
    public void z001() throws JCoException {
        basicDao.deleteZ001();
        System.out.println("表Z001执行时间："+ LocalDateTime.now());
        List<Map> data = connectPooledTest.get();
        for (Map map:data){
            basicDao.insertZ001(map);
        }
        System.out.println("表Z001执行成功");
    }
    /**
     * 插入劳保数据
     */
    @RequestMapping("/insertLabour")
    @Scheduled(cron = "0/120 * * * * ?")
    public void labour(){
        basicDao.deleteLabour();
        System.out.println("表Labour执行时间："+ LocalDateTime.now());
        JSONObject data = materialGet.materialGet(Constant.Z007);
        List<Map<String,String>> et_mara_list = (List<Map<String,String>>) data.get("ET_MARA");
        for (Map<String,String> map:et_mara_list){
            basicDao.insertLabour(map);
        }
        JSONObject data1 = materialGet.materialGet(Constant.Z008);
        List<Map<String,String>> et_mara_list1 = (List<Map<String,String>>) data1.get("ET_MARA");
        for (Map<String,String> map:et_mara_list1){
            basicDao.insertLabour(map);
        }
        JSONObject data2 = materialGet.materialGet(Constant.Z009);
        List<Map<String,String>> et_mara_list2 = (List<Map<String,String>>) data2.get("ET_MARA");
        for (Map<String,String> map:et_mara_list2){
            basicDao.insertLabour(map);
        }
        JSONObject data3 = materialGet.materialGet(Constant.Z010);
        List<Map<String,String>> et_mara_list3 = (List<Map<String,String>>) data3.get("ET_MARA");
        for (Map<String,String> map:et_mara_list3){
            basicDao.insertLabour(map);
        }
        System.out.println("表Labour执行成功");
    }

    /**
     * 插入客户主数据
     */
    //@RequestMapping("/insertMasterCustom")
    //@Scheduled(cron = "0/60 * * * * ?")
    public void masterCustom(){
        basicDao.deleteMasterCustom();
        System.out.println("表MasterCustom执行时间："+ LocalDateTime.now());
        JSONObject data = customUtil.customGet();
        List<Map<String,String>> list = (List<Map<String,String>>) data.get("IT_KNA");
        for (Map item:list){
            basicDao.insertMasterCustom(item);
        }
        System.out.println("表MasterCustom执行成功");
    }

    /**
     * 插入客户主数据
     */
    //@RequestMapping("/insertCustom")
    //@Scheduled(cron = "0/60 * * * * ?")
    public void custom1(){
        basicDao.deleteCustom1();
        System.out.println("表Custom执行时间："+ LocalDateTime.now());
        JSONObject data = customUtil.customGet();
        List<Map<String,String>> list = (List<Map<String,String>>) data.get("IT_KNB");
        for (Map item:list){
            basicDao.insertCustom1(item);
        }
        System.out.println("表Custom执行成功");
    }

    /**
     * 银行信息，耗时操作
     * 插入BNKA数据
     */
    //@RequestMapping("/insertBNKA")
    //@Scheduled(cron = "0 */6 * * * ?")
    public void bnka(){
        basicDao.deleteBNKA();
        System.out.println("表BNKA执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.BNKA);
        if (data==null){
            System.out.println("BNKA结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertBNKA(map);
            }
        }
        System.out.println("BNKA表执行完成");
    }

    /**
     *
     * 插入供应商主数据
     */
    @RequestMapping("/insertSupplier")
    @Scheduled(cron = "0/60 * * * * ?")
    public void supplier(){
        basicDao.deleteSupplier();
        System.out.println("表Supplier执行时间："+ LocalDateTime.now());
        JSONObject data = supplierGet.supplierGet(Constant.SUPPLIER);
        if (data==null){
            System.out.println("Supplier结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ET_DATA");
            for (Map<String,String> map:list){
                basicDao.insertSupplier(map);
            }
        }
        System.out.println("Supplier表执行完成");
    }

}
