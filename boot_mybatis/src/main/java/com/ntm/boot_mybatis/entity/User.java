package com.ntm.boot_mybatis.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    @ApiModelProperty(value = "用户名", required = true)
    @Size(min=2, max=20)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    @Size(min=2, max=20)
    private String password;

    private String roleType;
}
