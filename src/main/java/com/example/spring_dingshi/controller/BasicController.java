package com.example.spring_dingshi.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.Dao.BasicDao;
import com.example.spring_dingshi.config.Constant;
import com.example.spring_dingshi.rfcUtil.ConnectPooledTest;
import com.example.spring_dingshi.util.ApiUtil;
import com.example.spring_dingshi.util.CustomUtil;
import com.example.spring_dingshi.util.MaterialGet;
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

/**
 * SAP基础信息更新
 */
@EnableScheduling
@RestController
@RequestMapping("/basic")
public class BasicController {
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
    /**
     * 插入t024e数据
     */
    @RequestMapping("/insertT024E")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t024e(){
        basicDao.deleteT024E();
        System.out.println("表T024E执行时间："+ LocalDateTime.now());
        logger.info("表T024E执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T024E);
        if (data==null){
            System.out.println("T024E结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT024E(map);
            }
        }
    }
    /**
     * 插入t024数据
     */
    @RequestMapping("/insertT024")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t024(){
        basicDao.deleteT024();
        System.out.println("表T024执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T024);
        if (data==null){
            System.out.println("T024结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT024(map);
            }
        }
    }
    /**
     * 插入T001数据
     */
    @RequestMapping("/insertT001")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t001(){
        basicDao.deleteT001();
        System.out.println("表T001执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T001);
        if (data==null){
            System.out.println("T001结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT001(map);
            }
        }
    }
    /**
     * 插入T001W数据
     */
    @RequestMapping("/insertT001W")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t001w(){
        basicDao.deleteT001W();
        System.out.println("表T001W执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T001W);
        if (data==null){
            System.out.println("T001W结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT001W(map);
            }
        }
    }

    /**
     * 插入T001L数据
     */
    @RequestMapping("/insertT001L")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t001l(){
        basicDao.deleteT001L();
        System.out.println("表T001L执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T001L);
        if (data==null){
            System.out.println("T001L结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT001L(map);
            }
        }
    }

    /**
     * 插入T023T数据
     */
    @RequestMapping("/insertT023T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t023t(){
        basicDao.deleteT023T();
        System.out.println("表T023T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T023T);
        if (data==null){
            System.out.println("T023T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT023T(map);
            }
        }
    }



    /**
     * 插入T134T数据
     */
    @RequestMapping("/insertT134T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t134t(){
        basicDao.deleteT134T();
        System.out.println("表T134T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T134T);
        if (data==null){
            System.out.println("T134T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT134T(map);
            }
        }
    }

    /**
     * 插入T077Y数据
     */
    @RequestMapping("/insertT077Y")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t077y(){
        basicDao.deleteT077Y();
        System.out.println("表T077Y执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T077Y);
        if (data==null){
            System.out.println("T077Y结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT077Y(map);
            }
        }
    }

    /**
     * 插入T007S数据
     */
    @RequestMapping("/insertT007S")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t007s(){
        basicDao.deleteT007S();
        System.out.println("表T007S执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T007S);
        if (data==null){
            System.out.println("T007S结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT007S(map);
            }
        }
    }

    /**
     * 插入T161T数据
     */
    @RequestMapping("/insertT161T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t161t(){
        basicDao.deleteT161T();
        System.out.println("表T161T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T161T);
        if (data==null){
            System.out.println("T161T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT161T(map);
            }
        }
    }

    /**
     * 插入T077X数据
     */
    @RequestMapping("/insertT077X")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t077x(){
        basicDao.deleteT077X();
        System.out.println("表T077X执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T077X);
        if (data==null){
            System.out.println("T077X结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT077X(map);
            }
        }
    }

    /**
     * 插入T005T数据
     */
    @RequestMapping("/insertT005T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t005t(){
        basicDao.deleteT005T();
        System.out.println("表T005T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T005T);
        if (data==null){
            System.out.println("T005T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT005T(map);
            }
        }
    }

    /**
     * 插入T005U数据
     */
    @RequestMapping("/insertT005U")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t005u(){
        basicDao.deleteT005U();
        System.out.println("表T005U执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T005U);
        if (data==null){
            System.out.println("T005U结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT005U(map);
            }
        }
    }

    /**
     * 插入T151T数据
     */
    @RequestMapping("/insertT151T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t151t(){
        basicDao.deleteT151T();
        System.out.println("表T151T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T151T);
        if (data==null){
            System.out.println("T151T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT151T(map);
            }
        }
    }

    /**
     * 插入T188T数据
     */
    @RequestMapping("/insertT188T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t188t(){
        basicDao.deleteT188T();
        System.out.println("表T188T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T188T);
        if (data==null){
            System.out.println("T188T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT188T(map);
            }
        }
    }

    /**
     * 插入T151T数据
     */
    @RequestMapping("/insertT171T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t171t(){
        basicDao.deleteT171T();
        System.out.println("表T171T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T171T);
        if (data==null){
            System.out.println("T171T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT171T(map);
            }
        }
    }

    /**
     * 插入T052U数据
     */
    @RequestMapping("/insertT052U")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t052u(){
        basicDao.deleteT052U();
        System.out.println("表T052U执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T052U);
        if (data==null){
            System.out.println("T052U结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT052U(map);
            }
        }
    }

    /**
     * 插入T042ZT数据
     */
    @RequestMapping("/insertT042ZT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t042zt(){
        basicDao.deleteT042ZT();
        System.out.println("表T042ZT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T042ZT);
        if (data==null){
            System.out.println("T042ZT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT042ZT(map);
            }
        }
    }

    /**
     * 插入TVKOT数据
     */
    @RequestMapping("/insertTVKOT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tvkot(){
        basicDao.deleteTVKOT();
        System.out.println("表TVKOT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TVKOT);
        if (data==null){
            System.out.println("TVKOT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTVKOT(map);
            }
        }
    }

    /**
     * 插入TVTWT数据
     */
    @RequestMapping("/insertTVTWT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tvtwt(){
        basicDao.deleteTVTWT();
        System.out.println("表TVTWT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TVTWT);
        if (data==null){
            System.out.println("TVTWT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTVTWT(map);
            }
        }
    }

    /**
     * 插入TVKBT数据
     */
    @RequestMapping("/insertTVKBT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tvkbt(){
        basicDao.deleteTVKBT();
        System.out.println("表TVKBT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TVKBT);
        if (data==null){
            System.out.println("TVKBT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTVKBT(map);
            }
        }
    }

    /**
     * 插入TVGRT数据
     */
    @RequestMapping("/insertTVGRT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tvgrt(){
        basicDao.deleteTVGRT();
        System.out.println("表TVGRT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TVGRT);
        if (data==null){
            System.out.println("TVGRT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTVGRT(map);
            }
        }
    }
    /**
     * 插入TINCT数据
     */
    @RequestMapping("/insertTINCT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tinct(){
        basicDao.deleteTINCT();
        System.out.println("表TINCT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TINCT);
        if (data==null){
            System.out.println("TINCT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTINCT(map);
            }
        }
    }
    /**
     * 插入TCURT数据
     */
    @RequestMapping("/insertTCURT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tcurt(){
        basicDao.deleteTCURT();
        System.out.println("表TCURT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TCURT);
        if (data==null){
            System.out.println("TCURT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTCURT(map);
            }
        }
    }

    /**
     * 插入CSKS数据
     */
    @RequestMapping("/insertCSKT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void csks(){
        basicDao.deleteCSKT();
        System.out.println("表CSKT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.CSKT);
        if (data==null){
            System.out.println("CSKT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertCSKT(map);
            }
        }
    }

    /**
     * 插入ZSKA1数据
     */
    @RequestMapping("/insertZSKA1")
    @Scheduled(cron = "0/60 * * * * ?")
    public void zska1(){
        basicDao.deleteZSKA1();
        System.out.println("表ZSKA1执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.ZSKA1);
        if (data==null){
            System.out.println("ZSKA1结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertZSKA1(map);
            }
        }
    }

    /**
     * 插入ZMMT017数据
     */
    @RequestMapping("/insertZMMT017")
    @Scheduled(cron = "0/60 * * * * ?")
    public void zmmt017(){
        basicDao.deleteZMMT017();
        System.out.println("表ZMMT017执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.ZMMT017);
        if (data==null){
            System.out.println("ZMMT017结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertZMMT017(map);
            }
        }
    }

    /**
     * 插入CEPCT数据
     */
    @RequestMapping("/insertCEPCT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void cepct(){
        basicDao.deleteCEPCT();
        System.out.println("表CEPCT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.CEPCT);
        if (data==null){
            System.out.println("CEPCT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertCEPCT(map);
            }
        }
    }



    /**
     * 插入T438X数据
     */
    @RequestMapping("/insertT438X")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t438x(){
        basicDao.deleteT438X();
        System.out.println("表T438X执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T438X);
        if (data==null){
            System.out.println("T438X结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT438X(map);
            }
        }
    }




    /**
     * 插入T006A数据
     */
    @RequestMapping("/insertT006A")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t006a(){
        basicDao.deleteT006A();
        System.out.println("表T006A执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T006A);
        if (data==null){
            System.out.println("T006A结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT006A(map);
            }
        }
    }

    /**
     * 插入TWEWT数据
     */
    @RequestMapping("/insertTWEWT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void twewt(){
        basicDao.deleteTWEWT();
        System.out.println("表TWEWT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TWEWT);
        if (data==null){
            System.out.println("TWEWT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTWEWT(map);
            }
        }
    }

    /**
     * 插入T024D数据
     */
    @RequestMapping("/insertT024D")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t024d(){
        basicDao.deleteT024D();
        System.out.println("表T024D执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T024D);
        if (data==null){
            System.out.println("T024D结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT024D(map);
            }
        }
    }
    /**
     * 插入LFBK数据
     */
    @RequestMapping("/insertLFBK")
    @Scheduled(cron = "0/60 * * * * ?")
    public void lfbk(){
        basicDao.deleteLFBK();
        System.out.println("表LFBK执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.LFBK);
        if (data==null){
            System.out.println("LFBK结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertLFBK(map);
            }
        }
        System.out.println("表LFBK执行成功");
    }
    /**
     * 插入COAS数据
     */
    @RequestMapping("/insertCOAS")
    @Scheduled(cron = "0/60 * * * * ?")
    public void coas(){
        basicDao.deleteCOAS();
        System.out.println("表COAS执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.COAS);
        if (data==null){
            System.out.println("COAS结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertCOAS(map);
            }
        }
    }
    /**
     * 插入SKAT数据
     */
    @RequestMapping("/insertSKAT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void skat(){
        basicDao.deleteSKAT();
        System.out.println("表SKAT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.SKAT);
        if (data==null){
            System.out.println("SKAT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertSKAT(map);
            }
        }
    }

    /**
     * 插入T173T数据
     */
    @RequestMapping("/insertT173T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t173t(){
        basicDao.deleteT173T();
        System.out.println("表T173T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T173T);
        if (data==null){
            System.out.println("T173T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT173T(map);
            }
        }
    }


    /**
     * 插入T439数据
     */
    @RequestMapping("/insertT439T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t439t(){
        basicDao.deleteT439T();
        System.out.println("表T439T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T439T);
        if (data==null){
            System.out.println("T439T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT439T(map);
            }
        }
    }


    /**
     * 插入T460T数据
     */
    @RequestMapping("/insertT460T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t460t(){
        basicDao.deleteT460T();
        System.out.println("表T460T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T460T);
        if (data==null){
            System.out.println("T460T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT460T(map);
            }
        }
    }

    /**
     * 插入T025T数据
     */
    @RequestMapping("/insertT025T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void t025t(){
        basicDao.deleteT025T();
        System.out.println("表T025T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.T025T);
        if (data==null){
            System.out.println("T025T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertT025T(map);
            }
        }
    }

    /**
     * 插入TSPAT数据
     */
    @RequestMapping("/insertTSPAT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tspat(){
        basicDao.deleteTSPAT();
        System.out.println("表TSPAT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TSPAT);
        if (data==null){
            System.out.println("TSPAT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTSPAT(map);
            }
        }
    }



    /**
     * 插入检验类型TQ30T
     */
    @RequestMapping("/insertTQ30T")
    @Scheduled(cron = "0/60 * * * * ?")
    public void tq30t(){
        basicDao.deleteTQ30T();
        System.out.println("表TQ30T执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.TQ30T);
        if (data==null){
            System.out.println("TQ30T结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertTQ30T(map);
            }
        }
    }



    /**
     * 插入成品物料
     */
    //@RequestMapping("/insertZ001")
    //@Scheduled(cron = "0 */4 * * * ?")
    /*public void z001(){
        basicDao.deleteZ001();
        System.out.println("表Z001执行时间："+ LocalDateTime.now());
        JSONObject data = materialGet.materialGet(Constant.Z001);
        List<Map<String,String>> et_mara_list = (List<Map<String,String>>) data.get("ET_MARA");
        for (Map<String,String> map:et_mara_list){
            basicDao.insertZ001(map);
        }
        System.out.println("表Z001执行成功");
    }*/



    /**
     * LFA1
     */
    @RequestMapping("/insertLFA1")
    @Scheduled(cron = "0/60 * * * * ?")
    public void lfa1(){
        basicDao.deleteLFA1();
        System.out.println("表LFA1执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.LFA1);
        if (data==null){
            System.out.println("LFA1结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertLFA1(map);
            }
        }
        System.out.println("LFA1执行完成");
    }

    /**
     * EQKT 设备编码
     */
    @RequestMapping("/insertEQKT")
    @Scheduled(cron = "0/60 * * * * ?")
    public void eqkt(){
        basicDao.deleteEQKT();
        System.out.println("表EQKT执行时间："+ LocalDateTime.now());
        JSONObject data = apiUtil.invokeApi(Constant.EQKT);
        if (data==null){
            System.out.println("EQKT结果集不存在");
        }else {
            List<Map<String,String>> list = (List<Map<String,String>>) data.get("ITABLE");
            for (Map<String,String> map:list){
                basicDao.insertEQKT(map);
            }
        }
        System.out.println("EQKT执行完成");
    }

}
