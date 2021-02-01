package com.example.spring_dingshi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.example.spring_dingshi.Dao.PlateMapper;
import com.example.spring_dingshi.entity.Plate;
import com.example.spring_dingshi.service.PlateService;
import com.example.spring_dingshi.util.IPUtil;
import com.example.spring_dingshi.util.SupplierGet;
import com.example.spring_dingshi.util.impl.IPUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UploadController {

    @Autowired
    //private UserService userService;
    private PlateService plateService;
    @Autowired
    private IPUtil ipUtil;
    @Autowired
    private PlateMapper plateMapper;

    /**
     * 上传excel页面
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/import")
    @ResponseBody
    public String excelImport(@RequestParam(value = "filename") MultipartFile file, HttpSession session, HttpServletRequest request) {
        int result = 0;
        try {
            //result = userService.addUser(file);
            result = plateService.addPlate(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result > 0) {
            String ip = ipUtil.getIpAddr(request);
            Date day=new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = df.format(day);
            plateMapper.addIP(ip,time);
            return "excel文件数据导入成功！";
        } else if (-1 == result) {
            return "文档不是.xlsx格式";
        } else {
            return "excel数据导入失败！";
        }
    }
    @RequestMapping("/download")
    public void downLoad(HttpServletResponse response) throws Exception {
/*        String filename= "板材型号模板.xlsx";
        *//*File file = ResourceUtils.getFile("classpath:templates/板材型号模板.xlsx");*//*
        ApplicationHome applicationHome = new ApplicationHome(UploadController.class);
        String rootPath = applicationHome.getSource().getParentFile().toString();
        String configFilePath = rootPath + "/templates/板材型号模板.xlsx";
        File file = new File(configFilePath);
        if(file.exists()){
            response.setContentType("application/octet-stream");
            response.setHeader("content-type", "application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(filename,"utf8"));
            byte[] buffer = new byte[1024];
            //输出流
            OutputStream os = null;
            try(FileInputStream fis= new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);) {
                os = response.getOutputStream();
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/

        InputStream inputStream = null;
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource=resourceLoader.getResource("classpath:templates/板材型号模板.xlsx");
        BufferedInputStream bis=null;
        try {
            inputStream=resource.getInputStream();
            String fileName="板材型号模板.xlsx";
            response.addHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
            response.addHeader(HttpHeaders.CONTENT_TYPE,"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            BufferedOutputStream bos = new BufferedOutputStream(
                    response.getOutputStream());
            bis = new BufferedInputStream(inputStream);
            byte[] b=new byte[1024];
            int i = bis.read(b);
            while (i != -1) {
                bos.write(b, 0, b.length);
                bos.flush();
                i = bis.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

