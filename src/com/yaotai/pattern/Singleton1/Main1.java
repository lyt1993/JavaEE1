package com.yaotai.pattern.Singleton1;

/**
 *       单例模式
 *       创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 */
public class Main1 {

    public static void main(String[] args) {
        LoadProperty loadProperty = LoadProperty.getInstance();
        LoadProperty loadProperty1 = LoadProperty.getInstance();
        LoadProperty loadProperty2 = LoadProperty.getInstance();
        LoadProperty loadProperty3 = LoadProperty.getInstance();
    }
}
