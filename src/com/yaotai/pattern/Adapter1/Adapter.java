package com.yaotai.pattern.Adapter1;

public class Adapter extends MyUsb implements Ps2 {

    public Adapter() {
        System.out.println("我是适配器，我可以把东西转变成Usb接口");
    }

    @Override
    public void isPs2() {
       isUsb();
    }
}
