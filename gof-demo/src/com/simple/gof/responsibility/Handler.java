package com.simple.gof.responsibility;

/**
 * ������������
 * 
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public abstract class Handler {
    Handler nextHandler;

    public void setNext(Handler nextHandler) {
	this.nextHandler = nextHandler;
    }

    /**
     * ����������������Ĵ��룬��ֹ�����޸ĸ÷���
     * 
     * @param request
     */
    public final void handleRequest(Object request) {
	this.doJob();
	if (nextHandler != null) {
	    nextHandler.handleRequest(request);
	}
    }

    /**
     * ����ʵ�־��崦���߼�
     */
    protected abstract void doJob();

}
