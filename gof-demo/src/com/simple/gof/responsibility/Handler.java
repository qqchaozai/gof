package com.simple.gof.responsibility;

/**
 * 责任链处理器
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public abstract class Handler {
    Handler nextHandler;

    public void setNext(Handler nextHandler) {
	this.nextHandler = nextHandler;
    }

    /**
     * 责任链传递任务核心代码，禁止子类修改该方法
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
     * 子类实现具体处理逻辑
     */
    protected abstract void doJob();

}
