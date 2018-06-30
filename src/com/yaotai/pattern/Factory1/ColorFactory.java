package com.yaotai.pattern.Factory1;

public class CircleFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
