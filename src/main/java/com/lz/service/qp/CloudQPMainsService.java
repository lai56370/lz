package com.lz.service.qp;

import com.lz.mapper.CloudQPMainsMapper;
import com.lz.model.CloudQPMains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maven on 2017/9/26.
 */
@Service
public class CloudQPMainsService {
    @Autowired
    private CloudQPMainsMapper cloudQPMainsMapper;

    public CloudQPMains getById(String id) {
        return cloudQPMainsMapper.getById(id);
    }

    public void delById(String id) {
        cloudQPMainsMapper.delById(id);
    }

    public void addCloudQPMains(CloudQPMains cloudQPMains) {
        cloudQPMainsMapper.insertCloudQPMains(cloudQPMains);
    }

    public void addCloudQPMains(List<CloudQPMains> cloudQPMainses) {
        cloudQPMainsMapper.insertCloudQPMainsBatch(cloudQPMainses);
    }
}
