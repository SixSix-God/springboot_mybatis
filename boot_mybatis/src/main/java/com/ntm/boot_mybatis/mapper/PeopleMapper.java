package com.ntm.boot_mybatis.mapper;

import com.ntm.boot_mybatis.entity.People;
import com.ntm.boot_mybatis.entity.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName PeopleMapper
 * @Author Tian
 * @Date 2020/7/24 10:33
 * @Description TODO
 * @Version 1.0
 */
@Repository
public interface PeopleMapper {
    List<People> GetAll();

    People GetOne(People people);

    People GetOneByUser(Country country);
}
