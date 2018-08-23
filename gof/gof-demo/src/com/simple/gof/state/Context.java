package com.simple.gof.state;
/**
 * ���л���
 * @author chaozai
 * @date 2018��8��22��
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
     * �ɵ�ǰ״̬�������ִ�з���
     */
    public void doSomething(){
	state.doSomething();
    }
}
