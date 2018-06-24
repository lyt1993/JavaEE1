package com.yaotai.pattern.Builder1.bean11;

import com.yaotai.pattern.Builder1.abstract1.Burge;

public class ChickenBurger extends Burge {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
