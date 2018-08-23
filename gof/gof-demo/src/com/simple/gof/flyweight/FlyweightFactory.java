package com.simple.gof.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * </p>
 * 需要考虑线程安全问题
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    /**
     * 获取享元对象
     * 
     * @param extrinsic 外部状态
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
	Flyweight flyweight = null;
	if (pool.containsKey(extrinsic)) {
	    flyweight = pool.get(extrinsic);
	} else {
	    // 实际应用需要根据外部状态来创建对应的实例对象
	    flyweight = new Flyweight() {
	    };
	    pool.put(extrinsic, flyweight);
	}
	return flyweight;
    }
}
