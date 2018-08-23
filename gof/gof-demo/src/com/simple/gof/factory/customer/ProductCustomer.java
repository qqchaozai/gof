package com.simple.gof.factory.customer;

import com.simple.gof.factory.AbstractFactory;

/**
 * ��Ʒ������(���󹤳�˼�����)
 * </p>
 * ͨ����ϳ��󹤳�����������ʹ�ó��󹤳���������Ӧ��Ʒ��
 * 
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public abstract class ProductCustomer {
    /**
     * ���󹤳�
     */
    AbstractFactory factory;
    
    public ProductCustomer(AbstractFactory factory) {
	this.factory = factory;
    }

    /**
     * ����ͨ��factoryʹ�ö�Ӧ��Ʒ��
     */
    abstract void doSomethingWithFactory();
}
