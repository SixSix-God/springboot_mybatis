package com.ntm.boot_mybatis.TestDemo;

import com.ntm.boot_mybatis.DesignPatterns.Citation;
import com.ntm.boot_mybatis.DesignPatterns.SunWuKong;
import com.sun.org.apache.xpath.internal.operations.Bool;
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

    @Test
    public void Test2() {
        int[][] materil = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean p = isTuoPuLiCe(materil);
        System.out.println(p);
    }

    //托普利策矩阵
    public boolean isTuoPuLiCe(int[][] materil) {
        int m = materil.length;
        int n = materil[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (materil[i][j] != materil[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    //自动拆装箱 Integer范围（-128~127）
    @Test
    public void testInt() {
        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1 == i2);//false

        Integer i3 = 123;
        System.out.println(i2 == i3);//false
        Integer i4 = 123;
        System.out.println(i3 == i4);//true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);//false

        int i7 = 128;
        System.out.println(i6 == i7);//true
    }
}
