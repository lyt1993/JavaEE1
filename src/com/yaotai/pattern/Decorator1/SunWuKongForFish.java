package com.yaotai.pattern.Decorator1;

/**
 * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public class SunWuKongForFish extends ChangeForDecoration {

    public SunWuKongForFish(ShenXian shenXian) {
        super(shenXian);
    }

    /**
     * 装饰了新功能：游泳
     */
    public void swimming(){
        System.out.println("齐天大圣变成了鱼，学会了游泳！");
    }

}
