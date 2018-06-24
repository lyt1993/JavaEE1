package com.yaotai.pattern.Builder1.bean12;

import com.yaotai.pattern.Builder1.abstract1.Drink;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.1f;
    }
}
