package com.yaotai.pattern.Builder1;

import com.yaotai.pattern.Builder1.bean11.ChickenBurger;
import com.yaotai.pattern.Builder1.bean11.VegBurger;
import com.yaotai.pattern.Builder1.bean12.Coke;
import com.yaotai.pattern.Builder1.bean12.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
