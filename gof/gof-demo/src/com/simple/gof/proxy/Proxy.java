package com.simple.gof.proxy;

/**
 * ��������
 * 
 * @author chaozai
 * @date 2018��8��21��
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
