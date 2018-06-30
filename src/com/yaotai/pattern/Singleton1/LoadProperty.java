package com.yaotai.pattern.Singleton1;

public class LoadProperty {

    private static LoadProperty instance = null;

    private LoadProperty() {
        System.out.println("创建了一个实例");
    }


    public static LoadProperty getInstance() {
        if (instance == null) {
            synchronized (LoadProperty.class) {
                if (instance == null) {
                    instance = new LoadProperty();
                }
            }
        }
        return instance;
    }

}
