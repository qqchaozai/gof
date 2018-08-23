package com.simple.gof.template;
/**
 * 模板抽象类
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public abstract class Template {
    abstract void start();
    abstract void end();
    abstract void doSomething();
    /**
     * 模板方法不可覆盖
     */
    public final void execute(){
	start();
	doSomething();
	end();
    }
}
