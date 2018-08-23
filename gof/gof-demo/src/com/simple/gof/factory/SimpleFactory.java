package com.simple.gof.factory;

import com.simple.gof.factory.product.IProduct;
import com.simple.gof.factory.product.ProductA;
import com.simple.gof.factory.product.ProductB;
/**
 * 简单工厂:在工厂类中通过不同类型产生不同对象
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class SimpleFactory {
    /**
     * 
     * @param type
     * @return
     */
    public IProduct getProduct(String type){
	if("A".equals(type)){
	    return new ProductA();
	}else if("B".equals(type)){
	    return new ProductB();
	}
	return null;
    } 
    /**
     * 
     * @param type
     * @return
     */
    public <T extends IProduct> T getProduct(Class type) {
	IProduct product = null;
	try {
	    product = (IProduct) Class.forName(type.getName()).newInstance();
	} catch (Exception e) {
	}
	return (T) product;
    }
}
