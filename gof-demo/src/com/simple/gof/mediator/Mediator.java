package com.simple.gof.mediator;
/**
 * �н���
 * @author chaozai
 * @date 2018��8��22��
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
     * A��B��������
     */
    void doSomethingWithAB(){}
}
