package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.ProcessInstance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProcessInstanceDAO {
    int deleteByPrimaryKey(Long XH);

    int insert(ProcessInstance record);

    ProcessInstance selectByPrimaryKey(Long XH);

    int updateByPrimaryKeySelective(ProcessInstance record);

    int updateByPrimaryKey(ProcessInstance record);
}