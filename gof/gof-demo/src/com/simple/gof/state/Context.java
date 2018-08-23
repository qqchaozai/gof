package com.simple.gof.state;
/**
 * 运行环境
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Context {
    State state;

    public void start() {
	state = new StartState();
    }

    public void end(){
	state = new EndState();
    }
    /**
     * 由当前状态决定如何执行方法
     */
    public void doSomething(){
	state.doSomething();
    }
}
