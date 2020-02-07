package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.JobHandler;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobHandlerDAO {
    int deleteByPrimaryKey(Long XH);

    int insert(JobHandler record);

    JobHandler selectByPrimaryKey(Long XH);

    int updateByPrimaryKeySelective(JobHandler record);

    int updateByPrimaryKey(JobHandler record);
}