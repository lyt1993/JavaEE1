package com.yaotai.pattern.Adapter1;

/**
 *      适配器模式:
 *
 *●　　目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类，原理：通过继承来实现适配器功能
 *
 *●　　源(Adapee)角色：现在需要适配的接口。
 *
 *●　　适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 *
 *
 *      个人理解：是作为两个不兼容的接口之间的桥梁，可能已经其中一个有实现类，另一个接口希望用这个实现，可是两个接口方法名不一致，于是就有适配器
 */
public class Main1 {

    public static void main(String[] args) {
        Ps2 myPs2 = new Adapter();
        myPs2.isPs2();
    }
}
