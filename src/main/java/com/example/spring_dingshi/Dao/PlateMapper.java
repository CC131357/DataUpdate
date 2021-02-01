package com.example.spring_dingshi.Dao;

import com.example.spring_dingshi.entity.Plate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PlateMapper {
    @Insert("insert into DATA_SHEET_CORE(VENDOR,FAMILY,THK_MM,PP_TYPE,RC,THK_GLASS_UM,RESIN_FLOW_TYPE,IS_NORMAL_SITE,DK_1G,DK_2G,DK_3G,DK_4G,DK_5G,DK_6G,DK_7G,DK_8G,DK_9G,DK_10G,DK_15G,DK_20G,DF_1G,DF_2G,DF_3G,DF_4G,DF_5G,DF_6G,DF_7G,DF_8G,DF_9G,DF_10G,DF_15G,DF_20G,HAS_CU,CU_W,IS_NORMAL,HAS_IMPORT,IS_HF,IS_PB,IS_CAF,MIN_TG,CTI) " +
            "values(#{VENDOR},#{FAMILY},#{THK_MM},#{PP_TYPE},#{RC},#{THK_GLASS_UM},#{RESIN_FLOW_TYPE},#{IS_NORMAL_SITE},#{DK_1G},#{DK_2G},#{DK_3G},#{DK_4G},#{DK_5G},#{DK_6G},#{DK_7G},#{DK_8G},#{DK_9G},#{DK_10G},#{DK_15G},#{DK_20G},#{DF_1G},#{DF_2G},#{DF_3G},#{DF_4G},#{DF_5G},#{DF_6G},#{DF_7G},#{DF_8G},#{DF_9G},#{DF_10G},#{DF_15G},#{DF_20G},#{HAS_CU},#{CU_W},#{IS_NORMAL},#{HAS_IMPORT},#{IS_HF},#{IS_PB},#{IS_CAF},#{MIN_TG},#{CTI})")
    int addPlate(Plate plate);

    @Select("select count(*) from DATA_SHEET_CORE where VENDOR=#{VENDOR} and FAMILY=#{FAMILY} and THK_MM=#{THK_MM} and PP_TYPE=#{PP_TYPE} and RC=#{RC} and THK_GLASS_UM=#{THK_GLASS_UM} and RESIN_FLOW_TYPE=#{RESIN_FLOW_TYPE} and IS_NORMAL_SITE=#{IS_NORMAL_SITE} and DK_1G=#{DK_1G} and DK_2G=#{DK_2G} and DK_3G=#{DK_3G} and DK_4G=#{DK_4G} and DK_5G=#{DK_5G} and DK_6G=#{DK_6G} and DK_7G=#{DK_7G} and DK_8G=#{DK_8G} and DK_9G=#{DK_9G} and DK_10G=#{DK_10G} and DK_15G=#{DK_15G} and DK_20G=#{DK_20G} " +
            "and DF_1G=#{DF_1G} and DF_2G=#{DF_2G} and DF_3G=#{DF_3G} and DF_4G=#{DF_4G} and DF_5G=#{DF_5G} and DF_6G=#{DF_6G} and DF_7G=#{DF_7G} and DF_8G=#{DF_8G} and DF_9G=#{DF_9G} and DF_10G=#{DF_10G} and DF_15G=#{DF_15G} and DF_20G=#{DF_20G} and HAS_CU=#{HAS_CU} and CU_W=#{CU_W} and IS_NORMAL=#{IS_NORMAL} and HAS_IMPORT=#{HAS_IMPORT} and IS_HF=#{IS_HF} and IS_PB=#{IS_PB} and IS_CAF=#{IS_CAF} and MIN_TG=#{MIN_TG} and CTI=#{CTI}")
    int selectPlate(@Param("VENDOR") String VENDOR,@Param("FAMILY") String FAMILY,@Param("THK_MM") String THK_MM,@Param("PP_TYPE") String PP_TYPE,@Param("RC") String RC,@Param("THK_GLASS_UM") String THK_GLASS_UM,@Param("RESIN_FLOW_TYPE") String RESIN_FLOW_TYPE,@Param("IS_NORMAL_SITE") String IS_NORMAL_SITE,@Param("DK_1G") String DK_1G,@Param("DK_2G") String DK_2G,@Param("DK_3G") String DK_3G,@Param("DK_4G") String DK_4G,@Param("DK_5G") String DK_5G,@Param("DK_6G") String DK_6G,@Param("DK_7G") String DK_7G,@Param("DK_8G") String DK_8G,@Param("DK_9G") String DK_9G,@Param("DK_10G") String DK_10G,@Param("DK_15G") String DK_15G,@Param("DK_20G") String DK_20G,
                    @Param("DF_1G") String DF_1G,@Param("DF_2G") String DF_2G,@Param("DF_3G") String DF_3G,@Param("DF_4G") String DF_4G,@Param("DF_5G") String DF_5G,@Param("DF_6G") String DF_6G,@Param("DF_7G") String DF_7G,@Param("DF_8G") String DF_8G,@Param("DF_9G") String DF_9G,@Param("DF_10G") String DF_10G,@Param("DF_15G") String DF_15G,@Param("DF_20G") String DF_20G,@Param("HAS_CU") String HAS_CU,@Param("CU_W") String CU_W,@Param("IS_NORMAL") String IS_NORMAL,@Param("HAS_IMPORT") String HAS_IMPORT,@Param("IS_HF") String IS_HF,@Param("IS_PB") String IS_PB,@Param("IS_CAF") String IS_CAF,@Param("MIN_TG") String MIN_TG,@Param("CTI") String CTI);
    @Insert("insert into ip_record(ip,time) values (#{ip},#{time})")
    int addIP(String ip,String time);
}
