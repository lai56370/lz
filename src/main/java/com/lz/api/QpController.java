package com.lz.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.lz.common.model.CommonReturn;
import com.lz.model.CloudQPContainers;
import com.lz.model.CloudQPGoods;
import com.lz.model.CloudQPMains;
import com.lz.service.qp.CloudQPContainersService;
import com.lz.service.qp.CloudQPMainsService;
import com.lz.service.qp.QpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * Created by Maven on 2017/9/22.
 */
@RestController
@RequestMapping("/api")
public class QpController {
    private final static Logger logger = LoggerFactory.getLogger(QpController.class);

    @Autowired
    private QpService qpService;
    @Autowired
    private CloudQPMainsService cloudQPMainsService;

    @RequestMapping(value = "setQpData", method = RequestMethod.POST)
    Object setQpData(@RequestParam(value = "cloudQPMainsJson") String cloudQPMainsJson,
                     @RequestParam(value = "cloudQPMainsListJson") String cloudQPMainsListJson,
                     @RequestParam(value = "cloudQPContainersJson") String cloudQPContainersJson,
                     @RequestParam(value = "bgBillNo") String bgBillNo,
                     @RequestParam(value = "xdBase64") String xdBase64,
                     @RequestParam(value = "fpBase64") String fpBase64,
                     @RequestParam(value = "htBase64") String htBase64,
                     @RequestParam(value = "userName") String userName) {
        CommonReturn crt = new CommonReturn();

        try {
            CloudQPMains cloudQPMains = JSON.parseObject(cloudQPMainsJson, CloudQPMains.class);
            List<CloudQPGoods> cloudQPGoodses = JSON.parseArray(cloudQPMainsListJson, CloudQPGoods.class);
            CloudQPContainers cloudQPContainers = JSON.parseObject(cloudQPContainersJson, CloudQPContainers.class);

            byte[] xdBytes = Base64.getDecoder().decode(xdBase64);
            byte[] fpBytes = Base64.getDecoder().decode(fpBase64);
            byte[] htBytes = Base64.getDecoder().decode(htBase64);
            logger.info(">>>>>>>>>>>>>>>" + userName);
            logger.info(">>>>>>>>>>>>>>>" + cloudQPMains.getBG_MAINS_UUID() + ">>>>>>>>" + cloudQPMains.getContract_no());
            qpService.sendQp(cloudQPMains, cloudQPGoodses, cloudQPContainers, xdBytes, fpBytes, htBytes);
        } catch (Exception e) {
            logger.error("qp操作失败cloudQPMainsJson>>>>>>>>>>>>>>" + cloudQPMainsJson);
            logger.error("qp操作失败cloudQPMainsListJson>>>>>>>>>>>>>>" + cloudQPMainsListJson);
            logger.error("qp操作失败cloudQPContainersJson>>>>>>>>>>>>>>" + cloudQPContainersJson);
            logger.error("qp操作失败>>>>>>>>>>>>>>" + userName, e);
            crt.setRet(1);
            crt.setMsg("qp操作失败");
        }

        return crt;
    }

    @RequestMapping(value = "setOneWindow", method = RequestMethod.POST)
    Object setOneWindow(@RequestParam(value = "fileName") String fileName,
                        @RequestParam(value = "bgBillNo") String bgBillNo,
                        @RequestParam(value = "xmlBase64") String xmlBase64,
                        @RequestParam(value = "xdBase64") String xdBase64,
                        @RequestParam(value = "fpBase64") String fpBase64,
                        @RequestParam(value = "htBase64") String htBase64,
                        @RequestParam(value = "userName") String userName) {
        CommonReturn crt = new CommonReturn();

        try {
            byte[] xmlBase = Base64.getDecoder().decode(xmlBase64);
            byte[] xdBytes = Base64.getDecoder().decode(xdBase64);
            byte[] fpBytes = Base64.getDecoder().decode(fpBase64);
            byte[] htBytes = Base64.getDecoder().decode(htBase64);
            qpService.sendOneWindow(fileName, xmlBase, xdBytes, fpBytes, htBytes);
            logger.info(">>>>>>>>>>>>>>>" + userName + ">>>>>>>>>>>> 单一窗口" + bgBillNo);
        } catch (Exception e) {
            crt.setRet(1);
            crt.setMsg("qp操作失败");
        }

        return crt;
    }

    @RequestMapping(value = "testInsert", method = RequestMethod.GET)
    String testInsert() {
        System.out.println("1");
        String cloudQPMainsJson = "{\"agent_name\":\"深圳市路迪斯达供应链管理有限公司\",\"agent_no\":\"4403162807\",\"apply_dt\":1506614400000,\"bG_MAINS_UUID\":\"f79d952f-c3b8-20df-812d-8fb889d8\",\"bargainmode_no\":\"CIF\",\"cONSIGNEE_CODE\":\"91330200MA283665X6\",\"cabin_no\":\"LDSD170916866A\",\"consignee_name\":\"奥克斯空调股份有限公司\",\"consignee_no\":\"3302963C91\",\"contract_no\":\"LIC17090844\",\"dECLAREPORT_NO\":\"异地\",\"dELIVER_NAME\":\"燁溢科技(香港)有限公司\",\"declare_id\":2,\"end_country_no\":\"深圳特区\",\"freight\":0.00,\"freight_currency_no\":\"美元\",\"freightmode_no\":\"总价\",\"grossweight\":2540,\"iNDATE_DT\":1506614400000,\"imposemode_no\":\"一般征税\",\"incidental\":0.00,\"incidentalmode_no\":\"总价\",\"jGYXQR\":\"否\",\"loadport_no\":\"上海外高桥\",\"mark\":\"上海保税仓清关\",\"netweight\":1670.0,\"pack_no\":\"纸箱\",\"piece\":250,\"port_no\":\"异地\",\"sEND_DATE\":1506655109861,\"sHIPPER_CODE\":\"91440300715202300K\",\"shipper_name\":\"深圳市路迪斯达供应链管理有限公司\",\"shipper_no\":\"4403162807\",\"start_country_no\":\"上海外高桥保税仓\",\"subscribe\":0,\"subscribe_currency_no\":\"美元\",\"subscribemode_no\":\"总价\",\"tRADE_COUNTRY_NO\":\"香港\",\"tSGXQR\":\"否\",\"trade_no\":\"一般贸易\",\"transmode_no\":\"公路运输\",\"voyage\":\"0100201709293\",\"zFTXQSYFQR\":\"否\"}";
        System.out.println("2");
        CloudQPMains cloudQPMains = JSON.parseObject(cloudQPMainsJson, CloudQPMains.class);
        System.out.println("3");
        cloudQPMains.setQP_FLAG("0");
        cloudQPMains.setEntry_type("M");
        System.out.println("4");
        cloudQPMainsService.addCloudQPMains(cloudQPMains);
        System.out.println("5");
        return "123";
//        return "123";
    }
}
