package com.simple.gof.observer;


import java.util.Observable;
import java.util.Observer;
/**
 * �۲���
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class RealObserver implements Observer {
    /**
     * ��������������������
     */
    Observable observable;
    Object data;

    public RealObserver(Observable observable) {
	this.observable = observable;
	observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
	if (observable instanceof Subject) {
	    Subject subject = (Subject) observable;
	    data = subject.getData();
	}
    }
}
