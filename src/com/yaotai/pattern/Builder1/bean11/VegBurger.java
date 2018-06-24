package com.yaotai.pattern.Builder1.bean11;

import com.yaotai.pattern.Builder1.abstract1.Burge;

public class VegBurger  extends Burge {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
