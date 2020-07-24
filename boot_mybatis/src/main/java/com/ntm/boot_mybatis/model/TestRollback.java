package com.ntm.boot_mybatis.model;


import java.io.Serializable;

/**
 * @ClassName TestRollback
 * @Author Tian
 * @Date 2020/7/24 13:32
 * @Description TODO
 * @Version 1.0
 */
public class TestRollback implements Serializable {
    public Integer Id;
    public String Name;
    public String Code;
    public String Peoname;
    public String Peonum;

    public TestRollback() {
    }

    public TestRollback(Integer id, String name, String code, String peoname, String peonum) {
        Id = id;
        Name = name;
        Code = code;
        Peoname = peoname;
        Peonum = peonum;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getPeoname() {
        return Peoname;
    }

    public void setPeoname(String peoname) {
        Peoname = peoname;
    }

    public String getPeonum() {
        return Peonum;
    }

    public void setPeonum(String peonum) {
        Peonum = peonum;
    }
}
