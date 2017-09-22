package com.lz.mapper;



import com.lz.model.BaseGoodsModel;

import java.util.List;
import java.util.Map;


public interface BaseGoodsMapperGen {

	//===========================================代码生成开始============================================

    BaseGoodsModel getBaseGoods(java.lang.String id);

    List<BaseGoodsModel> getBaseGoodsList(Map<String, Object> searchParams);

    int insertBaseGoods(BaseGoodsModel baseGoodsModel);

    int insertBaseGoodsBatch(List<BaseGoodsModel> baseGoodsModelList);

    int updateBaseGoods(BaseGoodsModel baseGoodsModel);

    //===========================================代码生成结束============================================
}
