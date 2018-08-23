package com.simple.gof.bridge;

/**
 * ���󻯽�ɫ
 * 
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
	this.implementor = implementor;
    }
    
    public abstract void doSomething();
}
