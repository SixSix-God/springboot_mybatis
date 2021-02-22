package com.ntm.boot_mybatis.TestDemo;

import com.ntm.boot_mybatis.DesignPatterns.Citation;
import com.ntm.boot_mybatis.DesignPatterns.SunWuKong;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class PrototypeTest {

    //用原型模式模拟照片复制自己。
    public static void main(String[] args) throws CloneNotSupportedException {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        contentPane.add(obj1);
        SunWuKong obj2 = (SunWuKong) obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //用原型模式生成“三好学生”奖状
    @Test
    public void Test1() throws CloneNotSupportedException {
        Citation citation1 =
                new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "华夏学院");
        citation1.display();
        Citation citation2 = (Citation) citation1.clone();
        citation2.setName("李四");
        citation2.display();

    }
}
