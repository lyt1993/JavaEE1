package com.yaotai.pattern.Chain1;

public class MyLogForDebug implements MyLog {
    @Override
    public void println(String level,String msg) {
        if (level.equals("debug")) {
            System.out.println("=========debug"+msg);
        }
    }
}
