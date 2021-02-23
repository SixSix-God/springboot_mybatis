package com.ntm.boot_mybatis.ZhuangShiZhe;

//面包类
public class Bread extends Food {
    private Food food;

    public Bread(Food food) {
        this.food = food;
    }

    public String make() {
        return food.make() + "面包";
    }
}
