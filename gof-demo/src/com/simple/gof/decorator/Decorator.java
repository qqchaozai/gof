package com.simple.gof.decorator;

/**
 * ����װ����ʵ�ֱ�װ�νӿ�
 * 
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
	this.component = component;
    }

    @Override
    public void doSomething() {
	component.doSomething();
	//���װ����Ϊ
	this.doDecorate();
    }
    /**
     * װ����Ϊ������ѡ�񼯳���doSomething��װ����Ϊ֮�У�Ҳ�������ģ��ģ��ʹ��
     */
    public abstract void doDecorate();
}
