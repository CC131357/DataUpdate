package com.example.spring_dingshi.Dao;

import com.example.spring_dingshi.entity.ET_MARA;
import com.example.spring_dingshi.entity.ET_MARC;
import com.example.spring_dingshi.entity.ET_MVKE;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface BasicDao {
    @Delete("delete from t001")
    void deleteT001();
    @Insert("insert into t001(BUKRS,BUTXT) values(#{BUKRS},#{BUTXT})")
    int insertT001(Map<String, String> t001);

    @Delete("delete from t024e")
    void deleteT024E();
    @Insert("insert into t024e(EKORG,EKOTX) values(#{EKORG},#{EKOTX})")
    int insertT024E(Map<String, String> t024e);

    @Delete("delete from t024")
    void deleteT024();
    @Insert("insert into t024(EKGRP,EKNAM) values(#{EKGRP},#{EKNAM})")
    int insertT024(Map<String, String> t024);

    @Delete("delete from t001w")
    void deleteT001W();
    @Insert("insert into t001w(WERKS,NAME1) values(#{WERKS},#{NAME1})")
    int insertT001W(Map<String, String> t001w);

    @Delete("delete from t001l")
    void deleteT001L();
    @Insert("insert into t001l(WERKS,LGORT,LGOBE) values(#{WERKS},#{LGORT},#{LGOBE})")
    int insertT001L(Map<String, String> t001l);

    @Delete("delete from t023t")
    void deleteT023T();
    @Insert("insert into t023t(MATKL,WGBEZ,WGBEZ60) values(#{MATKL},#{WGBEZ},#{WGBEZ60})")
    int insertT023T(Map<String, String> t023t);

    @Delete("delete from t134t")
    void deleteT134T();
    @Insert("insert into t134t(MTART,MTBEZ) values(#{MTART},#{MTBEZ})")
    int insertT134T(Map<String, String> t134t);

    @Delete("delete from t077y")
    void deleteT077Y();
    @Insert("insert into t077y(KTOKK,TXT30) values(#{KTOKK},#{TXT30})")
    int insertT077Y(Map<String, String> t077y);

    @Delete("delete from t007s")
    void deleteT007S();
    @Insert("insert into t007s(MWSKZ,TEXT1,KALSM) values(#{MWSKZ},#{TEXT1},#{KALSM})")
    int insertT007S(Map<String, String> t007s);

    @Delete("delete from t161t")
    void deleteT161T();
    @Insert("insert into t161t(BSTYP,BSART,BATXT) values(#{BSTYP},#{BSART},#{BATXT})")
    int insertT161T(Map<String, String> t161t);

    @Delete("delete from t077x")
    void deleteT077X();
    @Insert("insert into t077x(KTOKD,TXT30) values(#{KTOKD},#{TXT30})")
    int insertT077X(Map<String, String> t077x);

    @Delete("delete from t005t")
    void deleteT005T();
    @Insert("insert into t005t(LAND1,LANDX) values(#{LAND1},#{LANDX})")
    int insertT005T(Map<String, String> t005t);

    @Delete("delete from t005u")
    void deleteT005U();
    @Insert("insert into t005u(LAND1,BLAND,BEZEI) values(#{LAND1},#{BLAND},#{BEZEI})")
    int insertT005U(Map<String, String> t005u);

    @Delete("delete from t151t")
    void deleteT151T();
    @Insert("insert into t151t(KDGPR,KDGPR) values(#{KDGPR},#{KDGPR}")
    int insertT151T(Map<String, String> t151t);

    @Delete("delete from t188t")
    void deleteT188T();
    @Insert("insert into t188t(KONDA,VTEXT) values(#{KONDA},#{VTEXT})")
    int insertT188T(Map<String, String> t151t);

    @Delete("delete from t171t")
    void deleteT171T();
    @Insert("insert into t171t(BZIRK,BZTXT) values(#{BZIRK},#{BZTXT})")
    int insertT171T(Map<String, String> t171t);

    @Delete("delete from t052u")
    void deleteT052U();
    @Insert("insert into t052u(ZTERM,TEXT1) values(#{ZTERM},#{TEXT1})")
    int insertT052U(Map<String, String> t052u);

    @Delete("delete from t042zt")
    void deleteT042ZT();
    @Insert("insert into t042zt(LAND1,ZLSCH,TEXT2) values(#{LAND1},#{ZLSCH},#{TEXT2})")
    int insertT042ZT(Map<String, String> t042zt);

    @Delete("delete from tvkot")
    void deleteTVKOT();
    @Insert("insert into tvkot(VKORG,VTEXT) values(#{VKORG},#{VTEXT})")
    int insertTVKOT(Map<String, String> tvkot);

    @Delete("delete from tvtwt")
    void deleteTVTWT();
    @Insert("insert into tvtwt(VTWEG,VTEXT) values(#{VTWEG},#{VTEXT})")
    int insertTVTWT(Map<String, String> tvtwt);

    @Delete("delete from tvkbt")
    void deleteTVKBT();
    @Insert("insert into tvkbt(VKBUR,VTEXT) values(#{VKBUR},#{VTEXT})")
    int insertTVKBT(Map<String, String> tvkbt);

    @Delete("delete from tvgrt")
    void deleteTVGRT();
    @Insert("insert into tvgrt(VKGRP,BEZEI) values(#{VKGRP},#{BEZEI})")
    int insertTVGRT(Map<String, String> tvgrt);

    @Delete("delete from tinct")
    void deleteTINCT();
    @Insert("insert into tinct(INCO1,BEZEI) values(#{INCO1},#{BEZEI})")
    int insertTINCT(Map<String, String> tinct);

    @Delete("delete from tcurt")
    void deleteTCURT();
    @Insert("insert into tcurt(WAERS,LTEXT) values(#{WAERS},#{LTEXT})")
    int insertTCURT(Map<String, String> tcurt);

    @Delete("delete from cskt")
    void deleteCSKT();
    @Insert("insert into cskt(KOSTL,KTEXT) values(#{KOSTL},#{KTEXT})")
    int insertCSKT(Map<String, String> cskt);

    @Delete("delete from zska1")
    void deleteZSKA1();
    @Insert("insert into zska1(SAKNR,BUKRS,TXT20) values(#{SAKNR},#{BUKRS},#{TXT20})")
    int insertZSKA1(Map<String, String> zska1);

    @Delete("delete from zmmt017")
    void deleteZMMT017();
    @Insert("insert into zmmt017(ZZSLX,ZZSMS) values(#{ZZSLX},#{ZZSMS})")
    int insertZMMT017(Map<String, String> zmmt017);

    @Delete("delete from t006a")
    void deleteT006A();
    @Insert("insert into t006a(SPRAS,MSEHI,MSEHL) values(#{SPRAS},#{MSEHI},#{MSEHL})")
    int insertT006A(Map<String, String> t006a);

    @Delete("delete from twewt")
    void deleteTWEWT();
    @Insert("insert into twewt(SPRAS,EXTWG,EWBEZ) values(#{SPRAS},#{EXTWG},#{EWBEZ})")
    int insertTWEWT(Map<String, String> twewt);

    @Delete("delete from cepct")
    void deleteCEPCT();
    @Insert("insert into cepct(SPRAS,PRCTR,DATBI,KOKRS,KTEXT,LTEXT,MCTXT) values(#{SPRAS},#{PRCTR},#{DATBI},#{KOKRS},#{KTEXT},#{LTEXT},#{MCTXT})")
    int insertCEPCT(Map<String, String> cepct);

    @Delete("delete from bnka")
    void deleteBNKA();
    @Insert("insert into bnka(BANKS,BANKL,BANKA) values(#{BANKS},#{BANKL},#{BANKA})")
    int insertBNKA(Map<String, String> bnka);

    @Delete("delete from t438x")
    void deleteT438X();
    @Insert("insert into t438x(SPRAS,WERKS,DISGR,TEXT40) values(#{SPRAS},#{WERKS},#{DISGR},#{TEXT40})")
    int insertT438X(Map<String, String> t438x);

    @Delete("delete from et_mara")
    void deleteET_MARA();

    /*插入新基本视图*/
    @Insert("insert into et_mara(MATNR,MAKTX,MATKL,WGBEZ,MTART,MTBEZ,MEINS,ZBZGG,MHDRZ,MHDHB,IPRKZ,TRAGR,ZVERS,ZBISM,ZYTSS,ZGUIG,ZGGXH,ZBCXH,ZGYSM,ERSDA,LAEDA,LVORM,ZZTAI,ZCAND,ZCDDW,ZKUAN,ZKDDW,ZWXCC,ZSHHD,ZBANH,ZBHGC,ZTONH,ZXTON,ZTBLE,ZXTBL,ZBLBZ,ZYANS,ZSFKB,ZBLDJ,ZBJZT,ZTBRA,ZTBR1,ZTBZA,ZTBRZ,ZTBCC,ZSZHL,ZHDSS,ZDUDW,ZBLHD,ZSZLD,ZDKSS,ZDK02,ZDK03,ZDK04,ZDK05,ZDK06,ZDK07,ZDK08,ZDK09,ZDK10,ZDK15,ZDK20,ZDFSS,ZDF02,ZDF03,ZDF04,ZDF05,ZDF06,ZDF07,ZDF08,ZDF09,ZDF10,ZDF15,ZDF20) " +
            "values(#{MATNR},#{MAKTX},#{MATKL},#{WGBEZ},#{MTART},#{MTBEZ},#{MEINS},#{ZBZGG},#{MHDRZ},#{MHDHB},#{IPRKZ},#{TRAGR},#{ZVERS},#{ZBISM},#{ZYTSS},#{ZGUIG},#{ZGGXH},#{ZBCXH},#{ZGYSM},#{ERSDA},#{LAEDA},#{LVORM},#{ZZTAI},#{ZCAND},#{ZCDDW},#{ZKUAN},#{ZKDDW},#{ZWXCC},#{ZSHHD},#{ZBANH},#{ZBHGC},#{ZTONH},#{ZXTON},#{ZTBLE},#{ZXTBL},#{ZBLBZ},#{ZYANS},#{ZSFKB},#{ZBLDJ},#{ZBJZT},#{ZTBRA},#{ZTBR1},#{ZTBZA},#{ZTBRZ},#{ZTBCC},#{ZSZHL},#{ZHDSS},#{ZDUDW},#{ZBLHD},#{ZSZLD},#{ZDKSS},#{ZDK02},#{ZDK03},#{ZDK04},#{ZDK05},#{ZDK06},#{ZDK07},#{ZDK08},#{ZDK09},#{ZDK10},#{ZDK15},#{ZDK20},#{ZDFSS},#{ZDF02},#{ZDF03},#{ZDF04},#{ZDF05},#{ZDF06},#{ZDF07},#{ZDF08},#{ZDF09},#{ZDF10},#{ZDF15},#{ZDF20})")
    int insertET_MARA(Map<String, String> et_mara);

    @Delete("delete from et_marc")
    void deleteET_MARC();
    /*插入新工厂视图 */
    @Insert("insert into et_marc(MATNR,WERKS,NAME1,ZBISM,EKGRP,XCHAR,DISGR,DISMM,DISPO,DISLS,BESKZ,LGFSB,PLIFZ,SBDKZ,BKLAS,LADGR) " +
            "values(#{MATNR},#{WERKS},#{NAME1},#{ZBISM},#{EKGRP},#{XCHAR},#{DISGR},#{DISMM},#{DISPO},#{DISLS},#{BESKZ},#{LGFSB},#{PLIFZ},#{SBDKZ},#{BKLAS},#{LADGR})")
    int insertET_MARC(Map<String, String> et_marc);

    @Delete("delete from et_mvke")
    void deleteET_MVKE();
    /*插入新销售视图*/
    @Insert("insert into et_mvke(MATNR,VKORG,VTWEG,DWERK,KTGRM,MTPOS) values(#{MATNR},#{VKORG},#{VTWEG},#{DWERK},#{KTGRM},#{MTPOS})")
    int insertET_MVKE(Map<String, String> et_mvke);

    @Delete("delete from tspat")
    void deleteTSPAT();
    @Insert("insert into tspat(SPRAS,SPART,VTEXT) values(#{SPRAS},#{SPART},#{VTEXT})")
    int insertTSPAT(Map<String, String> tspat);

    @Delete("delete from t024d")
    void deleteT024D();
    @Insert("insert into t024d(WERKS,DISPO,DSNAM) values(#{WERKS},#{DISPO},#{DSNAM})")
    int insertT024D(Map<String, String> t024d);

    @Delete("delete from lfbk")
    void deleteLFBK();
    @Insert("insert into lfbk(LIFNR,BANKS,BANKL,BANKN,BVTYP,KOINH,BKREF) values(#{LIFNR},#{BANKS},#{BANKL},#{BANKN}+#{BKREF},#{BVTYP},#{KOINH},#{BKREF})")
    int insertLFBK(Map<String, String> lfbk);

    @Delete("delete from coas")
    void deleteCOAS();
    @Insert("insert into coas(AUFNR,AUART) values(#{AUFNR},#{AUART})")
    int insertCOAS(Map<String, String> coas);

    @Delete("delete from skat")
    void deleteSKAT();
    @Insert("insert into skat(SAKNR,KTOPL,TXT20,TXT50) values(#{SAKNR},#{KTOPL},#{TXT20},#{TXT50})")
    int insertSKAT(Map<String, String> skat);

    @Delete("delete from t173t")
    void deleteT173T();
    @Insert("insert into t173t(VSART,BEZEI) values(#{VSART},#{BEZEI})")
    int insertT173T(Map<String, String> t173t);

    @Delete("delete from t025t")
    void deleteT025T();
    @Insert("insert into t025t(BKLAS,BKBEZ) values(#{BKLAS},#{BKBEZ})")
    int insertT025T(Map<String, String> t025t);

    @Delete("delete from masterCustom")
    void deleteMasterCustom();
    @Insert("insert into masterCustom(BU_GROUP,PARTNER,NAME_ORG1,CREDIT_LIMIT,CHECK_RULE,ZSCKH) values(#{BU_GROUP},#{PARTNER},#{NAME_ORG1},#{CREDIT_LIMIT},#{CHECK_RULE},#{ZSCKH})")
    int insertMasterCustom(Map<String, String> masterCustom);

    @Delete("delete from custom1")
    void deleteCustom1();
    @Insert("insert into custom1(PARTNER,ZTERM) values(#{PARTNER},#{ZTERM})")
    int insertCustom1(Map<String, String> custom1);

    @Delete("delete from tq30t ")
    void deleteTQ30T();
    @Insert("insert into tq30t(ART,KURZTEXT,LTXA1) values(#{ART},#{KURZTEXT},#{LTXA1})")
    int insertTQ30T(Map<String, String> tq30t);

    @Delete("delete from labour")
    void deleteLabour ();
    @Insert("insert into labour(MATNR,MAKTX,MATKL,WGBEZ,MTART,MTBEZ,MEINS,ZTSKT,ZBZGG,MHDRZ,MHDHB,IPRKZ,TRAGR,ZVERS,ZBISM,ZYTSS,ZGUIG,ZGGXH) values(#{MATNR},#{MAKTX},#{MATKL},#{WGBEZ},#{MTART},#{MTBEZ},#{MEINS},#{ZTSKT},#{ZBZGG},#{MHDRZ},#{MHDHB},#{IPRKZ},#{TRAGR},#{ZVERS},#{ZBISM},#{ZYTSS},#{ZGUIG},#{ZGGXH})")
    int insertLabour(Map<String, String> labour);

    @Delete("delete from z001")
    void deleteZ001();
    @Insert("insert into z001(MATNR,MAKTX,MATKL,WGBEZ,MTART,MTBEZ,MEINS,ZFJGY) values(#{MATNR},#{MAKTX},#{MATKL},#{WGBEZ},#{MTART},#{MTBEZ},#{MEINS},#{ZFJGY})")
    int insertZ001(Map<String, String> z001);

    @Delete("delete from lfa1")
    void deleteLFA1();
    @Insert("insert into lfa1(LIFNR,NAME1,NAME2,NAME3,ZFPDZ,ZYWLX,ZYWDH,ZYWYX,TELFX,KTOKK,STCD5) values(#{LIFNR},#{NAME1},#{NAME2},#{NAME3},#{ZFPDZ},#{ZYWLX},#{ZYWDH},#{ZYWYX},#{TELFX},#{KTOKK},#{STCD5})")
    int insertLFA1(Map<String, String> lfa1);

    @Delete("delete from t439t")
    void deleteT439T();
    @Insert("insert into t439t(DISLS,SPRAS,LOSLT) values(#{DISLS},#{SPRAS},#{LOSLT})")
    int insertT439T(Map<String, String> t439t);

    @Delete("delete from t460t")
    void deleteT460T();
    @Insert("insert into t460t(WERKS,SOBSL,LTEXT) values(#{WERKS},#{SOBSL},#{LTEXT})")
    int insertT460T(Map<String, String> t460t);

    @Delete("delete from eqkt")
    void deleteEQKT();
    @Insert("insert into eqkt(EQUNR,EQKTU) values(#{EQUNR},#{EQKTU})")
    int insertEQKT(Map<String, String> eqkt);

    @Delete("delete from supplier")
    void deleteSupplier();
    @Insert("insert into supplier(PARTNER,NAME_ORG1,BU_SORT1,EKORG,EKOTX,BU_GROUP,TXT15,ZTERM,VTEXT,WAERS) values(#{PARTNER},#{NAME_ORG1},#{BU_SORT1},#{EKORG},#{EKOTX},#{BU_GROUP},#{TXT15},#{ZTERM},#{VTEXT},#{WAERS})")
    int insertSupplier(Map<String, String> supplier);

    /**
     * 测试更新
     */
    /*查询基本视图*/
    @Select("select MATNR,MAKTX from et_mara where MATNR=#{MATNR} and MAKTX=#{MAKTX}")
    ET_MARA getET_MARA(@Param("MATNR") String MATNR,@Param("MAKTX") String MAKTX);
    /*更新基本视图*/
    @Update("update et_mara set MATKL=#{MATKL},WGBEZ=#{WGBEZ},MTART=#{MTART},MTBEZ=#{MTBEZ},MEINS=#{MEINS},ZBZGG=#{ZBZGG},MHDRZ=#{MHDRZ},MHDHB=#{MHDHB},IPRKZ=#{IPRKZ},TRAGR=#{TRAGR},ZVERS=#{ZVERS},ZBISM=#{ZBISM},ZYTSS=#{ZYTSS},ZGUIG=#{ZGUIG},ZGGXH=#{ZGGXH},ZBCXH=#{ZBCXH},ZGYSM=#{ZGYSM},ERSDA=#{ERSDA},LAEDA=#{LAEDA},LVORM=#{LVORM},ZZTAI=#{ZZTAI},ZCAND=#{ZCAND},ZCDDW=#{ZCDDW},ZKUAN=#{ZKUAN},ZKDDW=#{ZKDDW},ZWXCC=#{ZWXCC},ZSHHD=#{ZSHHD},ZBANH=#{ZBANH},ZBHGC=#{ZBHGC},ZTONH=#{ZTONH},ZXTON=#{ZXTON},ZTBLE=#{ZTBLE},ZXTBL=#{ZXTBL},ZBLBZ=#{ZBLBZ},ZYANS=#{ZYANS},ZSFKB=#{ZSFKB},ZBLDJ=#{ZBLDJ},ZBJZT=#{ZBJZT},ZTBRA=#{ZTBRA},ZTBR1=#{ZTBR1},ZTBZA=#{ZTBZA},ZTBRZ=#{ZTBRZ},ZTBCC=#{ZTBCC},ZSZHL=#{ZSZHL},ZHDSS=#{ZHDSS},ZDUDW=#{ZDUDW},ZBLHD=#{ZBLHD},ZSZLD=#{ZSZLD},ZDKSS=#{ZDKSS},ZDK02=#{ZDK02},ZDK03=#{ZDK03},ZDK04=#{ZDK04},ZDK05=#{ZDK05},ZDK06=#{ZDK06},ZDK07=#{ZDK07},ZDK08=#{ZDK08},ZDK09=#{ZDK09},ZDK10=#{ZDK10},ZDK15=#{ZDK15},ZDK20=#{ZDK20},ZDFSS=#{ZDFSS},ZDF02=#{ZDF02},ZDF03=#{ZDF03},ZDF04=#{ZDF04},ZDF05=#{ZDF05},ZDF06=#{ZDF06},ZDF07=#{ZDF07},ZDF08=#{ZDF08},ZDF09=#{ZDF09},ZDF10=#{ZDF10},ZDF15=#{ZDF15},ZDF20=#{ZDF20} where MATNR=#{MATNR} and MAKTX=#{MAKTX} ")
    int updateET_MARA(Map<String, String> et_mara);
    /*查询工厂视图*/
    @Select("select MATNR,WERKS from et_marc where MATNR=#{MATNR} and WERKS=#{WERKS}")
    ET_MARC getET_MARC(String MATNR,String WERKS);
    /*更新基本视图*/
    @Update("update et_marc set NAME1=#{NAME1},ZBISM=#{ZBISM},EKGRP=#{EKGRP},XCHAR=#{XCHAR},DISGR=#{DISGR},DISMM=#{DISMM},DISPO=#{DISPO},DISLS=#{DISLS},BESKZ=#{BESKZ},LGFSB=#{LGFSB},PLIFZ=#{PLIFZ},SBDKZ=#{SBDKZ},BKLAS=#{BKLAS},LADGR=#{LADGR} where MATNR=#{MATNR} and WERKS=#{WERKS}")
    int updateET_MARC(Map<String, String> et_marc);
    /*查询销售视图*/
    @Select("select MATNR,VKORG,VTWEG,DWERK,KTGRM,MTPOS from et_mvke where MATNR=#{MATNR} AND VKORG=#{VKORG} AND VTWEG=#{VTWEG} AND DWERK=#{DWERK} AND KTGRM=#{KTGRM} AND MTPOS=#{MTPOS}")
    List<ET_MVKE> getET_MVKE(String MATNR, String VKORG, String VTWEG, String DWERK, String KTGRM, String MTPOS);

}


