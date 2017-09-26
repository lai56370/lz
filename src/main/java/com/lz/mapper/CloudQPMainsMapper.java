package com.lz.mapper;

import com.lz.model.CloudQPMains;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPMainsMapper {
    int insertCloudQPMains(CloudQPMains cloudQPMains);

    int insertCloudQPMainsBatch(List<CloudQPMains> cloudQPMainses);

    @Select("select *from BG_MAINS where BG_MAINS_UUID = #{id}")
    CloudQPMains getById(@Param("id") String id);

    @Select("delete from BG_MAINS where BG_MAINS_UUID = #{id}")
    void delById(@Param("id") String id);
}
