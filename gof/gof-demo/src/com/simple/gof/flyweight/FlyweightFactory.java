package com.simple.gof.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ����
 * </p>
 * ��Ҫ�����̰߳�ȫ����
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    /**
     * ��ȡ��Ԫ����
     * 
     * @param extrinsic �ⲿ״̬
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
	Flyweight flyweight = null;
	if (pool.containsKey(extrinsic)) {
	    flyweight = pool.get(extrinsic);
	} else {
	    // ʵ��Ӧ����Ҫ�����ⲿ״̬��������Ӧ��ʵ������
	    flyweight = new Flyweight() {
	    };
	    pool.put(extrinsic, flyweight);
	}
	return flyweight;
    }
}
