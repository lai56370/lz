package com.lz.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * base_goods 表的Model
 */
public class BaseGoodsModelGen extends DataModel {

    //===========================================代码生成开始============================================

    //columns 开始
    private java.lang.String code;//code
    private java.lang.String changeBeforeId;//changeBeforeId
    private java.lang.String billNo;//单据编号
    private java.lang.String chinaCustomsTariffId;//海关进出口税则Id
    private java.lang.String chinaCustomsTariffTrueId;//海关进出口税则真Id
    private java.lang.Boolean isClassify;//是否需要归类
    private java.lang.String goodsNumber;//商品编码
    private java.lang.String model;//型号
    private java.lang.String brand;//品牌
    private java.lang.String goodsName;//品名
    private java.lang.String unit;//单位
    private java.lang.String spec;//海关规格
    private java.math.BigDecimal fund;//基金
    private java.lang.Boolean tubeProducts;//管制品
    private java.lang.Integer CCC;//强制认证
    private java.lang.Integer history;//强制认证
    private java.lang.String remark;//备注
    private java.lang.Integer country;//
    private java.lang.Boolean isUpSpec;//是否需要更新海关规格
    //columns 结束


    /**
     * code
     *
     * @param value
     */
    public void setCode(java.lang.String value) {
        this.code = value;
    }

    /**
     * code
     */
    public java.lang.String getCode() {
        return this.code;
    }

    /**
     * changeBeforeId
     *
     * @param value
     */
    public void setChangeBeforeId(java.lang.String value) {
        this.changeBeforeId = value;
    }

    /**
     * changeBeforeId
     */
    public java.lang.String getChangeBeforeId() {
        return this.changeBeforeId;
    }

    /**
     * 单据编号
     *
     * @param value
     */
    public void setBillNo(java.lang.String value) {
        this.billNo = value;
    }

    /**
     * 单据编号
     */
    public java.lang.String getBillNo() {
        return this.billNo;
    }

    /**
     * 海关进出口税则Id
     *
     * @param value
     */
    public void setChinaCustomsTariffId(java.lang.String value) {
        this.chinaCustomsTariffId = value;
    }

    /**
     * 海关进出口税则Id
     */
    public java.lang.String getChinaCustomsTariffId() {
        return this.chinaCustomsTariffId;
    }

    /**
     * 海关进出口税则真Id
     *
     * @param value
     */
    public void setChinaCustomsTariffTrueId(java.lang.String value) {
        this.chinaCustomsTariffTrueId = value;
    }

    /**
     * 海关进出口税则真Id
     */
    public java.lang.String getChinaCustomsTariffTrueId() {
        return this.chinaCustomsTariffTrueId;
    }

    /**
     * 是否需要归类
     *
     * @param value
     */
    public void setIsClassify(java.lang.Boolean value) {
        this.isClassify = value;
    }

    /**
     * 是否需要归类
     */
    public java.lang.Boolean getIsClassify() {
        return this.isClassify;
    }

    /**
     * 商品编码
     *
     * @param value
     */
    public void setGoodsNumber(java.lang.String value) {
        this.goodsNumber = value;
    }

    /**
     * 商品编码
     */
    public java.lang.String getGoodsNumber() {
        return this.goodsNumber;
    }

    /**
     * 型号
     *
     * @param value
     */
    public void setModel(java.lang.String value) {
        this.model = value;
    }

    /**
     * 型号
     */
    public java.lang.String getModel() {
        return this.model;
    }

    /**
     * 品牌
     *
     * @param value
     */
    public void setBrand(java.lang.String value) {
        this.brand = value;
    }

    /**
     * 品牌
     */
    public java.lang.String getBrand() {
        return this.brand;
    }

    /**
     * 品名
     *
     * @param value
     */
    public void setGoodsName(java.lang.String value) {
        this.goodsName = value;
    }

    /**
     * 品名
     */
    public java.lang.String getGoodsName() {
        return this.goodsName;
    }

    /**
     * 单位
     *
     * @param value
     */
    public void setUnit(java.lang.String value) {
        this.unit = value;
    }

    /**
     * 单位
     */
    public java.lang.String getUnit() {
        return this.unit;
    }

    /**
     * 海关规格
     *
     * @param value
     */
    public void setSpec(java.lang.String value) {
        this.spec = value;
    }

    /**
     * 海关规格
     */
    public java.lang.String getSpec() {
        return this.spec;
    }

    /**
     * 基金
     *
     * @param value
     */
    public void setFund(java.math.BigDecimal value) {
        this.fund = value;
    }

    /**
     * 基金
     */
    public java.math.BigDecimal getFund() {
        return this.fund;
    }

    /**
     * 管制品
     *
     * @param value
     */
    public void setTubeProducts(java.lang.Boolean value) {
        this.tubeProducts = value;
    }

    /**
     * 管制品
     */
    public java.lang.Boolean getTubeProducts() {
        return this.tubeProducts;
    }

    /**
     * 强制认证
     *
     * @param value
     */
    public void setCCC(java.lang.Integer value) {
        this.CCC = value;
    }

    /**
     * 强制认证
     */
    public java.lang.Integer getCCC() {
        return this.CCC;
    }

    /**
     * 强制认证
     *
     * @param value
     */
    public void setHistory(java.lang.Integer value) {
        this.history = value;
    }

    /**
     * 强制认证
     */
    public java.lang.Integer getHistory() {
        return this.history;
    }

    /**
     * 备注
     *
     * @param value
     */
    public void setRemark(java.lang.String value) {
        this.remark = value;
    }

    /**
     * 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * @param value
     */
    public void setCountry(java.lang.Integer value) {
        this.country = value;
    }

    /**
     *
     */
    public java.lang.Integer getCountry() {
        return this.country;
    }

    /**
     * 是否需要更新海关规格
     *
     * @param value
     */
    public void setIsUpSpec(java.lang.Boolean value) {
        this.isUpSpec = value;
    }

    /**
     * 是否需要更新海关规格
     */
    public java.lang.Boolean getIsUpSpec() {
        return this.isUpSpec;
    }

//	public String toString() {
//
//	}
    //===========================================代码生成结束============================================
}

