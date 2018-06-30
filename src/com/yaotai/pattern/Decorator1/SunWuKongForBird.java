package com.yaotai.pattern.Decorator1;

/**
 * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public class SunWuKongForBird extends ChangeForDecoration {

    public SunWuKongForBird(ShenXian shenXian) {
        super(shenXian);
    }

    /**
     * 装饰新功能：飞
     */

    public void fly(){
        System.out.println("齐天大圣变成了小鸟，拥有了飞的能力");
    }
}
