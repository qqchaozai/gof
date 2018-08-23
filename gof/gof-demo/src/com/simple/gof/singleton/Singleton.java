package com.simple.gof.singleton;

/**
 * ����+�̰߳�ȫ
 * </p>
 * �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
 * </p>
 * ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
 * </p>
 * 
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class Singleton {
    // ���� Singleton ��һ������
    private static Singleton instance = new Singleton();

    // �ù��캯��Ϊ private����������Ͳ��ᱻʵ����
    private Singleton() {
    }

    // ��ȡΨһ���õĶ���
    public static Singleton getInstance() {
	return instance;
    }

    public void showMessage() {
	System.out.println("Hello World!");
    }
}
