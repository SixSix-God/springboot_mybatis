package com.ntm.boot_mybatis.service.Impl;

import com.ntm.boot_mybatis.mapper.CountryMapper;
import com.ntm.boot_mybatis.entity.Country;
import com.ntm.boot_mybatis.model.TestRollback;
import org.springframework.stereotype.Component;

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
    public CountryMapper countryMapper;

    /**
     * @Title TestRollback
     * @Description 测试回滚，同时调用两个表新增，一个表出错回滚，另张表也回滚
     * @Author TIAN
     * @Date 2020/7/24 17:31
     * @Return boolean
     * @Throws
     */
    public boolean TestRollback(TestRollback testRollback) {
        countryMapper.TestRollback1(testRollback);
        Country us = countryMapper.GetOne(new Country(testRollback.Name, testRollback.Code));
        testRollback.Id = us.id;
        countryMapper.TestRollback2(testRollback);
        int i = 1 / 0;
        return true;
    }
}
