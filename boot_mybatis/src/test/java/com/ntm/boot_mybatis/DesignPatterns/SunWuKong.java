package com.ntm.boot_mybatis.DesignPatterns;

import javax.swing.*;

public class SunWuKong extends JPanel implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;

    public SunWuKong() {
        JLabel l1 = new JLabel(new ImageIcon("G:\\条形码.jpg"));
        this.add(l1);
    }

    public Object clone() {
        SunWuKong w = null;
        try {
            w = (SunWuKong) super.clone();
        } catch (Exception e) {
            System.out.println("拷贝失败！");
        }
        return w;
    }
}
