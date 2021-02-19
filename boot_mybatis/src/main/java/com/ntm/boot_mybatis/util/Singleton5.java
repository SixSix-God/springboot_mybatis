package com.ntm.boot_mybatis.util;

/**
 * 懒汉式(完美)
 * 1.声明一个静态内部类的对象声明
 * JVM保证线程安全
 */
public class Singleton5 {
    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return MySingleton5.singleton5;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton5.getInstance().hashCode());
            }).start();
        }
    }

    private static class MySingleton5 {
        private static final Singleton5 singleton5 = new Singleton5();
    }
}
