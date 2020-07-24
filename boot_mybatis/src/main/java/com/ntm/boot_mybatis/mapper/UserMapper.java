package com.ntm.boot_mybatis.mapper;


import com.ntm.boot_mybatis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User GetOne(User user);

    List<User> GetAll();
}
