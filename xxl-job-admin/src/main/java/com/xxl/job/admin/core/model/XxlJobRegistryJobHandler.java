package com.xxl.job.admin.core.model;

import java.util.Date;

/**
 * Created by xuxueli on 16/9/30.
 */
public class XxlJobRegistryJobHandler {

    private int id;
    private int registry_id;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistry_id() {
        return registry_id;
    }

    public void setRegistry_id(int registry_id) {
        this.registry_id = registry_id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
