package com.simple.gof.singleton;

/**
 * 懒汉+线程安全+静态内部类
 * </p>
 * 利用classloader机制，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder类，从而实例化 instance
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class InnerClassLazySingleton {
    private static class SingletonHolder {
	private static final InnerClassLazySingleton INSTANCE = new InnerClassLazySingleton();
    }

    private InnerClassLazySingleton() {
    }

    public static final InnerClassLazySingleton getInstance() {
	return SingletonHolder.INSTANCE;
    }
}
