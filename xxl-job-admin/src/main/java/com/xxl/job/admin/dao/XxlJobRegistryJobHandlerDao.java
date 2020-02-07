package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobRegistry;
import com.xxl.job.admin.core.model.XxlJobRegistryJobHandler;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by xuxueli on 16/9/30.
 */
@Mapper
public interface XxlJobRegistryJobHandlerDao {

    public List<Integer> findDead(@Param("timeout") int timeout,
                                  @Param("nowTime") Date nowTime);

    public int removeDead(@Param("ids") List<Integer> ids);

    public List<XxlJobRegistryJobHandler> findAll(@Param("timeout") int timeout,
                                                  @Param("nowTime") Date nowTime);

    public int registryUpdate(@Param("registryID") int registryID,
                              @Param("jobHandler") String jobHandler,
                              @Param("updateTime") Date updateTime);

    public int registrySave(@Param("registryID") int registryID,
                            @Param("jobHandler") String jobHandler,
                            @Param("updateTime") Date updateTime);

    public int registryDelete(@Param("registryID") int registryID);

}
