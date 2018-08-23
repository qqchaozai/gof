package com.simple.gof.factory;

import com.simple.gof.factory.product.IProductExt;
import com.simple.gof.factory.product.IProduct;
/**
 * 抽象工厂类，由子工厂类决定产生产品方式
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public abstract class AbstractFactory {
    
    abstract IProduct getProduct(String type);
    abstract IProductExt getProductExt(String type);
    
}
