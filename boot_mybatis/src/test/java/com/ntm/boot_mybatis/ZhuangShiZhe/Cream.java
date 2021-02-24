package com.ntm.boot_mybatis.ZhuangShiZhe;

//奶油类
public class Cream extends Food {
    private Food food;

    public Cream() {
    }

    public Cream(Food food) {
        this.food = food;
    }

    public String make() {
        return food.make() + "奶油";
    }
}
