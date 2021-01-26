package com.example.spring_dingshi.util.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.config.Constant;
import com.example.spring_dingshi.util.ApiUtil;
import okhttp3.*;

import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Component
public class ApiUtilImpl implements ApiUtil {

    public JSONObject invokeApi(String param) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS)
                .build();
        RequestBody body = RequestBody.create(MediaType.get("application/json; charset=utf-8"), (param));
        Request request = new Request.Builder()
                .addHeader("Authorization", "Basic WlBPVVNFUk9BOjFxYXpAV1NYM2VkYzw+")
                .url(Constant.REQUESTPATH)
                .post(body)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = null;
        try {
            data = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject database = JSONObject.parseObject(data);
        JSONObject one = database.getJSONObject("E_JSON");
        return one;
    }

}
