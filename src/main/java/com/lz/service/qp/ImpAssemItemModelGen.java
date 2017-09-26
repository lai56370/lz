package com.lz.service.qp;

import com.lz.model.DataModel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * scm_imp_assem_item 表的Model
 */
public class ImpAssemItemModelGen extends DataModel {

    //===========================================代码生成开始============================================

    //columns 开始
    private String impAssemId;//进口拼单ID
    private String impOrderItemId;//进口订单项ID
    private String packingListItemId;//装箱单Id
    private String chinaCustomsTariffId;//海关进出口税则Id
    private String goodsId;//商品Id
    private String impOrderBillNo;//进口订号
    private java.math.BigDecimal quantity;//
    private java.math.BigDecimal price;//单价
    private java.math.BigDecimal amount;//金额
    private java.math.BigDecimal bgPrice;//报关单价
    private java.math.BigDecimal bgAmount;//报关总价
    private java.math.BigDecimal fare;//
    private java.math.BigDecimal insurance;//
    private java.math.BigDecimal otherFare;//
    private Integer currency;//币种
    private java.math.BigDecimal exchangeRate;//海关汇率
    private java.math.BigDecimal amountByBgCy;//实际外币货值，报关币种货值
    private String boxNo;//箱单序号
    private Integer number;//序号
    private java.math.BigDecimal quantity1;//法定数量
    private java.math.BigDecimal quantity2;//第二数量
    //columns 结束


    /**
     * 进口拼单ID
     *
     * @param value
     */
    public void setImpAssemId(String value) {
        this.impAssemId = value;
    }

    /**
     * 进口拼单ID
     */
    public String getImpAssemId() {
        return this.impAssemId;
    }

    /**
     * 进口订单项ID
     *
     * @param value
     */
    public void setImpOrderItemId(String value) {
        this.impOrderItemId = value;
    }

    /**
     * 进口订单项ID
     */
    public String getImpOrderItemId() {
        return this.impOrderItemId;
    }

    /**
     * 装箱单Id
     *
     * @param value
     */
    public void setPackingListItemId(String value) {
        this.packingListItemId = value;
    }

    /**
     * 装箱单Id
     */
    public String getPackingListItemId() {
        return this.packingListItemId;
    }

    /**
     * 海关进出口税则Id
     *
     * @param value
     */
    public void setChinaCustomsTariffId(String value) {
        this.chinaCustomsTariffId = value;
    }

    /**
     * 海关进出口税则Id
     */
    public String getChinaCustomsTariffId() {
        return this.chinaCustomsTariffId;
    }

    /**
     * 商品Id
     *
     * @param value
     */
    public void setGoodsId(String value) {
        this.goodsId = value;
    }

    /**
     * 商品Id
     */
    public String getGoodsId() {
        return this.goodsId;
    }

    /**
     * 进口订号
     *
     * @param value
     */
    public void setImpOrderBillNo(String value) {
        this.impOrderBillNo = value;
    }

    /**
     * 进口订号
     */
    public String getImpOrderBillNo() {
        return this.impOrderBillNo;
    }

    /**
     * @param value
     */
    public void setQuantity(java.math.BigDecimal value) {
        this.quantity = value;
    }

    /**
     *
     */
    public java.math.BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * 单价
     *
     * @param value
     */
    public void setPrice(java.math.BigDecimal value) {
        this.price = value;
    }

    /**
     * 单价
     */
    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    /**
     * 金额
     *
     * @param value
     */
    public void setAmount(java.math.BigDecimal value) {
        this.amount = value;
    }

    /**
     * 金额
     */
    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * 报关单价
     *
     * @param value
     */
    public void setBgPrice(java.math.BigDecimal value) {
        this.bgPrice = value;
    }

    /**
     * 报关单价
     */
    public java.math.BigDecimal getBgPrice() {
        return this.bgPrice;
    }

    /**
     * 报关总价
     *
     * @param value
     */
    public void setBgAmount(java.math.BigDecimal value) {
        this.bgAmount = value;
    }

    /**
     * 报关总价
     */
    public java.math.BigDecimal getBgAmount() {
        return this.bgAmount;
    }

    /**
     * @param value
     */
    public void setFare(java.math.BigDecimal value) {
        this.fare = value;
    }

    /**
     *
     */
    public java.math.BigDecimal getFare() {
        return this.fare;
    }

    /**
     * @param value
     */
    public void setInsurance(java.math.BigDecimal value) {
        this.insurance = value;
    }

    /**
     *
     */
    public java.math.BigDecimal getInsurance() {
        return this.insurance;
    }

    /**
     * @param value
     */
    public void setOtherFare(java.math.BigDecimal value) {
        this.otherFare = value;
    }

    /**
     *
     */
    public java.math.BigDecimal getOtherFare() {
        return this.otherFare;
    }

    /**
     * 币种
     *
     * @param value
     */
    public void setCurrency(Integer value) {
        this.currency = value;
    }

    /**
     * 币种
     */
    public Integer getCurrency() {
        return this.currency;
    }

    /**
     * 海关汇率
     *
     * @param value
     */
    public void setExchangeRate(java.math.BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * 海关汇率
     */
    public java.math.BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * 实际外币货值，报关币种货值
     *
     * @param value
     */
    public void setAmountByBgCy(java.math.BigDecimal value) {
        this.amountByBgCy = value;
    }

    /**
     * 实际外币货值，报关币种货值
     */
    public java.math.BigDecimal getAmountByBgCy() {
        return this.amountByBgCy;
    }

    /**
     * 箱单序号
     *
     * @param value
     */
    public void setBoxNo(String value) {
        this.boxNo = value;
    }

    /**
     * 箱单序号
     */
    public String getBoxNo() {
        return this.boxNo;
    }

    /**
     * 序号
     *
     * @param value
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * 序号
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * 法定数量
     *
     * @param value
     */
    public void setQuantity1(java.math.BigDecimal value) {
        this.quantity1 = value;
    }

    /**
     * 法定数量
     */
    public java.math.BigDecimal getQuantity1() {
        return this.quantity1;
    }

    /**
     * 第二数量
     *
     * @param value
     */
    public void setQuantity2(java.math.BigDecimal value) {
        this.quantity2 = value;
    }

    /**
     * 第二数量
     */
    public java.math.BigDecimal getQuantity2() {
        return this.quantity2;
    }
    //===========================================代码生成结束============================================
}

