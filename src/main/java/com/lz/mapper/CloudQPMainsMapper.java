package com.lz.mapper;

import com.lz.model.CloudQPContainers;
import com.lz.model.CloudQPMains;

import java.util.List;

/**
 * Created by Maven on 2017/9/25.
 */
public interface CloudQPMainsMapper {
    int insertCloudQPMains(CloudQPMains cloudQPMains);

    int insertCloudQPMainsBatch(List<CloudQPMains> cloudQPMainses);
}
