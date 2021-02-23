package com.ntm.boot_mybatis.ChouXiangGongChang;

public abstract class AbstractFactory {
    public abstract Color getColor(String type);

    public abstract Shape getShape(String type) throws Exception;

}
