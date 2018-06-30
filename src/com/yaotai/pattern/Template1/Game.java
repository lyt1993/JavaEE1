package com.yaotai.pattern.Template1;

public abstract class Game {

    /**
     * 模板方法
     */
    public void templateMethod(){
        start();
        hookMethod();
        end();
    }

    /**
     * 基本方法的声明（由子类实现）
     */
    protected  void start(){
        System.out.println("游戏开始！准备使用默认开始方式");
    };

    /**
     * 基本方法(空方法)
     */
    protected abstract void hookMethod();

    /**
     * 基本方法（已经实现）
     */
    private final void end(){
        System.out.println("游戏结束！");
    }


}
