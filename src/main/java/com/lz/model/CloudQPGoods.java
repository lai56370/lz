package com.lz.model;

import java.math.BigDecimal;

/**
 * Created by KangXinghua on 2016/10/31.
 */
public class CloudQPGoods {
    private String BG_GOODS_UUID;//varchar(50)	商品表uuid
    private String BG_MAINS_UUID;//varchar(50)	报表主表uuid
    private Integer num_no;//Int	商品的序号
    private String item_no;//varchar(10)	项号
    private String ver_no;//varchar(10)	版本号
    private String goods_no;//varchar(10)	商品编码
    private String goods_spec;//varchar(255)	商品规格
    private String goods_name;//varchar(255)	商品名称
    private String unit_no;//varchar(10)	成交单位
    private String unit02_no;//varchar(10)	法1单位
    private String unit03_no;//varchar(10)	法2单位
    private BigDecimal amount;//numeric(18, 5)	成交数量
    private BigDecimal amount02;//numeric(18, 5)	法1数量
    private BigDecimal amount03;//numeric(18, 5)	法2数量
    private String currency_no;//varchar(10)	币种
    private String country_no;//varchar(10)	国家
    private BigDecimal TOTALPRICE;//numeric(18, 2)	总价
    private BigDecimal price;//numeric(18, 4)	单价
    private String impose_no;//varchar(10)	征免
    private String OTHER_COUNTRY_NO;//varchar(10)	国家2

    public String getBG_GOODS_UUID() {
        return BG_GOODS_UUID;
    }

    public void setBG_GOODS_UUID(String BG_GOODS_UUID) {
        this.BG_GOODS_UUID = BG_GOODS_UUID;
    }

    public String getBG_MAINS_UUID() {
        return BG_MAINS_UUID;
    }

    public void setBG_MAINS_UUID(String BG_MAINS_UUID) {
        this.BG_MAINS_UUID = BG_MAINS_UUID;
    }

    public Integer getNum_no() {
        return num_no;
    }

    public void setNum_no(Integer num_no) {
        this.num_no = num_no;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getVer_no() {
        return ver_no;
    }

    public void setVer_no(String ver_no) {
        this.ver_no = ver_no;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getGoods_spec() {
        return goods_spec;
    }

    public void setGoods_spec(String goods_spec) {
        this.goods_spec = goods_spec;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getUnit_no() {
        return unit_no;
    }

    public void setUnit_no(String unit_no) {
        this.unit_no = unit_no;
    }

    public String getUnit02_no() {
        return unit02_no;
    }

    public void setUnit02_no(String unit02_no) {
        this.unit02_no = unit02_no;
    }

    public String getUnit03_no() {
        return unit03_no;
    }

    public void setUnit03_no(String unit03_no) {
        this.unit03_no = unit03_no;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount02() {
        return amount02;
    }

    public void setAmount02(BigDecimal amount02) {
        this.amount02 = amount02;
    }

    public BigDecimal getAmount03() {
        return amount03;
    }

    public void setAmount03(BigDecimal amount03) {
        this.amount03 = amount03;
    }

    public String getCurrency_no() {
        return currency_no;
    }

    public void setCurrency_no(String currency_no) {
        this.currency_no = currency_no;
    }

    public String getCountry_no() {
        return country_no;
    }

    public void setCountry_no(String country_no) {
        this.country_no = country_no;
    }

    public BigDecimal getTOTALPRICE() {
        return TOTALPRICE;
    }

    public void setTOTALPRICE(BigDecimal TOTALPRICE) {
        this.TOTALPRICE = TOTALPRICE;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImpose_no() {
        return impose_no;
    }

    public void setImpose_no(String impose_no) {
        this.impose_no = impose_no;
    }

    public String getOTHER_COUNTRY_NO() {
        return OTHER_COUNTRY_NO;
    }

    public void setOTHER_COUNTRY_NO(String OTHER_COUNTRY_NO) {
        this.OTHER_COUNTRY_NO = OTHER_COUNTRY_NO;
    }
}
