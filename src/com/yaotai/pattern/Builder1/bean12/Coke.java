package com.yaotai.pattern.Builder1.bean12;

import com.yaotai.pattern.Builder1.abstract1.Drink;

public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
