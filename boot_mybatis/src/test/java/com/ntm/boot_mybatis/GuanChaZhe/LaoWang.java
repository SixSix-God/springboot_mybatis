package com.ntm.boot_mybatis.GuanChaZhe;

public class LaoWang implements Person {
    private String name = "老王";

    public LaoWang() {
    }

    ;

    @Override
    public void getMessage(String message) {
        System.out.println(name + "接到了信息==>" + message);
    }
}
