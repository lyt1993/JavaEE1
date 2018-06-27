package com.yaotai.pattern.Template1;

public class DogGame extends Game {
    @Override
    protected void hookMethod() {
        System.out.println("这是遛狗游戏，使用默认开始方式");
    }
}
