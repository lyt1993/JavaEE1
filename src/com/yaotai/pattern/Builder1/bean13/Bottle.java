package com.yaotai.pattern.Builder1.bean13;

import com.yaotai.pattern.Builder1.interface1.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
