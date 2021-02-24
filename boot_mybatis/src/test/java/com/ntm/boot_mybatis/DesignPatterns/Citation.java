package com.ntm.boot_mybatis.DesignPatterns;

public class Citation implements Cloneable {
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + info + college);
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状复制成功！");
        return (Citation) super.clone();
    }

}
