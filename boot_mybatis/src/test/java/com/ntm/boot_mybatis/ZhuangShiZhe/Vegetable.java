package com.ntm.boot_mybatis.ZhuangShiZhe;

//蔬菜类
public class Vegetable extends Food {
    private Food food;

    public Vegetable() {
    }

    public Vegetable(Food food) {
        this.food = food;
    }

    public String make() {
        return food.make() + "蔬菜";
    }
}
