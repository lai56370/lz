package com.lz.mapper;

import com.lz.model.CloudQPContainers;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPContainersMapper {

    int insertCloudQPContainers(CloudQPContainers cloudQPContainers);

    int insertCloudQPContainersBatch(List<CloudQPContainers> cloudQPContainerses);
}