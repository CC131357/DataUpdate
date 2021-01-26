package com.example.spring_dingshi;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMM" );
        Date d= new Date();
        String strDate = sdf.format(d);//格式化日期
        System.out.println(strDate);
        String sa = "9000";
        String da =  "{ \"IT_QUERY\": [{\"KUNNR\": \""+sa+"\"}]}";

        double s=200;
        double y = s/1.13*0.13;
        double x = 2.368;
        double h = (double)Math.round(y*100)/100;
        System.out.println(h);
        double ying = s-y;
        System.out.println(y);
        System.out.println(da);
    }
}
