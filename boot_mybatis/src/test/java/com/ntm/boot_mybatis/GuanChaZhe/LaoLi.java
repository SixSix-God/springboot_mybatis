package com.ntm.boot_mybatis.GuanChaZhe;

public class LaoLi implements Person {
    private String name = "老李";

    public LaoLi() {
    }

    ;

    @Override
    public void getMessage(String message) {
        System.out.println(name + "接到了信息==>" + message);
    }
}
