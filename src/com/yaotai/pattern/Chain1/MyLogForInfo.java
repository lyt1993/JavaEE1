package com.yaotai.pattern.Chain1;

public class MyLogForInfo implements MyLog {
    @Override
    public void println(String level,String msg) {
        if (level.equals("info")) {
            System.out.println("=========Info"+msg);
        }
    }
}
