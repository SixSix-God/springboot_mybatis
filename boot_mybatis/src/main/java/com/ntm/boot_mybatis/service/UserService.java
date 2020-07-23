package com.ntm.boot_mybatis.service;

import com.ntm.boot_mybatis.mapper.UserMapper;
import com.ntm.boot_mybatis.model.User;
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

    public List<User> GetAll(){
        return userMapper.GetAll();
    }
}
