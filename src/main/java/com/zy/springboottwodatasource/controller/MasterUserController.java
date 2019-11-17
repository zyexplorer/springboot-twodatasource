package com.zy.springboottwodatasource.controller;

import com.zy.springboottwodatasource.dao.master.MasterUserMapper;
import com.zy.springboottwodatasource.domain.master.MasterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: MasterUserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2019年11月17日  10:52
 */
@RestController
@RequestMapping("/master")
public class MasterUserController {

    @Resource
    private MasterUserMapper masterUserMapper;

    @GetMapping("/getUser")
    public List getUser() {
        List<MasterUser> users = masterUserMapper.selectByExample(null);
        return users;
    }

    @GetMapping("/getOneUser")
    public MasterUser getOneUser() {
        MasterUser user = masterUserMapper.getOneUser();
        return user;
    }

    @GetMapping("/getUserByExample")
    public List getUserByExample() {
        Example example = new Example(MasterUser.class);
        example.createCriteria().andEqualTo("user","root");
        List<MasterUser> users = masterUserMapper.selectByExample(example);
        return users;
    }

}
