package com.simple.gof.singleton;

/**
 * 饿汉+线程安全
 * </p>
 * 优点：没有加锁，执行效率会提高。
 * </p>
 * 缺点：类加载时就初始化，浪费内存。
 * </p>
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class Singleton {
    // 创建 Singleton 的一个对象
    private static Singleton instance = new Singleton();

    // 让构造函数为 private，这样该类就不会被实例化
    private Singleton() {
    }

    // 获取唯一可用的对象
    public static Singleton getInstance() {
	return instance;
    }

    public void showMessage() {
	System.out.println("Hello World!");
    }
}
