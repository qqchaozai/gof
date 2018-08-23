package com.simple.gof.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.simple.gof.proxy.RealSubject;
import com.simple.gof.proxy.Subject;

/**
 * ��̬����
 * 
 * @author chaozai
 * @date 2018��8��21��
 *
 * @param <T>
 *            �������
 */
public class DynamicProxy<T> implements InvocationHandler {

    T subject;

    public DynamicProxy(T subject) {
	this.subject = subject;
    }

    /**
     * proxy:��̬�������,���ڱ�������� method��ִ�еķ��� args������Ŀ�귽��ʱ�����ʵ��
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	System.out.println("start execute method: " + method.getName());
	Object result = method.invoke(subject, args);
	System.out.println("end");
	return result;
    }

    public static void main(String[] args) {
	//���������
	Subject subject = new RealSubject();
	InvocationHandler invocationHandler = new DynamicProxy<Subject>(subject);
	//�������
	Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
		new Class<?>[] { Subject.class }, invocationHandler);
	// true==getClass().getName() + '@' + Integer.toHexString(hashCode())
	System.out.println("subject.toString().equals(proxy.toString()): "
		+subject.toString().equals(proxy.toString()));
	System.out.println("subject.equals(proxy): "+subject.equals(proxy));// false
	proxy.doSomething();
    }

}
