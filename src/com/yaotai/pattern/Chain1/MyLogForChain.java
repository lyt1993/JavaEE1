package com.yaotai.pattern.Chain1;

import java.util.ArrayList;
import java.util.List;

public class MyLogForChain implements MyLog {

    List<MyLog> chain = new ArrayList<>();

    public MyLogForChain() {
        chain.add(new MyLogForDebug());
        chain.add(new MyLogForInfo());
        chain.add(new MyLogForError());
    }

    @Override
    public void println(String level,String msg) {
        for (int i = 0; i < chain.size(); i++) {
            MyLog myLog = chain.get(i);
            myLog.println(level,msg);
        }
    }
}
