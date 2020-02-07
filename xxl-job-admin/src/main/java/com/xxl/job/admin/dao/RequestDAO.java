package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.Request;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestDAO {
    int deleteByPrimaryKey(String XH);

    int insert(Request record);

    Request selectByPrimaryKey(String XH);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);
}