package com.ntm.boot_mybatis.mapper;

import com.ntm.boot_mybatis.entity.Role;
import com.ntm.boot_mybatis.entity.UserDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthMapper {
    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    UserDetail findByUsername(@Param("name") String name);

    /**
     * 创建新用户
     * @param userDetail
     */
    void insert(UserDetail userDetail);

    /**
     * 创建用户角色
     * @param userId
     * @param roleId
     * @return
     */
    int insertUserRole(@Param("userId") long userId, @Param("roleId") long roleId);

    /**
     * @Title
     * @Description 
     * @Author TIAN 
     * @Date 2020/7/31 9:31
     * @Return 
     * @Throws 
     */
    int insertRole(Role role);

    /**
     * 根据角色id查找角色
     * @param roleId
     * @return
     */
    Role findRoleById(@Param("roleId") long roleId);

    /**
     * 根据用户id查找该用户角色
     * @param userId
     * @return
     */
    Role findRoleByUserId(@Param("userId") long userId);
}
