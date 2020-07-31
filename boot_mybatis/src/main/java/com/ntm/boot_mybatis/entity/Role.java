package com.ntm.boot_mybatis.entity;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Role {
    private Long id;
    private String roleName;
    private String roleType;
}
