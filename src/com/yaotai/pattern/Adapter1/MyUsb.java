package com.yaotai.pattern.Adapter1;

public class MyUsb implements Usb {
    @Override
    public void isUsb() {
        System.out.println("isUsb");
    }
}
