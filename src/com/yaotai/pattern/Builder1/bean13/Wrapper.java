package com.yaotai.pattern.Builder1.bean13;

import com.yaotai.pattern.Builder1.interface1.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
