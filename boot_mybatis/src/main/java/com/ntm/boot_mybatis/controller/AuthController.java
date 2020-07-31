package com.ntm.boot_mybatis.controller;

import com.ntm.boot_mybatis.entity.ResponseUserToken;
import com.ntm.boot_mybatis.entity.Role;
import com.ntm.boot_mybatis.entity.User;
import com.ntm.boot_mybatis.entity.UserDetail;
import com.ntm.boot_mybatis.model.ResultCode;
import com.ntm.boot_mybatis.model.ResultJson;
import com.ntm.boot_mybatis.service.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@Api(description = "登陆注册及刷新token")
@RequestMapping("/api/v1")
public class AuthController {
    @Value("${jwt.header}")
    private String tokenHeader;

    private final AuthService authService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "/login")
    @ApiOperation(value = "登陆", notes = "登陆成功返回token,测试管理员账号:admin,123456;用户账号：les123,admin")
    public ResultJson<ResponseUserToken> login(
            @Valid @RequestBody User user){
        final ResponseUserToken response = authService.login(user.getName(), user.getPassword());
        return ResultJson.ok(response);
    }

    @GetMapping(value = "/logout")
    @ApiOperation(value = "登出", notes = "退出登陆")
    @ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")})
    public ResultJson logout(HttpServletRequest request){
        String token = request.getHeader(tokenHeader);
        if (token == null) {
            return ResultJson.failure(ResultCode.UNAUTHORIZED);
        }
        authService.logout(token);
        return ResultJson.ok();
    }

    @RequestMapping(value = "/user",method = {RequestMethod.POST,RequestMethod.GET})
    @ApiOperation(value = "根据token获取用户信息", notes = "根据token获取用户信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")})
    public ResultJson getUser(HttpServletRequest request){
        String token = request.getHeader(tokenHeader);
        if (token == null) {
            return ResultJson.failure(ResultCode.UNAUTHORIZED);
        }
        UserDetail userDetail = authService.getUserByToken(token);
        logger.info("userDetail:" + userDetail);
        return ResultJson.ok(userDetail);
    }
    @PostMapping(value = "/sign")
    @ApiOperation(value = "用户注册")
    public ResultJson sign(@RequestBody User user) {
        if (StringUtils.isAnyBlank(user.getName(), user.getPassword())) {
            return ResultJson.failure(ResultCode.BAD_REQUEST);
        }
        UserDetail userDetail = new UserDetail(user.getName(), user.getPassword(), Role.builder().id(1L).roleType(user.getRoleType()).roleName(user.getName()).build());
        Object data = authService.register(userDetail);
        return ResultJson.ok(data);
    }
    @GetMapping(value = "refresh")
    @ApiOperation(value = "刷新token")
    public ResultJson refreshAndGetAuthenticationToken(
            HttpServletRequest request){
        String token = request.getHeader(tokenHeader);
        ResponseUserToken response = authService.refresh(token);
        System.out.println("response:" + response);
        if(response == null) {
            return ResultJson.failure(ResultCode.BAD_REQUEST, "token无效");
        } else {
            return ResultJson.ok(response);
        }
    }


    @GetMapping(value = "/current")
    public ResultJson current(){

        return  ResultJson.ok("success");
    }
}
