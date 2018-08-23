package com.simple.gof.bridge;

/**
 * 抽象化角色
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
	this.implementor = implementor;
    }
    
    public abstract void doSomething();
}
