package com.ntm.boot_mybatis.GongChang;

public class Benz implements Car {
    @Override
    public void run() {
        System.out.println("Benz启动了！");
    }

    @Override
    public void stop() {
        System.out.println("Benz停止了！");
    }
}
