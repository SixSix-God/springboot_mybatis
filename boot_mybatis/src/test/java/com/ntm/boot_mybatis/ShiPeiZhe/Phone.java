package com.ntm.boot_mybatis.ShiPeiZhe;

public class Phone {
    public static final int v = 220;
    private VoltageAdapter voltageAdapter;

    public void charge() {
        voltageAdapter.changeVoltage();
    }

    public void setAdapter(VoltageAdapter voltageAdapter) {
        this.voltageAdapter = voltageAdapter;
    }
}
