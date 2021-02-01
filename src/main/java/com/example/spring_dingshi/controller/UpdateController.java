package com.example.spring_dingshi.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.Dao.BasicDao;
import com.example.spring_dingshi.entity.ET_MARA;
import com.example.spring_dingshi.entity.ET_MARC;
import com.example.spring_dingshi.entity.ET_MVKE;
import com.example.spring_dingshi.entity.MaterialData;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 实现物料主数据的更新操作
 */
@RestController
@RequestMapping(value = "master")
public class UpdateController {
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    BasicDao basicDao;
    @RequestMapping(value = "modify" , method = RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public JSONObject getByJSON(@RequestBody String materialData) {
        JSONObject newData = JSONObject.parseObject(materialData);
        List<Map<String,String>> et_mara_list = (List<Map<String,String>>) newData.get("ET_MARA");
        List<Map<String,String>> et_marc_list = (List<Map<String,String>>) newData.get("ET_MARC");
        List<Map<String,String>> et_mvke_list = (List<Map<String,String>>) newData.get("ET_MVKE");
        JSONObject returnObj = new JSONObject();
        JSONArray returnArr = new JSONArray();
        if ((null!=et_mara_list)||(null!=et_marc_list)||(null!=et_mvke_list)){
            if (null!=et_mara_list){
                for (Map<String,String> map:et_mara_list){
                    try {
                        JSONObject result = new JSONObject();
                        String MATNR=map.get("MATNR");
                        String MAKTX=map.get("MAKTX");
                        ET_MARA etMara = basicDao.getET_MARA(MATNR,MAKTX);
                        if(null==etMara|| "".equals(etMara)){
                            basicDao.insertET_MARA(map);
                        }else {
                            basicDao.updateET_MARA(map);
                        }
                        result.put("MSG", "编码"+MATNR+"数据更新成功");
                        returnArr.add(result);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
            returnObj.put("RETURN_INFO",returnArr);
            if (null!=et_marc_list){
                for (Map<String,String> map:et_marc_list){
                    String MATNR=map.get("MATNR");
                    String WERKS=map.get("WERKS");
                    ET_MARC etMarc = basicDao.getET_MARC(MATNR,WERKS);
                    if (null==etMarc){
                        basicDao.insertET_MARC(map);
                    }else {
                        basicDao.updateET_MARC(map);
                    }
                }
            }
            if (null!=et_mvke_list){
                for (Map<String,String> map:et_mvke_list){
                    String MATNR=map.get("MATNR");
                    String VKORG=map.get("VKORG");
                    String VTWEG=map.get("VTWEG");
                    String DWERK=map.get("DWERK");
                    String KTGRM=map.get("KTGRM");
                    String MTPOS=map.get("MTPOS");
                    List<ET_MVKE> et_mvkeList = basicDao.getET_MVKE(MATNR,VKORG,VTWEG,DWERK,KTGRM,MTPOS);
                    if (null==et_mvkeList){
                        basicDao.insertET_MVKE(map);
                    }else {
                        //System.out.println("数据存在");
                    }
                }
            }
            returnObj.put("ECODE", "S");
        }
        else{
            returnObj.put("MSG", "本次无数据更新");
            returnObj.put("ECODE", "E");
        }
        return returnObj;

    }
}