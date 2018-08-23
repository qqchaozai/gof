package com.simple.gof.decorator;

/**
 * 抽象装饰者实现被装饰接口
 * 
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
	this.component = component;
    }

    @Override
    public void doSomething() {
	component.doSomething();
	//添加装饰行为
	this.doDecorate();
    }
    /**
     * 装饰行为，可以选择集成在doSomething被装饰行为之中，也可以配合模板模型使用
     */
    public abstract void doDecorate();
}
