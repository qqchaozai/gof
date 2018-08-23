package com.simple.gof.mediator;
/**
 * 中介者
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Mediator {
    Object a;
    Object b;
    public Object getA() {
        return a;
    }
    public void setA(Object a) {
        this.a = a;
    }
    public Object getB() {
        return b;
    }
    public void setB(Object b) {
        this.b = b;
    }
    /**
     * A与B交互方法
     */
    void doSomethingWithAB(){}
}
