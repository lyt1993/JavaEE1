package com.yaotai.pattern.Factory1;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("生产正方形");
    }
}
