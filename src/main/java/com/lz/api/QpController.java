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
            logger.info(userName);
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
}
