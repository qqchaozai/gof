package com.simple.gof.observer;

import java.util.Observable;

/**
 * ���۲�����
 * 
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class Subject extends Observable {

    private Object data = null;

    public Object getData() {
	return data;
    }

    /**
     * ��������
     * 
     * @param data
     */
    public void setData(Object data) {
	this.data = data;
	setChanged();
	notifyObservers();
    }
}
