package com.ntm.boot_mybatis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ntm.boot_mybatis.model.TestRollback;
import com.ntm.boot_mybatis.model.User;
import com.ntm.boot_mybatis.service.UserService;
import com.ntm.boot_mybatis.util.Constant;
import com.ntm.boot_mybatis.util.ResponBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public ResponBase GetUser(@PathVariable User user){
        return userService.GetOne(user);
    }

    @RequestMapping("getAll")
    public ResponBase GetAll(){
        return userService.GetAll();
    }

    @ResponseBody
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResponBase Insert(@RequestBody User user){
        return userService.Insert(user);
    }

    @ResponseBody
    @PostMapping(value = "test")
    public ResponBase TestRollback(@RequestBody TestRollback testRollback){
        return userService.TestRollback(testRollback);
    }
}
