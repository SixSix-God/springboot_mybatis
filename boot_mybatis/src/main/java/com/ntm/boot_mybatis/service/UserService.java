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

//service层注解
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    public TestRollbackImpl impl;

    /**
     * @Title Insert
     * @Description 根据country中某个字段获取某个country实体
     * @Author TIAN
     * @Date 2020/7/24 17:28
     * @Return com.ntm.boot_mybatis.util.ResponBase
     * @Throws
     */
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

    /**
     * @Title Insert
     * @Description 获取country表全部数据
     * @Author TIAN
     * @Date 2020/7/24 17:28
     * @Return com.ntm.boot_mybatis.util.ResponBase
     * @Throws
     */
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

    /**
     * @Title Insert
     * @Description 测试新增
     * @Author TIAN
     * @Date 2020/7/24 17:28
     * @Return com.ntm.boot_mybatis.util.ResponBase
     * @Throws
     */
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
    /**
     * @Title TestRollback
     * @Description 测试事务回滚
     * @Author TIAN
     * @Date 2020/7/24 17:27
     * @Return com.ntm.boot_mybatis.util.ResponBase
     * @Throws
     */
    //开启事务注解（使用该注解Autowired的不能为private）
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
