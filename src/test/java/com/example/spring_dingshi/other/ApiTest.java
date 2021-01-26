package com.example.spring_dingshi.other;

import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.Dao.BasicDao;
import com.example.spring_dingshi.entity.T024E;
import okhttp3.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * okhttp方式一次请求多条数据
 */
public class ApiTest {
    public static void main(String[] args) throws IOException {
        long startTime=System.currentTimeMillis();
        String requestPath = "http://10.10.10.30:50000/RESTAdapter/OA/S0034VMget";
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS)
                .build();
        String param = " {\n" +
                "    \"PARTNER\": \"\"\n" +
                "}";
        RequestBody body = RequestBody.create(MediaType.get("application/json; charset=utf-8"), param);
        Request request = new Request.Builder()
                .addHeader("Authorization", "Basic WlBPVVNFUk9BOjFxYXpAV1NYM2VkYzw+")
                .url(requestPath)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
            //System.out.println("post2返回状态：" + response.code());
            //System.out.println("post2返回结果：" + response.body().string());
        String redata = response.body().string();
        //System.out.println(data);
        JSONObject data = JSONObject.parseObject(redata);
        System.out.println(data);
        /*Set set = data.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("耗时"+(endTime-startTime))*/;
            //JSONObject database = JSONObject.parseObject(data);
            //System.out.println(data);
            //JSONObject one = database.getJSONObject("MT_PaymentDataTransfer_Out_Resp");
            //String esg = one.getString("E_CODE");
            //System.out.println(esg);
           /* JSONObject one = database.getJSONObject("E_JSON");
            //JSONArray itable = one.getJSONArray("ITABLE");
            if (one==null){
                System.out.println("结果不存在");
            }else {
*//*                List<Map<String,Object>> list = (List<Map<String, Object>>) one.get("ITABLE");
                for(Map<String,Object> map:list) {
                    System.out.println(map);
                    T024E t024E = new T024E();
                    t024E.setEKORG((String) map.get("EKORG"));
                    t024E.setEKOTX((String) map.get("EKOTX"));
                    System.out.println(t024E);
                    basicDao.insertT024E(t024E);
                }*//*
*//*                List<Map<String,String>> list = (List<Map<String,String>>) one.get("ITABLE");
                for (Map<String,String> map:list){

                }*//*
            }*/
        }
}
