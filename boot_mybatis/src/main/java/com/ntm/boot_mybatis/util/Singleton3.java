package com.ntm.boot_mybatis.util;

/**
 * 懒汉式
 * 1.声明实例,但是不初始化
 * 2.在构造方法私有化
 * 3.在调取getInstance进行对象返回的时候,判断对象是否为null,是否初始化完成
 * 3.1 初始化完成,既不为null,那就返回对象,否则进行对象的初始化
 * 缺点:  在多线程的访问中是有问题的 ---不安全
 * <p>
 * 修改 01: 在方法上加锁   加锁的同时,会影响程序的效率
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            new Thread(() -> {
                System.out.println(singleton3.getInstance().hashCode());
            }).start();
        }
    }
}
