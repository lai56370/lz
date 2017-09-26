package com.lz.mapper;

import com.lz.model.CloudQPGoods;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPGoodsMapper {

    int insertCloudQPGoods(CloudQPGoods cloudQPGoods);

    int insertCloudQPGoodsBatch(List<CloudQPGoods> cloudQPGoodsList);
}
