package com.simple.gof.observer;

import java.util.Observable;

/**
 * 被观察主题
 * 
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Subject extends Observable {

    private Object data = null;

    public Object getData() {
	return data;
    }

    /**
     * 更新数据
     * 
     * @param data
     */
    public void setData(Object data) {
	this.data = data;
	setChanged();
	notifyObservers();
    }
}
