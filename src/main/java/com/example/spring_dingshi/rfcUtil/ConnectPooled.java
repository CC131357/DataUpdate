package com.example.spring_dingshi.rfcUtil;

import com.sap.conn.jco.ext.DestinationDataProvider;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * rfc方式调用物料主数据
 * 参数配置类
 */
@Component
public class ConnectPooled {// 连接池

    static String ABAP_AS_POOLED = "ConnectionPool";    //配置文件名
    static {

        Properties connectProperties = new Properties();
        connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, "10.10.10.20"); // IP
        connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR, "00"); // 系统编号
        connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, "800"); // 客户端编号
        connectProperties.setProperty(DestinationDataProvider.JCO_USER, "OARFC"); // 用户名
        connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, "654321"); // 密码
        connectProperties.setProperty(DestinationDataProvider.JCO_LANG, "ZH"); // 语言// *********连接池方式与直接不同的是设置了下面两个连接属性*******
        // JCO_PEAK_LIMIT - 同时可创建的最大活动连接数，0表示无限制，默认为JCO_POOL_CAPACITY的值
        // 如果小于JCO_POOL_CAPACITY的值，则自动设置为该值，在没有设置JCO_POOL_CAPACITY的情况下为0
        connectProperties.setProperty(DestinationDataProvider.JCO_PEAK_LIMIT, "10");
        // JCO_POOL_CAPACITY - 空闲连接数，如果为0，则没有连接池效果，默认为1
        connectProperties.setProperty(DestinationDataProvider.JCO_POOL_CAPACITY, "2");
        createDataFile(ABAP_AS_POOLED, "jcoDestination", connectProperties);
    }

    /* 创建连接池的配置文件 */
    static void createDataFile(String name, String suffix, Properties properties) {
        File cfg = new File(name + "." + suffix);
        if (!cfg.exists()) {
            try {
                FileOutputStream fos = new FileOutputStream(cfg, false);
                properties.store(fos, "for tests only !");
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}