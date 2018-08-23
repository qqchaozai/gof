package com.simple.gof.singleton;

/**
 * 懒汉+线程安全
 * </p>
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class LazySafeSingleton {
    private volatile static LazySafeSingleton singleton;

    private LazySafeSingleton() {
    }

    public static LazySafeSingleton getSingleton() {
	if (singleton == null) {
	    synchronized (LazySafeSingleton.class) {
		if (singleton == null) {
		    singleton = new LazySafeSingleton();
		}
	    }
	}
	return singleton;
    }
}
