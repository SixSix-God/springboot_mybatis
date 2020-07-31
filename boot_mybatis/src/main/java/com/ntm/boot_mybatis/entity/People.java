package com.ntm.boot_mybatis.entity;

/**
 * @ClassName People
 * @Author Tian
 * @Date 2020/7/24 10:29
 * @Description TODO
 * @Version 1.0
 */
public class People {
    private Integer CountryId;
    private String Peoname;
    private String Peonum;

    public People(Integer countryId, String peoname, String peonum) {
        CountryId = countryId;
        Peoname = peoname;
        Peonum = peonum;
    }

    public People() {
    }

    public Integer getCountryId() {
        return CountryId;
    }

    public void setCountryId(Integer countryId) {
        CountryId = countryId;
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
