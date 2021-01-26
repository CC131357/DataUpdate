package com.example.spring_dingshi.other;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * httpurlconnection
 */
public class TestApi2 {
    // 短信接口测试 
    public static void main(String[] args) throws Exception {
        long startTime=System.currentTimeMillis();
        URL wsUrl = new URL("http://10.10.10.31:50000/RESTAdapter/OA/S0035MaterialGet");
        //请求体
        String st = "{\n" +
                "    \"I_MATNR\": \"\"\n" +
                "}";
        HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();
            // 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在 http正文内，因此需要设为true, 默认情况下是false;
        conn.setDoInput(true);
            // 设置是否从httpUrlConnection读入，默认情况下是true;
        conn.setDoOutput(true);
            // 设定请求的方法为"POST"，默认是GET 
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-type", "application/json");
        conn.setRequestProperty("Authorization", "Basic WlBPVVNFUjoxcWF6QFdTWA==");
        conn.connect();
        OutputStream os = conn.getOutputStream();
        os.write(st.getBytes());
            // 从流中读取响应信息
        InputStream is = conn.getInputStream();
        StringBuffer sb = new StringBuffer();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        char[] b = new char[1024*1024*10];
        for(int n; (n = isr.read(b)) != -1;) {
            sb.append(new String(b, 0, n));
        }
        String returnStr = sb.toString();
        System.out.println(returnStr);
        long endTime=System.currentTimeMillis();
        System.out.println("httpurlconnection耗时"+(endTime-startTime));

    }


}
