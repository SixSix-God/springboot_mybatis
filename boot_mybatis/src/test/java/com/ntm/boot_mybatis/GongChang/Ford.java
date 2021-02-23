package com.ntm.boot_mybatis.GongChang;

public class Ford implements Car {
    @Override
    public void run() {
        System.out.println("Ford启动了！");
    }

    @Override
    public void stop() {
        System.out.println("Ford停止了！");
    }
}
