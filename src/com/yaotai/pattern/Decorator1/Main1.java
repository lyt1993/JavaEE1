package com.yaotai.pattern.Decorator1;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构
 * 　●　　抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 *
 * 　●　　具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 *
 * 　●　　装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 *
 * 　●　　具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public class Main1 {

    public static void main(String[] args) {
        ShenXian sunwukong = new SunWuKong();
        sunwukong.live();
        SunWuKongForBird sunWuKongForBird = new SunWuKongForBird(sunwukong);//给悟空装饰了飞的能力
        sunWuKongForBird.fly();

        SunWuKongForFish sunWuKongForFish = new SunWuKongForFish(sunWuKongForBird);//给悟空装饰了游泳的能力
        sunWuKongForFish.swimming();

    }
}
