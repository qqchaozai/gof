package com.simple.gof.factory;

import com.simple.gof.factory.product.IProductExt;
import com.simple.gof.factory.product.IProduct;
/**
 * ����product�������һϵ�в�Ʒ�壨A��
 * @author chaozai
 * @date 2018��8��20��
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
