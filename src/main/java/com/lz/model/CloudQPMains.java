package com.lz.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by KangXinghua on 2016/10/28.
 */
public class CloudQPMains {
    private String BG_MAINS_UUID;//varchar(50)	报关表主键ID
    private Integer declare_id;//Int	报关类型
    private String entry_type;//char(1)	报关单类型
    private String unify_no;//varchar(20)	统一编号
    private String apply_no;//varchar(20)	报关单号
    private Date INDATE_DT;//datetime	进口日期
    private Date apply_dt;//datetime	申报日期
    private String cabin_no;//varchar(30)	提运单号
    private String voyage;//varchar(30)	航次号
    private String verify_no;//varchar(20)	核销单号
    private String contract_no;//varchar(30)	合同号
    private String DECLAREPORT_NO;//varchar(10)	申报口岸
    private String port_no;//varchar(10)	进出口岸
    private String imposemode_no;//varchar(10)	征免性质
    private String start_country_no;//varchar(10)	运抵国
    private String loadport_no;//varchar(10)	指运港/装货港
    private String end_country_no;//varchar(10)	境内货源地/境内目的地
    private String TRADE_COUNTRY_NO;//varchar(10)	贸易国
    private String freight_currency_no;//varchar(10)	运费币种
    private String freightmode_no;//varchar(10)	运费类型
    private BigDecimal freight;//numeric(18, 4)	运费
    private String subscribe_currency_no;//varchar(10)	保费币种
    private String subscribemode_no;//varchar(10)	保费类型
    private BigDecimal subscribe;//numeric(18, 4)	保费
    private String incidental_currency_no;//varchar(10)	杂费币种
    private String incidentalmode_no;//varchar(10)	杂费类型
    private BigDecimal incidental;//numeric(18, 4)	杂费
    private BigDecimal grossweight;//numeric(18, 5)	毛重
    private BigDecimal netweight;//numeric(18, 5)	净重
    private String licence_no;//varchar(30)	许可证号
    private String records_no;//varchar(30)	手册号
    private String shipper_no;//varchar(20)	经营单位
    private String shipper_name;//varchar(100)	经营单位
    private String consignee_no;//varchar(20)	发货单位
    private String consignee_name;//varchar(100)	发货单位
    private String agent_no;//varchar(20)	申报单位
    private String agent_name;//varchar(100)	申报单位
    private Integer piece;//Int	件数
    private String pack_no;//varchar(10)	包装方式
    private String remitmode_no;//varchar(10)	结汇方式
    private String trade_no;//varchar(10)	贸易方式
    private String transmode_no;//varchar(10)	运输方式
    private String transname;//varchar(30)	运输工具
    private String bargainmode_no;//varchar(10)	成交方式
    private String TSGXQR;//varchar(2)	特殊关系确认
    private String JGYXQR;//varchar(2)	价格影响确认
    private String ZFTXQSYFQR;//varchar(2)	支付特许权使用费确认
    private String mark;//varchar(255)	备注
    private Date SEND_DATE;//Datetime	创建时间
    private String QP_FLAG;//varchar(10) 状态 0未导 1已导 2导入失败
    private String IMSTATUS;//varchar(8000) 校验说明
    private String SEND_USER;//QP_FLAG 发送人
    private String DELIVER_NAME;//varchar(255)	 固定：燁溢科技(香港)有限公司
    private String SHIPPER_CODE;//收发单位18位信用代码
    private String CONSIGNEE_CODE;//消费单位18位信用代码
    private String AGENT_CODE;//申报单位18位信用代码


    public String getBG_MAINS_UUID() {
        return BG_MAINS_UUID;
    }

    public void setBG_MAINS_UUID(String BG_MAINS_UUID) {
        this.BG_MAINS_UUID = BG_MAINS_UUID;
    }

    public Integer getDeclare_id() {
        return declare_id;
    }

    public void setDeclare_id(Integer declare_id) {
        this.declare_id = declare_id;
    }

    public String getEntry_type() {
        return entry_type;
    }

    public void setEntry_type(String entry_type) {
        this.entry_type = entry_type;
    }

    public String getUnify_no() {
        return unify_no;
    }

    public void setUnify_no(String unify_no) {
        this.unify_no = unify_no;
    }

    public String getApply_no() {
        return apply_no;
    }

    public void setApply_no(String apply_no) {
        this.apply_no = apply_no;
    }

    public Date getINDATE_DT() {
        return INDATE_DT;
    }

    public void setINDATE_DT(Date INDATE_DT) {
        this.INDATE_DT = INDATE_DT;
    }

    public Date getApply_dt() {
        return apply_dt;
    }

    public void setApply_dt(Date apply_dt) {
        this.apply_dt = apply_dt;
    }

    public String getCabin_no() {
        return cabin_no;
    }

    public void setCabin_no(String cabin_no) {
        this.cabin_no = cabin_no;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getVerify_no() {
        return verify_no;
    }

    public void setVerify_no(String verify_no) {
        this.verify_no = verify_no;
    }

    public String getContract_no() {
        return contract_no;
    }

    public void setContract_no(String contract_no) {
        this.contract_no = contract_no;
    }

    public String getDECLAREPORT_NO() {
        return DECLAREPORT_NO;
    }

    public void setDECLAREPORT_NO(String DECLAREPORT_NO) {
        this.DECLAREPORT_NO = DECLAREPORT_NO;
    }

    public String getPort_no() {
        return port_no;
    }

    public void setPort_no(String port_no) {
        this.port_no = port_no;
    }

    public String getImposemode_no() {
        return imposemode_no;
    }

    public void setImposemode_no(String imposemode_no) {
        this.imposemode_no = imposemode_no;
    }

    public String getStart_country_no() {
        return start_country_no;
    }

    public void setStart_country_no(String start_country_no) {
        this.start_country_no = start_country_no;
    }

    public String getLoadport_no() {
        return loadport_no;
    }

    public void setLoadport_no(String loadport_no) {
        this.loadport_no = loadport_no;
    }

    public String getEnd_country_no() {
        return end_country_no;
    }

    public void setEnd_country_no(String end_country_no) {
        this.end_country_no = end_country_no;
    }

    public String getTRADE_COUNTRY_NO() {
        return TRADE_COUNTRY_NO;
    }

    public void setTRADE_COUNTRY_NO(String TRADE_COUNTRY_NO) {
        this.TRADE_COUNTRY_NO = TRADE_COUNTRY_NO;
    }

    public String getFreight_currency_no() {
        return freight_currency_no;
    }

    public void setFreight_currency_no(String freight_currency_no) {
        this.freight_currency_no = freight_currency_no;
    }

    public String getFreightmode_no() {
        return freightmode_no;
    }

    public void setFreightmode_no(String freightmode_no) {
        this.freightmode_no = freightmode_no;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getSubscribe_currency_no() {
        return subscribe_currency_no;
    }

    public void setSubscribe_currency_no(String subscribe_currency_no) {
        this.subscribe_currency_no = subscribe_currency_no;
    }

    public String getSubscribemode_no() {
        return subscribemode_no;
    }

    public void setSubscribemode_no(String subscribemode_no) {
        this.subscribemode_no = subscribemode_no;
    }

    public BigDecimal getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(BigDecimal subscribe) {
        this.subscribe = subscribe;
    }

    public String getIncidental_currency_no() {
        return incidental_currency_no;
    }

    public void setIncidental_currency_no(String incidental_currency_no) {
        this.incidental_currency_no = incidental_currency_no;
    }

    public String getIncidentalmode_no() {
        return incidentalmode_no;
    }

    public void setIncidentalmode_no(String incidentalmode_no) {
        this.incidentalmode_no = incidentalmode_no;
    }

    public BigDecimal getIncidental() {
        return incidental;
    }

    public void setIncidental(BigDecimal incidental) {
        this.incidental = incidental;
    }

    public BigDecimal getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }

    public BigDecimal getNetweight() {
        return netweight;
    }

    public void setNetweight(BigDecimal netweight) {
        this.netweight = netweight;
    }

    public String getLicence_no() {
        return licence_no;
    }

    public void setLicence_no(String licence_no) {
        this.licence_no = licence_no;
    }

    public String getRecords_no() {
        return records_no;
    }

    public void setRecords_no(String records_no) {
        this.records_no = records_no;
    }

    public String getShipper_no() {
        return shipper_no;
    }

    public void setShipper_no(String shipper_no) {
        this.shipper_no = shipper_no;
    }

    public String getShipper_name() {
        return shipper_name;
    }

    public void setShipper_name(String shipper_name) {
        this.shipper_name = shipper_name;
    }

    public String getConsignee_no() {
        return consignee_no;
    }

    public void setConsignee_no(String consignee_no) {
        this.consignee_no = consignee_no;
    }

    public String getConsignee_name() {
        return consignee_name;
    }

    public void setConsignee_name(String consignee_name) {
        this.consignee_name = consignee_name;
    }

    public String getAgent_no() {
        return agent_no;
    }

    public void setAgent_no(String agent_no) {
        this.agent_no = agent_no;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }

    public String getPack_no() {
        return pack_no;
    }

    public void setPack_no(String pack_no) {
        this.pack_no = pack_no;
    }

    public String getRemitmode_no() {
        return remitmode_no;
    }

    public void setRemitmode_no(String remitmode_no) {
        this.remitmode_no = remitmode_no;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getTransmode_no() {
        return transmode_no;
    }

    public void setTransmode_no(String transmode_no) {
        this.transmode_no = transmode_no;
    }

    public String getTransname() {
        return transname;
    }

    public void setTransname(String transname) {
        this.transname = transname;
    }

    public String getBargainmode_no() {
        return bargainmode_no;
    }

    public void setBargainmode_no(String bargainmode_no) {
        this.bargainmode_no = bargainmode_no;
    }

    public String getTSGXQR() {
        return TSGXQR;
    }

    public void setTSGXQR(String TSGXQR) {
        this.TSGXQR = TSGXQR;
    }

    public String getJGYXQR() {
        return JGYXQR;
    }

    public void setJGYXQR(String JGYXQR) {
        this.JGYXQR = JGYXQR;
    }

    public String getZFTXQSYFQR() {
        return ZFTXQSYFQR;
    }

    public void setZFTXQSYFQR(String ZFTXQSYFQR) {
        this.ZFTXQSYFQR = ZFTXQSYFQR;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getSEND_DATE() {
        return SEND_DATE;
    }

    public void setSEND_DATE(Date SEND_DATE) {
        this.SEND_DATE = SEND_DATE;
    }

    public String getQP_FLAG() {
        return QP_FLAG;
    }

    public void setQP_FLAG(String QP_FLAG) {
        this.QP_FLAG = QP_FLAG;
    }

    public String getIMSTATUS() {
        return IMSTATUS;
    }

    public void setIMSTATUS(String IMSTATUS) {
        this.IMSTATUS = IMSTATUS;
    }

    public String getSEND_USER() {
        return SEND_USER;
    }

    public void setSEND_USER(String SEND_USER) {
        this.SEND_USER = SEND_USER;
    }

    public String getDELIVER_NAME() {
        return DELIVER_NAME;
    }

    public void setDELIVER_NAME(String DELIVER_NAME) {
        this.DELIVER_NAME = DELIVER_NAME;
    }

    public String getSHIPPER_CODE() {
        return SHIPPER_CODE;
    }

    public void setSHIPPER_CODE(String SHIPPER_CODE) {
        this.SHIPPER_CODE = SHIPPER_CODE;
    }

    public String getCONSIGNEE_CODE() {
        return CONSIGNEE_CODE;
    }

    public void setCONSIGNEE_CODE(String CONSIGNEE_CODE) {
        this.CONSIGNEE_CODE = CONSIGNEE_CODE;
    }

    public String getAGENT_CODE() {
        return AGENT_CODE;
    }

    public void setAGENT_CODE(String AGENT_CODE) {
        this.AGENT_CODE = AGENT_CODE;
    }
}
