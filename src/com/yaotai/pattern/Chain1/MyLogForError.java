package com.yaotai.pattern.Chain1;

public class MyLogForError implements MyLog {
    @Override
    public void println(String level,String msg) {
        if (level.equals("error")) {
            System.err.println("=========error"+msg);
        }
    }
}
