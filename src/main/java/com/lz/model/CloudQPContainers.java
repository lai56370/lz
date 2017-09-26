package com.lz.model;

/**
 * Created by KangXinghua on 2016/10/31.
 */
public class CloudQPContainers {
    private String BG_CONTAINERS_UUID;//varchar(50)	柜号表uuid
    private String BG_MAINS_UUID;//varchar(50)	报关主表uuid
    private Integer num_no;//Int	序号
    private String container_no;//varchar(20)	柜号
    private String container_type_no;//varchar(10)	类型

    public String getBG_CONTAINERS_UUID() {
        return BG_CONTAINERS_UUID;
    }

    public void setBG_CONTAINERS_UUID(String BG_CONTAINERS_UUID) {
        this.BG_CONTAINERS_UUID = BG_CONTAINERS_UUID;
    }

    public String getBG_MAINS_UUID() {
        return BG_MAINS_UUID;
    }

    public void setBG_MAINS_UUID(String BG_MAINS_UUID) {
        this.BG_MAINS_UUID = BG_MAINS_UUID;
    }

    public Integer getNum_no() {
        return num_no;
    }

    public void setNum_no(Integer num_no) {
        this.num_no = num_no;
    }

    public String getContainer_no() {
        return container_no;
    }

    public void setContainer_no(String container_no) {
        this.container_no = container_no;
    }

    public String getContainer_type_no() {
        return container_type_no;
    }

    public void setContainer_type_no(String container_type_no) {
        this.container_type_no = container_type_no;
    }
}
