package com.simple.gof.factory;

import com.simple.gof.factory.product.IProductExt;
import com.simple.gof.factory.product.IProduct;
/**
 * 创建product相关联的一系列产品族（A）
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class ProductAFactory extends AbstractFactory{

    @Override
    IProduct getProduct(String type) {
	return null;
    }

    @Override
    IProductExt getProductExt(String type) {
	return null;
    }
    
}
