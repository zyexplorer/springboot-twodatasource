package com.zy.springboottwodatasource.dao.master;

import com.zy.springboottwodatasource.domain.master.MasterUser;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface MasterUserMapper extends Mapper<MasterUser> {

    MasterUser getOneUser();
}