package com.lz.service.qp;

import com.alibaba.fastjson.JSON;
import com.lz.common.model.UserSet;
import com.lz.model.CloudQPContainers;
import com.lz.model.CloudQPGoods;
import com.lz.model.CloudQPMains;
import com.lz.util.PentahoReportUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Maven on 2017/9/26.
 */
@Service
public class QpService {
    private Logger logger = LoggerFactory.getLogger(QpService.class);
    @Autowired
    private CloudQPContainersService cloudQPContainersService;
    @Autowired
    private CloudQPMainsService cloudQPMainsService;
    @Autowired
    private CloudQPGoodsService cloudQPGoodsService;

    @Value("${userset.pdfPath}")
    private String pdfPath;

    @Transactional(propagation = Propagation.REQUIRED)
    public void sendQp(CloudQPMains cloudQPMains, List<CloudQPGoods> cloudQPGoodses, CloudQPContainers cloudQPContainers,
                       byte[] xdBase64, byte[] fpBase64, byte[] htBytes) throws Exception {
        FileOutputStream xd = new FileOutputStream(pdfPath + cloudQPMains.getBG_MAINS_UUID() + "_xd.pdf");
        xd.write(xdBase64);
        xd.flush();
        xd.close();

        FileOutputStream fp = new FileOutputStream(pdfPath + cloudQPMains.getBG_MAINS_UUID() + "_fp.pdf");
        fp.write(fpBase64);
        fp.flush();
        fp.close();

        FileOutputStream ht = new FileOutputStream(pdfPath + cloudQPMains.getBG_MAINS_UUID() + "_ht.pdf");
        ht.write(htBytes);
        ht.flush();
        ht.close();

        if (null != cloudQPMainsService.getById(cloudQPMains.getBG_MAINS_UUID())) {
            cloudQPMainsService.delById(cloudQPMains.getBG_MAINS_UUID());
            cloudQPContainersService.delByMainId(cloudQPMains.getBG_MAINS_UUID());
            cloudQPGoodsService.delByMainId(cloudQPMains.getBG_MAINS_UUID());
        }
        cloudQPMains.setQP_FLAG("0");
        cloudQPMains.setEntry_type("M");
        cloudQPContainers.setNum_no(1);
        cloudQPMainsService.addCloudQPMains(cloudQPMains);
        cloudQPContainersService.addCloudQPContainersMapper(cloudQPContainers);
        cloudQPGoodsService.addCloudQPGoods(cloudQPGoodses);
    }
}
