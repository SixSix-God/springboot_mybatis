package com.ntm.boot_mybatis.controller;

import com.ntm.boot_mybatis.entity.Country;
import com.ntm.boot_mybatis.model.TestRollback;
import com.ntm.boot_mybatis.service.CountryService;
import com.ntm.boot_mybatis.util.ResponBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 * 类上使用@RestController方法上不必再添加@ResponseBody
 * @RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
 * 用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
 * 可配合@RequestParam来使用
 */
@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @ResponseBody
    @RequestMapping("/getUser")
    public ResponBase GetUser(@PathVariable Country country) {
        return countryService.GetOne(country);
    }

    @ResponseBody
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public ResponBase GetAll() {
        return countryService.GetAll();
    }

    @ResponseBody
    @PostMapping(value = "/insert")
    public ResponBase Insert(@RequestBody Country country) {
        return countryService.Insert(country);
    }

    //@ResponseBody将方法返回数据转为json格式
    @ResponseBody
    @PostMapping(value = "/test")
    //@RequestBody接收json格式参数
    public ResponBase TestRollback(@RequestBody TestRollback testRollback) {
        return countryService.TestRollback(testRollback);
    }
}
