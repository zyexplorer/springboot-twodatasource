package com.zy.springboottwodatasource.controller;

import com.zy.springboottwodatasource.dao.cluster.ClusterUserMapper;
import com.zy.springboottwodatasource.domain.cluster.ClusterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Title: ClusterUserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2019年11月17日  10:54
 */
@RestController
@RequestMapping("/cluster")
public class ClusterUserController {

    @Autowired
    private ClusterUserMapper clusterUserMapper;

    @GetMapping("/getUser")
    public List getUser() {
        List<ClusterUser> users = clusterUserMapper.selectByExample(null);
        return users;
    }

}
