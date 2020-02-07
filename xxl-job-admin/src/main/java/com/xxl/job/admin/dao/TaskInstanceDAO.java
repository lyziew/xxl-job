package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.TaskInstance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskInstanceDAO {
    int deleteByPrimaryKey(Long XH);

    int insert(TaskInstance record);
    
    TaskInstance selectByPrimaryKey(Long XH);

    int updateByPrimaryKeySelective(TaskInstance record);

    int updateByPrimaryKey(TaskInstance record);
}