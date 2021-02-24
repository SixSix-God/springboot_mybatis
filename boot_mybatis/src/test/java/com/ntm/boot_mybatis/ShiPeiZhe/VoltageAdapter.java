package com.ntm.boot_mybatis.ShiPeiZhe;

//变压器类
public class VoltageAdapter {
    //改变电压
    public void changeVoltage() {
        System.out.println("正在充电...");
        System.out.println("原始电压：" + Phone.v + "v");
        System.out.println("经过变压器处理后电压：" + (Phone.v - 200) + "v");
    }
}
