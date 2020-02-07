package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.Process;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProcessDAO {
    int deleteByPrimaryKey(String XH);

    int insert(Process record);

    Process selectByPrimaryKey(String XH);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);
}