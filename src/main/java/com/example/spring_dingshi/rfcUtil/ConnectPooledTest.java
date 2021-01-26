package com.example.spring_dingshi.rfcUtil;

import com.sap.conn.jco.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * rfc方式调用物料主数据接口
 */
@Component
public class ConnectPooledTest {
    public List<Map> get()throws JCoException {
        String bapiFunctionName = "ZOAMMFU002";
        JCoDestination destination = JCoDestinationManager.getDestination(ConnectPooled.ABAP_AS_POOLED);
        JCoRepository repository = destination.getRepository();                 //JCoFunction是一个接口，代表SAP系统的函数库
        JCoFunction function = repository.getFunction(bapiFunctionName);     // 从这个函数模板获得该SAP函数的对象
        function.execute(destination);
        JCoParameterList output = function.getExportParameterList();
        // 获得Export变量列表。
        JCoParameterList export = function.getTableParameterList();
        JCoTable table = export.getTable("ET_MARA");

        //int value = output.getInt("ET_MARA");
        //System.out.println(table);
        /*for (JCoField jCoField : table) {
            System.out.println(jCoField);
        }*/
        boolean loopFlag1 = !table.isEmpty();  //判断 这张表中有木有数据
        List<Map> list = new ArrayList();
        while(loopFlag1){ //循环获取数据
            String MATNR = table.getString("MATNR");  //根据表字段来获取值
            String MAKTX = table.getString("MAKTX");
            String MATKL = table.getString("MATKL");  //根据表字段来获取值
            String WGBEZ = table.getString("WGBEZ");
            String MTART = table.getString("MTART");
            String MTBEZ = table.getString("MTBEZ");  //根据表字段来获取值
            HashMap<String,String> hm= new HashMap<String,String>();
            hm.put("MATNR", MATNR);
            hm.put("MAKTX", MAKTX);
            hm.put("MATKL", MATKL);
            hm.put("WGBEZ", WGBEZ);
            hm.put("MTART", MTART);
            hm.put("MTBEZ", MTBEZ);
            list.add(hm);
            loopFlag1 = table.nextRow(); // 移动到下一行
        }
        return list;
    }
}
