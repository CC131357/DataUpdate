package com.example.spring_dingshi.other;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * httpurlconnection方式请求多个接口
 */
public class HttpUrl {
    public static void main(String[] args) throws Exception {
        updateNotice("http://10.10.10.31:50000/RESTAdapter/CA/GetSAPinfo");
    }
    private static void updateNotice(String url) throws Exception {
        //设置请求数据
        String json = "[{\n" +
                "\t\"I_FIELDS\":\"EKORG/EKOTX\",\n" +
                "\t\"I_TABLE\":\"T024E\"\n" +
                "},\n" +
                "{\n" +
                "\t\"I_FIELDS\":\"BUKRS/BUTXT\",\n" +
                "\t\"I_TABLE\":\"T001\"\n" +
                "},\n" +
                "{\n" +
                "\t\"I_FIELDS\":\"EKGRP/EKNAM\",\n" +
                "\t\"I_TABLE\":\"T024\"\n" +
                "}]";
        JSONArray jsonArray = JSONArray.parseArray(json);
        for (int i=0;i<jsonArray.size();i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String st = JSONObject.toJSONString(jsonObject);
            System.out.println(st);
            // Post请求的url，与get不同的是不需要带参数
            URL postUrl = new URL(url);
            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
            // 设置是否向connection输出，因为这个是post请求，参数要放在http正文内，因此需要设为true
            connection.setDoOutput(true);
            // Read from the connection. Default is true.
            connection.setDoInput(true);
            // 默认是 GET方式
            connection.setRequestMethod("POST");
            // Post 请求不能使用缓存
            connection.setUseCaches(false);
            //设置本次连接是否自动重定向
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Authorization", "Basic WlBPVVNFUjoxcWF6QFdTWA==");
            connection.setRequestProperty("Content-Type", "\"application/json\"");
            // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
            // 要注意的是connection.getOutputStream会隐含的进行connect。
            connection.connect();
            DataOutputStream out = new DataOutputStream(connection
                    .getOutputStream());
            // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写到流里面
            out.writeBytes(st);
            //流用完记得关
            out.flush();
            out.close();
            //获取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            //结束,记得把连接断了
            connection.disconnect();

        }

    }
}
