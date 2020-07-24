package com.ntm.boot_mybatis.service.Impl;

import com.ntm.boot_mybatis.mapper.UserMapper;
import com.ntm.boot_mybatis.model.TestRollback;
import com.ntm.boot_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName TestRollbackImpl
 * @Author Tian
 * @Date 2020/7/24 13:56
 * @Description TODO
 * @Version 1.0
 */
@Component
public class TestRollbackImpl {
    @Resource
    public UserMapper userMapper;

    public boolean TestRollback(TestRollback testRollback){
        userMapper.TestRollback1(testRollback);
        User us = userMapper.GetOne(new User(testRollback.Name,testRollback.Code));
        testRollback.Id = us.id;
        userMapper.TestRollback2(testRollback);
        return true;
    }
}
