package com.ntm.boot_mybatis.util;

/**
 * 懒汉式  (较为完美)
 * 1.声明实例,但是不初始化
 * 2.在构造方法私有化
 * 3.在调取getInstance进行对象返回的时候,判断对象是否为null,是否初始化完成
 * 3.1 初始化完成,既不为null,那就返回对象,否则进行对象的初始化
 * 缺点:  在多线程的访问中是有问题的 ---不安全
 * <p>
 * 修改 01: 在方法内部加锁   加锁的同时,会影响程序的效率
 * 需要进行两次判空,一次判断在多线程的时候,容易造成多次声明对象
 */
public class Singleton4 {
    private static Singleton4 singleton4 = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                singleton4 = new Singleton4();
            }
        }
        return singleton4;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(singleton4.getInstance().hashCode());
            }).start();
        }
    }
}
