package com.yaotai.pattern.Factory1;

/**
 *      抽象工厂模式:
 *
 * 围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * FactoryProducer:超级工厂，这里使用了简单工厂模式创建。
 *
 */

public class Main1 {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();
        System.out.println("==========分隔符=================");

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory("SHAPE");
        Shape rectangle = shapeFactory.getShape("RECTANGle");
        rectangle.draw();
        AbstractFactory colorFactory1 = FactoryProducer.getFactory("COLOR");
        Color green = colorFactory.getColor("GREEN");
        green.fill();
    }
}
