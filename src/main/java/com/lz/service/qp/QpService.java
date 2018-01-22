package com.lz.service.qp;

import com.lz.model.CloudQPContainers;
import com.lz.model.CloudQPGoods;
import com.lz.model.CloudQPMains;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

    @Value("${userset.oneWindowPath}")
    private String oneWindowPath;

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

    public void sendOneWindow(String filename, byte[] xmlBase, byte[] xdBase64, byte[] fpBase64, byte[] htBytes) throws Exception {

        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(oneWindowPath + "\\OutBox\\" + filename + ".zip"));
        out.putNextEntry(new ZipEntry(filename + ".xml"));
        out.write(xmlBase, 0, xmlBase.length);
        out.closeEntry();

        out.putNextEntry(new ZipEntry("packingList.pdf"));
        out.write(xdBase64, 0, xdBase64.length);
        out.closeEntry();

        out.putNextEntry(new ZipEntry("invoice.pdf"));
        out.write(fpBase64, 0, fpBase64.length);
        out.closeEntry();

        out.putNextEntry(new ZipEntry("contract.pdf"));
        out.write(htBytes, 0, htBytes.length);
        out.closeEntry();

        // 每个打包都有的两个pdf信息
        out.putNextEntry(new ZipEntry("保险协议.pdf"));
        FileInputStream ins1 = new FileInputStream(new File(oneWindowPath + "\\保险协议.pdf"));
        BufferedInputStream bin = new BufferedInputStream(ins1);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream bout = new BufferedOutputStream(baos);
        byte[] buffer = new byte[1024];
        int len = bin.read(buffer);
        while (len != -1) {
            bout.write(buffer, 0, len);
            len = bin.read(buffer);
        }
        bout.flush();

        byte[] outByte = baos.toByteArray();
        out.write(outByte, 0, outByte.length);
        out.closeEntry();
        out.putNextEntry(new ZipEntry("运输报价单及运费情况说明.pdf"));
        ins1 = new FileInputStream(new File(oneWindowPath + "\\运输报价单及运费情况说明.pdf"));
        bin = new BufferedInputStream(ins1);
        baos = new ByteArrayOutputStream();
        bout = new BufferedOutputStream(baos);
        buffer = new byte[1024];
        len = bin.read(buffer);
        while (len != -1) {
            bout.write(buffer, 0, len);
            len = bin.read(buffer);
        }
        bout.flush();

        outByte = baos.toByteArray();
        out.write(outByte, 0, outByte.length);
        out.closeEntry();

        out.close();
    }
}
