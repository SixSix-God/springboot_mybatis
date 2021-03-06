package com.ntm.boot_mybatis.service;

import java.util.List;

import com.ntm.boot_mybatis.entity.Role;
import com.ntm.boot_mybatis.entity.RoleExample;

public interface RoleService {


    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Role record, RoleExample example);

    int updateByExample(Role record, RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
