package com.ntm.boot_mybatis.JianZaoZhe;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
