package com.simple.gof.factory.customer;

import com.simple.gof.factory.AbstractFactory;

/**
 * 产品消费者(抽象工厂思想核心)
 * </p>
 * 通过组合抽象工厂，在子类中使用抽象工厂来产生对应产品族
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public abstract class ProductCustomer {
    /**
     * 抽象工厂
     */
    AbstractFactory factory;
    
    public ProductCustomer(AbstractFactory factory) {
	this.factory = factory;
    }

    /**
     * 子类通过factory使用对应产品族
     */
    abstract void doSomethingWithFactory();
}
