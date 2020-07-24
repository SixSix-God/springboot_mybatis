package com.ntm.boot_mybatis.service;

import com.ntm.boot_mybatis.mapper.UserMapper;
import com.ntm.boot_mybatis.model.TestRollback;
import com.ntm.boot_mybatis.model.User;
import com.ntm.boot_mybatis.service.Impl.TestRollbackImpl;
import com.ntm.boot_mybatis.util.Constant;
import com.ntm.boot_mybatis.util.ResponBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    public TestRollbackImpl impl;
    public ResponBase GetOne(User user){
        ResponBase responBase = new ResponBase();
        try {
            responBase.data = userMapper.GetOne(user);
            responBase.success = true;
            responBase.statecode = Constant.SUCCESSED_CODE;
        }catch (Exception ex){
            responBase.errormsg = ex.toString();
            responBase.success = false;
            responBase.statecode = Constant.FAILED_CODE;
        }
        return responBase;
    }

    public ResponBase GetAll(){
        ResponBase responBase = new ResponBase();
        try {
            responBase.data = userMapper.GetAll();
            responBase.success = true;
            responBase.statecode = Constant.SUCCESSED_CODE;
        }catch (Exception ex){
            responBase.errormsg = ex.toString();
            responBase.success = false;
            responBase.statecode = Constant.FAILED_CODE;
        }
        return responBase;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
    public ResponBase Insert(User user){
        ResponBase responBase = new ResponBase();
        try {
            responBase.data = userMapper.Insert(user);
            responBase.success = true;
            responBase.statecode = Constant.SUCCESSED_CODE;
        }catch (Exception ex){
            responBase.errormsg = ex.toString();
            responBase.success = false;
            responBase.statecode = Constant.FAILED_CODE;
        }
        return responBase;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
    public ResponBase TestRollback(TestRollback testRollback){
        ResponBase responBase = new ResponBase();
        try {
            responBase.data = impl.TestRollback(testRollback);
            responBase.success = true;
            responBase.statecode = Constant.SUCCESSED_CODE;
        }catch (Exception ex){
            responBase.errormsg = ex.toString();
            responBase.success = false;
            responBase.statecode = Constant.FAILED_CODE;
        }
        return responBase;
    }
}
