package com.yaotai.pattern.Decorator1;

/**
 * 装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 */
public class ChangeForDecoration implements ShenXian {

    private ShenXian shenXian;

    public ChangeForDecoration(ShenXian shenXian) {
        this.shenXian = shenXian;
    }

    @Override
    public void live() {
        shenXian.live();
    }
}
