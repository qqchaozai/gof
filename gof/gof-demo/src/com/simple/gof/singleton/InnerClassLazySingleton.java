package com.simple.gof.singleton;

/**
 * ����+�̰߳�ȫ+��̬�ڲ���
 * </p>
 * ����classloader���ƣ�ֻ��ͨ����ʽ���� getInstance ����ʱ���Ż���ʽװ�� SingletonHolder�࣬�Ӷ�ʵ���� instance
 * 
 * @author chaozai
 * @date 2018��8��20��
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
