package com.example.spring_dingshi.util.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.spring_dingshi.config.Constant;
import com.example.spring_dingshi.entity.MsterCustom;
import com.example.spring_dingshi.util.CustomUtil;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class CustomUtilImpl implements CustomUtil {
    final String PATH = "http://10.10.10.30:50000/RESTAdapter/OA/S0002CMget";
    @Override
    public JSONObject customGet() {
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        JSONObject approveJson =new JSONObject();
        approveJson.put("KUNNR","");
        array.add(approveJson);
        object.put("IT_QUERY",array);
        String msg = object.toString();
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), msg);
        Request request = new Request.Builder()
                .addHeader("Authorization", "Basic WlBPVVNFUk9BOjFxYXpAV1NYM2VkYzw+")
                .url(PATH)
                .post(body)
                .build();
        Response response = null;
        try {
            response = new OkHttpClient().newCall(request).execute();
        } catch (IOException e) {
        }
        String data = null;
        try {
            data = response.body().string();
        } catch (IOException e) {
        }
        JSONObject database = JSONObject.parseObject(data);
        return database;

    }
}
