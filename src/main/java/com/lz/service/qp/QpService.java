package com.lz.service.qp;

import com.lz.model.CloudQPContainers;
import com.lz.model.CloudQPGoods;
import com.lz.model.CloudQPMains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Maven on 2017/9/26.
 */
@Service
public class QpService {
    @Autowired
    private CloudQPContainersService cloudQPContainersService;
    @Autowired
    private CloudQPMainsService cloudQPMainsService;
    @Autowired
    private CloudQPGoodsService cloudQPGoodsService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void sendQp(CloudQPMains cloudQPMains, List<CloudQPGoods> cloudQPGoodses, CloudQPContainers cloudQPContainers) {
        cloudQPMains.setQP_FLAG("0");
        cloudQPMains.setEntry_type("M");
        cloudQPContainers.setNum_no(1);
        cloudQPMainsService.addCloudQPMains(cloudQPMains);
        cloudQPContainersService.addCloudQPContainersMapper(cloudQPContainers);
        cloudQPGoodsService.addCloudQPGoods(cloudQPGoodses);
    }
}
