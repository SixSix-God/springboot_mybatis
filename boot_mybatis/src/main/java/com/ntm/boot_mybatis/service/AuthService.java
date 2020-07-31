package com.ntm.boot_mybatis.service;


import com.ntm.boot_mybatis.entity.ResponseUserToken;
import com.ntm.boot_mybatis.entity.UserDetail;

public interface AuthService {
    /**
     * 注册用户
     * @param userDetail
     * @return
     */
    Object register(UserDetail userDetail);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    ResponseUserToken login(String username, String password);


    /**
     * 刷新Token
     * @param oldToken
     * @return
     */
    ResponseUserToken refresh(String oldToken);


    /**
     * 登出
     * @param token
     */
    void logout(String token);


    /**
     * 根据Token获取用户信息
     * @param token
     * @return
     */
    UserDetail getUserByToken(String token);
}

