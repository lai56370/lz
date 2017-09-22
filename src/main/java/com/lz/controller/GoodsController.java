package com.lz.controller;

import com.lz.model.BaseGoodsModel;
import com.lz.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maven on 2017/2/27.
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getById")
    String getById() {
        BaseGoodsModel baseGoodsModel = goodsService.getById();
        return "产品：" + baseGoodsModel.getCode();
//        return "123";
    }
}
