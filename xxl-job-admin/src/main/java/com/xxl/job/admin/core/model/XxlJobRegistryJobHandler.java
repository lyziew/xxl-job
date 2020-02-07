package com.xxl.job.admin.core.model;

import java.util.Date;

/**
 * Created by xuxueli on 16/9/30.
 */
public class XxlJobRegistryJobHandler {

    private int id;
    private int registryId;
    private String jobHandler;
    private Date updateTime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistryId() {
        return registryId;
    }

    public void setRegistryId(int registry_id) {
        this.registryId = registry_id;
    }


    public String getJobHandler() {
        return jobHandler;
    }

    public void setJobHandler(String jobHandler) {
        this.jobHandler = jobHandler;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
