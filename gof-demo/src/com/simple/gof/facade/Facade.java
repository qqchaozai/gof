package com.simple.gof.facade;

/**
 * �������
 * </p>
 * �ͻ���ֱ�ӹ�ͨ��������޸�֪����֮�ڵĶ���
 * </p>
 * ����������������������������������������Ŀ����󣬱�������󣩣��ͻ���ֱ��ʹ��Ŀ����󣻶�����ģʽ�ͻ���ֱ��ʹ������
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public class Facade {
    Component component;
    /**
     * �ͻ����޸�֪component������ڣ����ڲ�����
     */
    public Facade() {
	component = new Component() {
	    @Override
	    public void methodC() {
	    }

	    @Override
	    public void methodB() {
	    }

	    @Override
	    public void methodA() {
	    }
	};
    }
    /**
     * ���ⲿ��¶��������������ϸ��Ӵ���ʽ
     */
    public void method(){
	component.methodA();
	component.methodB();
	component.methodC();
    }
}
