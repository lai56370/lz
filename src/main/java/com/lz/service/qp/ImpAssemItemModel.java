package com.lz.service.qp;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scm_imp_assem_item 表的Model
 */
public class ImpAssemItemModel extends ImpAssemItemModelGen {

    // 产品信息 base_goods
    private String model; // 型号
    private String goodsName; // 品名
    private String goodsNumber; // 商品编码
    private String brand; // 品牌
    private String unit; // 单位
    private String spec; // 海关规格
    private Boolean tubeProducts; // 管制品
    private Integer ccc; // 强制认证
    private String goodsPlace; // 产地 base_dict country country
    private BigDecimal fund; // 基金

    // 海关进出口税则 base_china_customs_tariff
    private String unit1; // 法定单位
    private String unit2; // 第二单位
    private String customsCond; // 海关监管条件
    private Double tariffRate; // 关税税率
    private Double conRate; // 消费税率
    private Double vatRate; // 增值税率
    private Double dumpTaxRate; // 反倾销税率

    // 装箱明细信息 scm_packing_list_item
    private BigDecimal netWeight; // 净重
    private BigDecimal weight; // 毛重
    private Integer boardNum; // 板数
    private Integer boardType; // 板类型,木板，胶板
    private Integer boxQty; // 箱数

    // 报关单 scm_imp_assem
    private Date bgDate; // 报关日期
    private String bgBillNo; // 报关合同号
    private Integer currency; // 币种

    // 进口订单明细
    private String impOrderId; // 进口订单Id

    // 客户信息 base_customer
    private String customerName;// 客户名称

    // 供应商信息 直接查询出，反正就一个
    private String orderSupplyName;

    // 打印导出
    private BigDecimal fundBySettlement; //  基金总额
    private BigDecimal tariffBySettlement; // 关税
    private BigDecimal vatBySettlement; // 增值税
    private BigDecimal conTaxBySettlement; // 消费税
    private BigDecimal dumpTaxBySettlement; // 反倾销税
    private BigDecimal otherFareBySettlement; // 反倾销税
    private BigDecimal zhFareBySettlement; // 综合费
    private BigDecimal actRMBBySettlement; // 货款
    private String CJDW;//成交单位
    private String YCD;//原产地
    private String DEDW;//第二单位
    private BigDecimal DJ;//单价
    private String descCountry;//最终目的国
    private String currencyNameForExcel;//导出报关单币种 不是跟明细币种一样的，要跟进口拼单币种一样
    private String currencyName;
    private String cccName;
    private String boardTypeName;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Boolean getTubeProducts() {
        return tubeProducts;
    }

    public void setTubeProducts(Boolean tubeProducts) {
        this.tubeProducts = tubeProducts;
    }

    public Integer getCcc() {
        return ccc;
    }

    public void setCcc(Integer ccc) {
        this.ccc = ccc;
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getCustomsCond() {
        return customsCond;
    }

    public void setCustomsCond(String customsCond) {
        this.customsCond = customsCond;
    }

    public Double getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(Double tariffRate) {
        this.tariffRate = tariffRate;
    }

    public Double getConRate() {
        return conRate;
    }

    public void setConRate(Double conRate) {
        this.conRate = conRate;
    }

    public Double getVatRate() {
        return vatRate;
    }

    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public Double getDumpTaxRate() {
        return dumpTaxRate;
    }

    public void setDumpTaxRate(Double dumpTaxRate) {
        this.dumpTaxRate = dumpTaxRate;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getBoardNum() {
        return boardNum;
    }

    public void setBoardNum(Integer boardNum) {
        this.boardNum = boardNum;
    }

    public Integer getBoardType() {
        return boardType;
    }

    public void setBoardType(Integer boardType) {
        this.boardType = boardType;
    }

    public Integer getBoxQty() {
        return boxQty;
    }

    public void setBoxQty(Integer boxQty) {
        this.boxQty = boxQty;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getBgDate() {
        return bgDate;
    }

    public void setBgDate(Date bgDate) {
        this.bgDate = bgDate;
    }

    public String getBgBillNo() {
        return bgBillNo;
    }

    public void setBgBillNo(String bgBillNo) {
        this.bgBillNo = bgBillNo;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public String getImpOrderId() {
        return impOrderId;
    }

    public void setImpOrderId(String impOrderId) {
        this.impOrderId = impOrderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderSupplyName() {
        return orderSupplyName;
    }

    public void setOrderSupplyName(String orderSupplyName) {
        this.orderSupplyName = orderSupplyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCccName() {
        return cccName;
    }

    public void setCccName(String cccName) {
        this.cccName = cccName;
    }

    public String getBoardTypeName() {
        return boardTypeName;
    }

    public void setBoardTypeName(String boardTypeName) {
        this.boardTypeName = boardTypeName;
    }

    // 打印导出
    public BigDecimal getFundBySettlement() {
        return fundBySettlement;
    }

    public void setFundBySettlement(BigDecimal fundBySettlement) {
        this.fundBySettlement = fundBySettlement;
    }

    public BigDecimal getTariffBySettlement() {
        return tariffBySettlement;
    }

    public void setTariffBySettlement(BigDecimal tariffBySettlement) {
        this.tariffBySettlement = tariffBySettlement;
    }

    public BigDecimal getVatBySettlement() {
        return vatBySettlement;
    }

    public void setVatBySettlement(BigDecimal vatBySettlement) {
        this.vatBySettlement = vatBySettlement;
    }

    public BigDecimal getConTaxBySettlement() {
        return conTaxBySettlement;
    }

    public void setConTaxBySettlement(BigDecimal conTaxBySettlement) {
        this.conTaxBySettlement = conTaxBySettlement;
    }

    public BigDecimal getDumpTaxBySettlement() {
        return dumpTaxBySettlement;
    }

    public void setDumpTaxBySettlement(BigDecimal dumpTaxBySettlement) {
        this.dumpTaxBySettlement = dumpTaxBySettlement;
    }

    public BigDecimal getOtherFareBySettlement() {
        return otherFareBySettlement;
    }

    public void setOtherFareBySettlement(BigDecimal otherFareBySettlement) {
        this.otherFareBySettlement = otherFareBySettlement;
    }

    public BigDecimal getZhFareBySettlement() {
        return zhFareBySettlement;
    }

    public void setZhFareBySettlement(BigDecimal zhFareBySettlement) {
        this.zhFareBySettlement = zhFareBySettlement;
    }

    public BigDecimal getActRMBBySettlement() {
        return actRMBBySettlement;
    }

    public void setActRMBBySettlement(BigDecimal actRMBBySettlement) {
        this.actRMBBySettlement = actRMBBySettlement;
    }

    public String getCJDW() {
        return CJDW;
    }

    public void setCJDW(String CJDW) {
        this.CJDW = CJDW;
    }

    public String getYCD() {
        return YCD;
    }

    public void setYCD(String YCD) {
        this.YCD = YCD;
    }

    public String getDEDW() {
        return DEDW;
    }

    public void setDEDW(String DEDW) {
        this.DEDW = DEDW;
    }

    public BigDecimal getDJ() {
        return DJ;
    }

    public void setDJ(BigDecimal DJ) {
        this.DJ = DJ;
    }

    public String getDescCountry() {
        return descCountry;
    }

    public void setDescCountry(String descCountry) {
        this.descCountry = descCountry;
    }

    public String getQuantityForExcel() {
        return getQuantity().stripTrailingZeros().toPlainString();
    }

    public String getQuantity1ForExcel() {
        return getQuantity1().stripTrailingZeros().toPlainString();
    }

    public String getQuantity2ForExcel() {
        return getQuantity2().stripTrailingZeros().toPlainString();
    }

    public String getPriceForExcel() {
        return getPrice().stripTrailingZeros().toPlainString();
    }

    public String getAmountByBgCyForExcel() {
        return getAmountByBgCy().toPlainString();
    }

    public String getAmountByBgPrice() {
        if (null != getAmountByBgCy()) {
            return getAmountByBgCy().divide(getQuantity(), 4, BigDecimal.ROUND_HALF_UP).toPlainString();
        } else {
            return BigDecimal.ZERO.toString();
        }
    }

    public String getQuantityAndUnit() {
        return this.getQuantity().toPlainString() + unit;
    }

    public String getWeightByPrint() {
        return null == weight || 0 == weight.doubleValue() ? "" : weight.toString();
    }

    public Integer getPackingListBoxQty() {
        return boxQty;
    }

    public String getPackingListBoxQtyByPrint() {
        return null == this.getPackingListBoxQty() || 0 == this.getPackingListBoxQty() ? "" : boxQty.toString();
    }

    public BigDecimal getWeightForExcel() {
        return null == weight ? BigDecimal.ZERO : weight.stripTrailingZeros();
    }

    public String getWeightForXd() {
        if (BigDecimal.ZERO.compareTo(weight == null ? BigDecimal.ZERO : weight.stripTrailingZeros()) != 0) {
            return weight == null ? "" : weight.stripTrailingZeros().toPlainString();
        } else {
            return null;
        }
    }

    public Integer getBoxQtyForExcel() {
        if (null == boxQty || boxQty == 0) {
            return null;
        } else {
            return boxQty;
        }
    }

    public String getZM() {
        return "照章征税";
    }

    public String getDJForExcel() {
        if (DJ != null) {
            return DJ.toString();
        } else {
            return null;
        }
    }

    public String getCurrencyNameForExcel() {
        return currencyNameForExcel;
    }

    public void setCurrencyNameForExcel(String currencyNameForExcel) {
        this.currencyNameForExcel = currencyNameForExcel;
    }
}