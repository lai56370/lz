package com.lz.controller;

import com.lz.common.model.UserSet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maven on 2017/2/27.
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Value("${userset.pdfPath}")
    private String pdfPath;

    @RequestMapping("/getById")
    String getById() {
        UserSet userSet = new UserSet();
        System.out.println("123123");
        return pdfPath;
//        return "123";
    }
}
