package com.ntm.boot_mybatis.util;

/**
 * 懒汉式
 * 1.声明实例,但是不初始化
 * 2.在构造方法私有化
 * 3.在调取getInstance进行对象返回的时候,判断对象是否为null,是否初始化完成
 * 3.1 初始化完成,既不为null,那就返回对象,否则进行对象的初始化
 * 缺点:  在多线程的访问中是有问题的 ---不安全
 */
public class Singleton2 {
    // 指向自己实例的私有静态引用
    private static Singleton2 singleton2 = null;

    // 私有的构造方法
    private Singleton2() {
    }

    // 以自己实例为返回值的静态的公有方法，静态工厂方法
    public static Singleton2 getInstance() {
        // 被动创建，在真正需要使用时才去创建
        if (singleton2 == null) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    //线程不安全
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            new Thread(() -> {
                System.out.println(singleton2.getInstance().hashCode());
            }).start();
        }

    }
}
