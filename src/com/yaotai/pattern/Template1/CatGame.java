package com.yaotai.pattern.Template1;

public class CatGame extends Game {

    @Override
    protected void start() {
        super.start();
        System.out.println("不使用默认方式");
    }

    @Override
    protected void hookMethod() {
        System.out.println("这是逗猫游戏，改变默认开始方式");
    }
}
