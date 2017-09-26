package com.lz.mapper;

import com.lz.model.CloudQPContainers;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPContainersMapper {

    int insertCloudQPContainers(CloudQPContainers cloudQPContainers);

    int insertCloudQPContainersBatch(List<CloudQPContainers> cloudQPContainerses);

    @Select("select *from BG_CONTAINERS where BG_MAINS_UUID = #{mainId}")
    CloudQPContainers getByMainId(@Param("mainId") String mainId);

    @Select("delete from BG_CONTAINERS where BG_MAINS_UUID = #{mainId}")
    void delByMainId(@Param("mainId") String mainId);
}