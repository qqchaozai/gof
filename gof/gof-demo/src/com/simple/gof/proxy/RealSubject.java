package com.simple.gof.proxy;
/**
 * ���壨����������
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
	System.out.println("real subject do something");
    }

}
