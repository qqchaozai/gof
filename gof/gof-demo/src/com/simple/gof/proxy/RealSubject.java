package com.simple.gof.proxy;
/**
 * 具体（被代理）主题
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
	System.out.println("real subject do something");
    }

}
