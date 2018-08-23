package com.simple.gof.template;
/**
 * ģ�������
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public abstract class Template {
    abstract void start();
    abstract void end();
    abstract void doSomething();
    /**
     * ģ�巽�����ɸ���
     */
    public final void execute(){
	start();
	doSomething();
	end();
    }
}
