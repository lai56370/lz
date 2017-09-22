package com.lz.service;

import com.lz.mapper.BaseGoodsMapper;
import com.lz.model.BaseGoodsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maven on 2017/2/27.
 */
@Service
public class GoodsService {
    @Autowired
    private BaseGoodsMapper baseGoodsMapper;

    public BaseGoodsModel getById() {
        return baseGoodsMapper.getById("0004aeca-76cd-436b-b6f5-d6236b608aa3");
    }
}
