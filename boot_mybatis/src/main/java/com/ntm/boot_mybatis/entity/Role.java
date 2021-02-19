package com.ntm.boot_mybatis.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String roleName;
    /**
     *
     */
    private String roleType;
}