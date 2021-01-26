package com.example.spring_dingshi.other;


import com.alibaba.fastjson.JSON;
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
public class Test {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        String requestPath = "http://10.10.10.32:50000/RESTAdapter/OA/S0035MaterialGet";
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(50, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS)
                .build();
        String param ="{\n" +
                "    \"I_MTART\": \"Z001\"\n" +
                "}\n";
        RequestBody body = RequestBody.create(MediaType.get("application/json; charset=utf-8"), param);
        Request request = new Request.Builder()
                .addHeader("Authorization", "Basic WlBPVVNFUjoxcWF6QFdTWA==")
                .url(requestPath)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        String redata = response.body().string();
        //JSONObject data = JSONObject.parseObject(redata);
        //JSONObject database = data.getJSONObject("IDATA");
        System.out.println(redata);
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-startTime)+"毫秒");
    }
}
