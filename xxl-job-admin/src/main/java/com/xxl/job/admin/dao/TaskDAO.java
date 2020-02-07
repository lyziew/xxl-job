package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskDAO {
    int deleteByPrimaryKey(String XH);

    int insert(Task record);

    Task selectByPrimaryKey(String XH);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}