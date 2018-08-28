package com.simple.gof.observer;


import java.util.Observable;
import java.util.Observer;
/**
 * 观察者
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class RealObserver implements Observer {
    /**
     * 可用于主动检查主题更新
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
