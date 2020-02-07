package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.Node;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NodeDAO {
    int deleteByPrimaryKey(Long XH);

    int insert(Node record);

    Node selectByPrimaryKey(Long XH);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}