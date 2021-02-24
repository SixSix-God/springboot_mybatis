package com.ntm.boot_mybatis.GuanChaZhe;

import java.util.ArrayList;
import java.util.List;

public class XiaoMei {
    List<Person> list = new ArrayList<Person>();

    public XiaoMei() {
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public void notifyPerson() {
        for (Person person : list) {
            person.getMessage("测试信息。。。。。。");
        }
    }
}
