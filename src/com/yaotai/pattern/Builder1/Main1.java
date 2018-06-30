package com.yaotai.pattern.Builder1;

import com.yaotai.pattern.Builder1.Meal;
import com.yaotai.pattern.Builder1.MealBuilder;

/**
 * 建造者模式
 * 1.抽象建造者角色（Builder）
 * 2.建造实现类（ConcreteBuilder）
 * 3.导演者角色（Director），负责建造过程和算法
 * 4.产品角色（Product）
 *
 * 1. 一个部分是Builder接口，这里是定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
 *
 * 2. 另外一个部分是Director，Director是知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。
 *
 * 不管如何变化，建造模式都存在这么两个部分，一个部分是部件构造和产品装配，另一个部分是整体构建的算法。认识这点是很重要的，因为在建造模式中，强调的是固定整体构建的算法，而灵活扩展和切换部件的具体构造和产品装配的方式。
 * */
public class Main1 {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
