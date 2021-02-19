package com.ntm.boot_mybatis.mapper;

import com.ntm.boot_mybatis.entity.Role;
import com.ntm.boot_mybatis.entity.RoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({"ALL", "AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc"})
@Mapper
public interface RoleMapper {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    long countByExample(RoleExample example);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByExample(RoleExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Role record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Role record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<Role> selectByExample(RoleExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Role selectByPrimaryKey(Integer id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Role record);
}