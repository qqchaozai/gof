package com.simple.gof.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.simple.gof.proxy.RealSubject;
import com.simple.gof.proxy.Subject;

/**
 * 动态代理
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 * @param <T>
 *            代理对象
 */
public class DynamicProxy<T> implements InvocationHandler {

    T subject;

    public DynamicProxy(T subject) {
	this.subject = subject;
    }

    /**
     * proxy:动态代理对象,属于被代理对象 method：执行的方法 args：调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	System.out.println("start execute method: " + method.getName());
	Object result = method.invoke(subject, args);
	System.out.println("end");
	return result;
    }

    public static void main(String[] args) {
	//被代理对象
	Subject subject = new RealSubject();
	InvocationHandler invocationHandler = new DynamicProxy<Subject>(subject);
	//代理对象
	Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
		new Class<?>[] { Subject.class }, invocationHandler);
	// true==getClass().getName() + '@' + Integer.toHexString(hashCode())
	System.out.println("subject.toString().equals(proxy.toString()): "
		+subject.toString().equals(proxy.toString()));
	System.out.println("subject.equals(proxy): "+subject.equals(proxy));// false
	proxy.doSomething();
    }

}
