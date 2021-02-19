package com.ntm.boot_mybatis.util;

/**
 * 饿汉式(最常见)
 * 类加载到内存后,就实例化一个单例,JVM保证线程的安全
 * 1.将对象声明
 * 2.对象的构造方法设为私有属性,用户在使用的时候无法去声明创建对象
 * 3.写一个getInstance方法,去返回类中声明的唯一对象
 * 缺点:类加载的时候完成实例化
 */
public class Singleton1 {
    // 指向自己实例的私有静态引用，主动创建
    private static Singleton1 singleton1 = new Singleton1();

    //私有的构造方法
    private Singleton1() {
    }

    // 以自己实例为返回值的静态的公有方法，静态工厂方法
    public static Singleton1 getInstance() {
        return singleton1;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
