package com.simple.gof.proxy;

/**
 * 代理主题
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy() {
    }

    @Override
    public void doSomething() {
	if (subject == null) {
	    subject = new RealSubject();
	}
	subject.doSomething();
    }

}
