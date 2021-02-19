package com.ntm.boot_mybatis.mapper;


import com.ntm.boot_mybatis.model.TestRollback;
import com.ntm.boot_mybatis.entity.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {

    Country GetOne(Country country);

    List<Country> GetAll();

    boolean Insert(Country country);

    boolean TestRollback1(TestRollback testRollback);

    boolean TestRollback2(TestRollback testRollback);

    boolean update(Country country);

    boolean delete(int id);
}
