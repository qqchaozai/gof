package com.simple.gof.strategy;
/**
 * ִ��������
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class Context {
    /**
     * ���Զ���
     */
    private Strategy strategy;
    /**
     * �������Զ���
     * @param strategy
     */
    public void setStrategy(Strategy strategy){
	this.strategy = strategy;
    }
    /**
     * �����Է�����װ
     * ����������ʱ�������Զ������ﵽִ�в�ͬ���Է�����Ŀ��
     */
    public void doSomething(){
	strategy.doSomething();
    }
}
