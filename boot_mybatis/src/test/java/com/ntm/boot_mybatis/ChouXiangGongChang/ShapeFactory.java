package com.ntm.boot_mybatis.ChouXiangGongChang;

import org.apache.log4j.Logger;
import org.junit.platform.commons.util.StringUtils;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) throws Exception {
        if (StringUtils.isBlank(type)) {
            throw new RuntimeException("参数错误");
        }
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        }
        return null;
    }
}
