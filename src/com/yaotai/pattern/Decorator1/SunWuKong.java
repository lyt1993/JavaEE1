package com.yaotai.pattern.Decorator1;

/**
 * 被装饰的对象(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 */
public class SunWuKong implements ShenXian {
    @Override
    public void live() {
        System.out.println("齐天大圣，寿与天齐！");
    }
}
