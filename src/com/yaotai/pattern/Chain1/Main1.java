package com.yaotai.pattern.Chain1;

/**
 * 责任链模式：
 *
 * ●　　抽象处理者(Handler)角色：定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。这个角色通常由一个Java抽象类或者Java接口实现。
 * ●　　具体处理者(ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家,这种形式
 *       往往是递归形式的责任链模式，
 * ●    这个例子是循环模式
 */
public class Main1 {

    public static void main(String[] args) {
        MyLog myLog = new MyLogForChain();
        myLog.println("info","这是info级别的日志");
        myLog.println("error","这是error级别的日志");
        myLog.println("debug","这是debug级别的日志");
    }
}
