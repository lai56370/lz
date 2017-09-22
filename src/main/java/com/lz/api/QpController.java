package com.lz.api;

import com.lz.model.BaseGoodsModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maven on 2017/9/22.
 */
@RestController
@RequestMapping("/api")
public class QpController {
    private final static Logger logger = LoggerFactory.getLogger(QpController.class);

    @RequestMapping(value = "setQpData", method = RequestMethod.POST)
    String setQpData(@RequestParam(value = "userName") String userName) {
        logger.info(userName);
        return "123123";
    }
}
