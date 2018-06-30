package com.yaotai.pattern.Template1;
/**
 * 模板方法模式：
 *
 * 抽象模板(Abstract Template)角色有如下责任：
 *
 * 　　■　　定义了一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个组成步骤。
 *
 * 　　■　　定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出了一个顶级骨架的逻辑实现方式，顶级逻辑也有可能调用一些具体方法。
 *
 * 具体模板(Concrete Template)角色又如下责任：
 *
 * 　　■　　实现父类所定义的一个或多个抽象方法，它们是一个组成步骤。
 *
 * 　　■　　实现父类抽象方法，定制化自己个性。
 *
 * 注意：关键在于抽象类的模板方法，定义整个对象构建的方式
 */
public class Main1 {

    public static void main(String[] args) {
        Game game = new CatGame();
        game.templateMethod();


        Game game1 = new DogGame();
        game1.templateMethod();
    }

}
