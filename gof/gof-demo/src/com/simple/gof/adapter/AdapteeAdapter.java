package com.simple.gof.adapter;

/**
 * 通过组合被适配对象并实现目标对象接口，来实现适配功能
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class AdapteeAdapter implements Target {

    Adaptee adaptee;

    public AdapteeAdapter(Adaptee adaptee) {
	this.adaptee = adaptee;
    }

    /**
     * 根据log的类型
     */
    @Override
    public void save(String type, String log) {
	if ("json".equals(type)) {
	    adaptee.saveLogWithJson(log);
	} else if ("xml".equals(type)) {
	    adaptee.saveLogWithXml(log);
	}
    }

}
