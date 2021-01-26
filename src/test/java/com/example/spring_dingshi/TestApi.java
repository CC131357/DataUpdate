package com.example.spring_dingshi;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.spring_dingshi.config.Constant;
import okhttp3.*;

import java.io.IOException;
import java.util.Set;

public class TestApi {
    public static void main(String[] args) {
        String PATH = "http://192.168.0.48:85/services/HrmService?wsdl";
        String msg= "{ \"IT_QUERY\": [{\"KUNNR\": \"900012\"}]}";
        RequestBody body = RequestBody.create(MediaType.parse("application/soap+xml"), msg);
        Request request = new Request.Builder()
                .addHeader("Content-Type", "application/xml")
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
        //JSONObject database = JSONObject.parseObject(data);
        //JSONArray knaDatas = database.getJSONArray("IT_KNA");
        //JSONArray knbDatas = database.getJSONArray("IT_KNB");
        System.out.println(data);;
    }
}
