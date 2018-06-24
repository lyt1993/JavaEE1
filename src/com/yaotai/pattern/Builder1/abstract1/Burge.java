package com.yaotai.pattern.Builder1.abstract1;

import com.yaotai.pattern.Builder1.bean13.Wrapper;
import com.yaotai.pattern.Builder1.interface1.Item;
import com.yaotai.pattern.Builder1.interface1.Packing;

public abstract class Burge implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }


}
