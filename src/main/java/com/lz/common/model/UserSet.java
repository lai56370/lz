package com.lz.common.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Maven on 2017/9/26.
 */
@ConfigurationProperties(prefix="userset")
public class UserSet {
    private String pdfPath;
    private String oneWindowPath;

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    public String getOneWindowPath() {
        return oneWindowPath;
    }

    public void setOneWindowPath(String oneWindowPath) {
        this.oneWindowPath = oneWindowPath;
    }
}
