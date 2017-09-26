package com.lz.service.qp;

import com.lz.mapper.CloudQPContainersMapper;
import com.lz.model.CloudQPContainers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Maven on 2017/9/25.
 */
@Service
public class CloudQPContainersService {
    @Autowired
    private CloudQPContainersMapper cloudQPContainersMapper;

    public void addCloudQPContainersMapper(CloudQPContainers cloudQPContainers) {
        cloudQPContainersMapper.insertCloudQPContainers(cloudQPContainers);
    }
}
