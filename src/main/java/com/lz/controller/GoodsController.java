package com.lz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maven on 2017/2/27.
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/getById")
    String getById() {
        System.out.println("123123");
        return "222222";
//        return "123";
    }
}
