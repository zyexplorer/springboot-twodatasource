package com.zy.springboottwodatasource.dao.cluster;

import com.zy.springboottwodatasource.domain.cluster.ClusterUser;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ClusterUserMapper extends Mapper<ClusterUser> {

}