package com.ntm.boot_mybatis.service;

import com.ntm.boot_mybatis.mapper.UserMapper;
import com.ntm.boot_mybatis.model.User;
import com.ntm.boot_mybatis.util.Constant;
import com.ntm.boot_mybatis.util.ResponBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User GetOne(User user){
        return userMapper.GetOne(user);
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
}
