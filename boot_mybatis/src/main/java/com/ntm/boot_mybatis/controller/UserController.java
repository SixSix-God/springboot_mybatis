package com.ntm.boot_mybatis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ntm.boot_mybatis.model.User;
import com.ntm.boot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    //创建jackson的核心对象 ObjectMapper
    ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable User user){
        return userService.GetOne(user).toString();
    }

    @RequestMapping("getAll")
    public Object GetAll(){
        return userService.GetAll();
    }
}
