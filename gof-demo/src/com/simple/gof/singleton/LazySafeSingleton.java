package com.simple.gof.singleton;

/**
 * ����+�̰߳�ȫ
 * </p>
 * ���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * 
 * @author chaozai
 * @date 2018��8��20��
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
