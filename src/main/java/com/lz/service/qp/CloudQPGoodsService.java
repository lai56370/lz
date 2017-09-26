package com.lz.service.qp;

import com.lz.mapper.CloudQPGoodsMapper;
import com.lz.model.CloudQPGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maven on 2017/9/26.
 */
@Service
public class CloudQPGoodsService {
    @Autowired
    private CloudQPGoodsMapper cloudQPGoodsMapper;

    public void addCloudQPGoods(CloudQPGoods cloudQPGoods) {
        cloudQPGoodsMapper.insertCloudQPGoods(cloudQPGoods);
    }

    public void addCloudQPGoods(List<CloudQPGoods> cloudQPGoodsList) {
        cloudQPGoodsMapper.insertCloudQPGoodsBatch(cloudQPGoodsList);
    }
}
