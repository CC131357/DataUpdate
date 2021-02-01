package com.example.spring_dingshi.service.Impl;


import com.example.spring_dingshi.Dao.PlateMapper;
import com.example.spring_dingshi.entity.Plate;
import com.example.spring_dingshi.service.PlateService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlateServiceImpl implements PlateService {
    @Autowired
    private PlateMapper plateMapper;

    @Override
    public int addPlate(MultipartFile file) throws Exception{
        int result = 0;
        List<Plate> plateList = new ArrayList<>();
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
        //System.out.println("suffix="+suffix);
        InputStream ins = file.getInputStream();
        Workbook wb = null;
        if(suffix.equals("xlsx")){
            wb = new XSSFWorkbook(ins);
        }else{
            return -1;
        }
        Sheet sheet = wb.getSheetAt(0);
        if(null != sheet){
            for(int line = 1; line <= sheet.getLastRowNum();line++){
                Plate plate = new Plate();
                Row row = sheet.getRow(line);
                if(null == row){
                    continue;
                }
/*                if(1 != row.getCell(0).getCellType()){
                    throw new MyException("单元格类型不是文本类型！");
                }
                row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                String VENDOR = row.getCell(0,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();*/
                String VENDOR = getValue(row,0);
/*                String FAMILY=null;
                if (null==row.getCell(1)){
                    FAMILY="";
                }
                else {
                    row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
                    FAMILY = row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String THK_MM=null;
                if (null==row.getCell(2)){
                    THK_MM="";
                }
                else {
                    row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
                    THK_MM = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String PP_TYPE;
                if (null==row.getCell(3)){
                    PP_TYPE="";
                }
                else {
                    row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
                    PP_TYPE = row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String RC=null;
                if (null==row.getCell(4)){
                    RC="";
                }
                else {
                    row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
                    RC = row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String THK_GLASS_UM=null;
                if (null==row.getCell(5)){
                    THK_GLASS_UM="";
                }
                else {
                    row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
                    THK_GLASS_UM = row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String RESIN_FLOW_TYPE=null;
                if (null==row.getCell(6)){
                    RESIN_FLOW_TYPE="";
                }
                else {
                    row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
                    RESIN_FLOW_TYPE = row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String IS_NORMAL_SITE=null;
                if (null==row.getCell(7)){
                    IS_NORMAL_SITE="";
                }
                else {
                    row.getCell(7).setCellType(Cell.CELL_TYPE_STRING);
                    IS_NORMAL_SITE = row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }
                String DK_1G=null;
                if (null==row.getCell(8)){
                    DK_1G="";
                }
                else {
                    row.getCell(8).setCellType(Cell.CELL_TYPE_STRING);
                    DK_1G = row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                }*/
                String FAMILY = getValue(row,1);
                String THK_MM = getValue(row,2);
                String PP_TYPE = getValue(row,3);
                String RC = getValue(row,4);
                String THK_GLASS_UM = getValue(row,5);
                String RESIN_FLOW_TYPE = getValue(row,6);
                String IS_NORMAL_SITE = getValue(row,7);
                String DK_1G = getValue(row,8);
                String DK_2G = getValue(row,9);
                String DK_3G = getValue(row,10);
                String DK_4G = getValue(row,11);
                String DK_5G = getValue(row,12);
                String DK_6G = getValue(row,13);
                String DK_7G = getValue(row,14);
                String DK_8G = getValue(row,15);
                String DK_9G = getValue(row,16);
                String DK_10G = getValue(row,17);
                String DK_15G = getValue(row,18);
                String DK_20G = getValue(row,19);
                String DF_1G = getValue(row,20);
                String DF_2G = getValue(row,21);
                String DF_3G = getValue(row,22);
                String DF_4G = getValue(row,23);
                String DF_5G = getValue(row,24);
                String DF_6G = getValue(row,25);
                String DF_7G = getValue(row,26);
                String DF_8G = getValue(row,27);
                String DF_9G = getValue(row,28);
                String DF_10G = getValue(row,29);
                String DF_15G = getValue(row,30);
                String DF_20G = getValue(row,31);
                String HAS_CU = getValue(row,32);
                String CU_W = getValue(row,33);
                String IS_NORMAL = getValue(row,34);
                String HAS_IMPORT = getValue(row,35);
                String IS_HF = getValue(row,36);
                String IS_PB = getValue(row,37);
                String IS_CAF = getValue(row,38);
                String MIN_TG = getValue(row,39);
                String CTI = getValue(row,40);
/*                row.getCell(9).setCellType(Cell.CELL_TYPE_STRING);
                String DK_2G = row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(10).setCellType(Cell.CELL_TYPE_STRING);
                String DK_3G = row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(11).setCellType(Cell.CELL_TYPE_STRING);
                String DK_4G = row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(12).setCellType(Cell.CELL_TYPE_STRING);
                String DK_5G = row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(13).setCellType(Cell.CELL_TYPE_STRING);
                String DK_6G = row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(14).setCellType(Cell.CELL_TYPE_STRING);
                String DK_7G = row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(15).setCellType(Cell.CELL_TYPE_STRING);
                String DK_8G = row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(16).setCellType(Cell.CELL_TYPE_STRING);
                String DK_9G = row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(17).setCellType(Cell.CELL_TYPE_STRING);
                String DK_10G = row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(18).setCellType(Cell.CELL_TYPE_STRING);
                String DK_15G = row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(19).setCellType(Cell.CELL_TYPE_STRING);
                String DK_20G = row.getCell(19, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(20).setCellType(Cell.CELL_TYPE_STRING);
                String DF_1G = row.getCell(20, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(21).setCellType(Cell.CELL_TYPE_STRING);
                String DF_2G = row.getCell(21, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(22).setCellType(Cell.CELL_TYPE_STRING);
                String DF_3G = row.getCell(22, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(23).setCellType(Cell.CELL_TYPE_STRING);
                String DF_4G = row.getCell(23, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(24).setCellType(Cell.CELL_TYPE_STRING);
                String DF_5G = row.getCell(24, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(25).setCellType(Cell.CELL_TYPE_STRING);
                String DF_6G = row.getCell(25, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(26).setCellType(Cell.CELL_TYPE_STRING);
                String DF_7G = row.getCell(26, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(27).setCellType(Cell.CELL_TYPE_STRING);
                String DF_8G = row.getCell(27, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(28).setCellType(Cell.CELL_TYPE_STRING);
                String DF_9G = row.getCell(28, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(29).setCellType(Cell.CELL_TYPE_STRING);
                String DF_10G = row.getCell(29, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(30).setCellType(Cell.CELL_TYPE_STRING);
                String DF_15G = row.getCell(30, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(31).setCellType(Cell.CELL_TYPE_STRING);
                String DF_20G = row.getCell(31, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(32).setCellType(Cell.CELL_TYPE_STRING);
                String HAS_CU = row.getCell(32, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(33).setCellType(Cell.CELL_TYPE_STRING);
                String CU_W = row.getCell(33, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(34).setCellType(Cell.CELL_TYPE_STRING);
                String IS_NORMAL = row.getCell(34, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(35).setCellType(Cell.CELL_TYPE_STRING);
                String HAS_IMPORT = row.getCell(35, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(36).setCellType(Cell.CELL_TYPE_STRING);
                String IS_HF = row.getCell(36, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(37).setCellType(Cell.CELL_TYPE_STRING);
                String IS_PB = row.getCell(37, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(38).setCellType(Cell.CELL_TYPE_STRING);
                String IS_CAF = row.getCell(38, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(39).setCellType(Cell.CELL_TYPE_STRING);
                String MIN_TG = row.getCell(39, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                row.getCell(40).setCellType(Cell.CELL_TYPE_STRING);
                String CTI = row.getCell(40, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();*/
                plate.setVENDOR(VENDOR);
                plate.setFAMILY(FAMILY);
                plate.setTHK_MM(THK_MM);
                plate.setPP_TYPE(PP_TYPE);
                plate.setRC(RC);
                plate.setTHK_GLASS_UM(THK_GLASS_UM);
                plate.setRESIN_FLOW_TYPE(RESIN_FLOW_TYPE);
                plate.setIS_NORMAL_SITE(IS_NORMAL_SITE);
                plate.setDK_1G(DK_1G);
                plate.setDK_2G(DK_2G);
                plate.setDK_3G(DK_3G);
                plate.setDK_4G(DK_4G);
                plate.setDK_5G(DK_5G);
                plate.setDK_6G(DK_6G);
                plate.setDK_7G(DK_7G);
                plate.setDK_8G(DK_8G);
                plate.setDK_9G(DK_9G);
                plate.setDK_10G(DK_10G);
                plate.setDK_15G(DK_15G);
                plate.setDK_20G(DK_20G);
                plate.setDF_1G(DF_1G);
                plate.setDF_2G(DF_2G);
                plate.setDF_3G(DF_3G);
                plate.setDF_4G(DF_4G);
                plate.setDF_5G(DF_5G);
                plate.setDF_6G(DF_6G);
                plate.setDF_7G(DF_7G);
                plate.setDF_8G(DF_8G);
                plate.setDF_9G(DF_9G);
                plate.setDF_10G(DF_10G);
                plate.setDF_15G(DF_15G);
                plate.setDF_20G(DF_20G);
                plate.setHAS_CU(HAS_CU);
                plate.setCU_W(CU_W);
                plate.setIS_NORMAL(IS_NORMAL);
                plate.setHAS_IMPORT(HAS_IMPORT);
                plate.setIS_HF(IS_HF);
                plate.setIS_PB(IS_PB);
                plate.setIS_CAF(IS_CAF);
                plate.setMIN_TG(MIN_TG);
                plate.setCTI(CTI);
                plateList.add(plate);
            }
            for(Plate plateInfo:plateList){
/*                String vendor = plateInfo.getVENDOR();
                String family = plateInfo.getFAMILY();
                String thk_mm = plateInfo.getTHK_MM();
                String pp_type = plateInfo.getPP_TYPE();
                String rc = plateInfo.getRC();
                String thk_glass_um = plateInfo.getTHK_GLASS_UM();
                String resin_flow_type = plateInfo.getRESIN_FLOW_TYPE();
                String is_normal_site = plateInfo.getIS_NORMAL_SITE();
                String dk_1G = plateInfo.getDK_1G();
                String dk_2G = plateInfo.getDK_2G();
                String dk_3G = plateInfo.getDK_3G();
                String dk_4G = plateInfo.getDK_4G();
                String dk_5G = plateInfo.getDK_5G();
                String dk_6G = plateInfo.getDK_6G();
                String dk_7G = plateInfo.getDK_7G();
                String dk_8G = plateInfo.getDK_8G();
                String dk_9G = plateInfo.getDK_9G();
                String dk_10G = plateInfo.getDK_10G();
                String dk_15G = plateInfo.getDK_15G();
                String dk_20G = plateInfo.getDK_20G();
                String df_1G = plateInfo.getDF_1G();
                String df_2G = plateInfo.getDF_2G();
                String df_3G = plateInfo.getDF_3G();
                String df_4G = plateInfo.getDF_4G();
                String df_5G = plateInfo.getDF_5G();
                String df_6G = plateInfo.getDF_6G();
                String df_7G = plateInfo.getDF_7G();
                String df_8G = plateInfo.getDF_8G();
                String df_9G = plateInfo.getDF_9G();
                String df_10G = plateInfo.getDF_10G();
                String df_15G = plateInfo.getDF_15G();
                String df_20G = plateInfo.getDF_20G();
                String has_cu = plateInfo.getHAS_CU();
                String cu_w = plateInfo.getCU_W();
                String is_normal = plateInfo.getIS_NORMAL();
                String has_import = plateInfo.getHAS_IMPORT();
                String is_hf = plateInfo.getIS_HF();
                String is_pb = plateInfo.getIS_PB();
                String is_caf = plateInfo.getIS_CAF();
                String min_tg = plateInfo.getMIN_TG();
                String cti = plateInfo.getCTI();*/

                String VENDOR = plateInfo.getVENDOR();
                String FAMILY = plateInfo.getFAMILY();
                String THK_MM = plateInfo.getTHK_MM();
                String PP_TYPE = plateInfo.getPP_TYPE();
                String RC = plateInfo.getRC();
                String THK_GLASS_UM = plateInfo.getTHK_GLASS_UM();
                String RESIN_FLOW_TYPE = plateInfo.getRESIN_FLOW_TYPE();
                String IS_NORMAL_SITE = plateInfo.getIS_NORMAL_SITE();
                String DK_1G = plateInfo.getDK_1G();
                String DK_2G = plateInfo.getDK_2G();
                String DK_3G = plateInfo.getDK_3G();
                String DK_4G = plateInfo.getDK_4G();
                String DK_5G = plateInfo.getDK_5G();
                String DK_6G = plateInfo.getDK_6G();
                String DK_7G = plateInfo.getDK_7G();
                String DK_8G = plateInfo.getDK_8G();
                String DK_9G = plateInfo.getDK_9G();
                String DK_10G = plateInfo.getDK_10G();
                String DK_15G = plateInfo.getDK_15G();
                String DK_20G = plateInfo.getDK_20G();
                String DF_1G = plateInfo.getDF_1G();
                String DF_2G = plateInfo.getDF_2G();
                String DF_3G = plateInfo.getDF_3G();
                String DF_4G = plateInfo.getDF_4G();
                String DF_5G = plateInfo.getDF_5G();
                String DF_6G = plateInfo.getDF_6G();
                String DF_7G = plateInfo.getDF_7G();
                String DF_8G = plateInfo.getDF_8G();
                String DF_9G = plateInfo.getDF_9G();
                String DF_10G = plateInfo.getDF_10G();
                String DF_15G = plateInfo.getDF_15G();
                String DF_20G = plateInfo.getDF_20G();
                String HAS_CU = plateInfo.getHAS_CU();
                String CU_W = plateInfo.getCU_W();
                String IS_NORMAL = plateInfo.getIS_NORMAL();
                String HAS_IMPORT = plateInfo.getHAS_IMPORT();
                String IS_HF = plateInfo.getIS_HF();
                String IS_PB = plateInfo.getIS_PB();
                String IS_CAF = plateInfo.getIS_CAF();
                String MIN_TG = plateInfo.getMIN_TG();
                String CTI = plateInfo.getCTI();
                int count = plateMapper.selectPlate(VENDOR,FAMILY,THK_MM,PP_TYPE,RC,THK_GLASS_UM,RESIN_FLOW_TYPE,IS_NORMAL_SITE,DK_1G,DK_2G,DK_3G,DK_4G,DK_5G,DK_6G,DK_7G,DK_8G,DK_9G,DK_10G,DK_15G,DK_20G,DF_1G,DF_2G,DF_3G,DF_4G,DF_5G,DF_6G,DF_7G,DF_8G,DF_9G,DF_10G,DF_15G,DF_20G,HAS_CU,CU_W,IS_NORMAL,HAS_IMPORT,IS_HF,IS_PB,IS_CAF,MIN_TG,CTI);
                //int count = plateMapper.selectPlate(vendor,family,thk_mm,pp_type,rc,thk_glass_um,resin_flow_type,is_normal_site,dk_1G,dk_2G,dk_3G,dk_4G,dk_5G,dk_6G,dk_7G,dk_8G,dk_9G,dk_10G,dk_15G,dk_20G,df_1G,df_2G,df_3G,df_4G,df_5G,df_6G,df_7G,df_8G,df_9G,df_10G,df_15G,df_20G,has_cu,cu_w,is_normal,has_import,is_hf,is_pb,is_caf,min_tg,cti);
                if(0 == count){
                    result = plateMapper.addPlate(plateInfo);
                }else{
                    result = 1;
                }

            }
        }
        return result;
    }

    public static String getValue(Row row,int index){
        String value = null;
        if (null==row.getCell(index)){
            value="";
        }
        else {
            row.getCell(index).setCellType(Cell.CELL_TYPE_STRING);
            value = row.getCell(index, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        }
        return value;
    }

    public static String getCellValue(Cell cell) {
        String cellValue = "";
        // 以下是判断数据的类型
        switch (cell.getCellTypeEnum()) {
            case NUMERIC: // 数字
                if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    cellValue = sdf.format(org.apache.poi.ss.usermodel.DateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                } else {
                    DataFormatter dataFormatter = new DataFormatter();
                    cellValue = dataFormatter.formatCellValue(cell);
                }
                break;
            case STRING: // 字符串
                cellValue = cell.getStringCellValue();
                break;
            case BOOLEAN: // Boolean
                cellValue = cell.getBooleanCellValue() + "";
                break;
            case FORMULA: // 公式
                cellValue = cell.getCellFormula() + "";
                break;
            case BLANK: // 空值
                cellValue = "";
                break;
            case ERROR: // 故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }

}
