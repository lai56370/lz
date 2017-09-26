package com.lz.mapper;

import com.lz.model.CloudQPGoods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPGoodsMapper {

    int insertCloudQPGoods(CloudQPGoods cloudQPGoods);

    int insertCloudQPGoodsBatch(List<CloudQPGoods> cloudQPGoodsList);

    @Select("delete from BG_GOODS where BG_MAINS_UUID=#{mainId}")
    void delByMainId(@Param("mainId") String mainId);
}
