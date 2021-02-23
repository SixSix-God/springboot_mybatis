package com.ntm.boot_mybatis.ChouXiangGongChang;

import org.junit.platform.commons.util.StringUtils;

import java.util.logging.Logger;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String type) {
        if (StringUtils.isBlank(type)) {
            Logger.getLogger("参数错误！");
        }
        if ("Red".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("Blue".equalsIgnoreCase(type)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
