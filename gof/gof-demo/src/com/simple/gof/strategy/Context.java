package com.simple.gof.strategy;
/**
 * 执行上下文
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Context {
    /**
     * 策略对象
     */
    private Strategy strategy;
    /**
     * 调整策略对象
     * @param strategy
     */
    public void setStrategy(Strategy strategy){
	this.strategy = strategy;
    }
    /**
     * 将策略方法封装
     * 可以在运行时调整策略对象，来达到执行不同策略方法的目的
     */
    public void doSomething(){
	strategy.doSomething();
    }
}
