package com.ntm.boot_mybatis.entity;


import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable {

    public Integer id;
    @JsonAlias(value = {"name", "Name"})
    public String countryName;
    @JsonAlias(value = {"code", "Code"})
    public String countryCode;

    public Country(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }
//
//    public Country(Integer id, String countryName, String countryCode) {
//        this.id = id;
//        this.countryName = countryName;
//        this.countryCode = countryCode;
//    }
//
//    public Country() {
//    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCountryName() {
//        return countryName;
//    }
//
//    public void setCountryName(String countryName) {
//        this.countryName = countryName;
//    }
//
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    @Override
//    public String toString() {
//        return "Country{" +
//                "id=" + id +
//                ", countryName='" + countryName + '\'' +
//                ", countryCode='" + countryCode + '\'' +
//                '}';
//    }
}
