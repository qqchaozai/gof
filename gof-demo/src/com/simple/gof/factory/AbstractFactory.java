package com.simple.gof.factory;

import com.simple.gof.factory.product.IProductExt;
import com.simple.gof.factory.product.IProduct;
/**
 * ���󹤳��࣬���ӹ��������������Ʒ��ʽ
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public abstract class AbstractFactory {
    
    abstract IProduct getProduct(String type);
    abstract IProductExt getProductExt(String type);
    
}
