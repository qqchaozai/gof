package com.simple.gof.facade;

/**
 * 门面对象
 * </p>
 * 客户端直接沟通门面对象，无感知门面之内的对象
 * </p>
 * 区分于适配器：适配器存在三个对象（适配器，目标对象，被适配对象），客户端直接使用目标对象；而门面模式客户端直接使用门面
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class Facade {
    Component component;
    /**
     * 客户端无感知component子类存在，在内部构造
     */
    public Facade() {
	component = new Component() {
	    @Override
	    public void methodC() {
	    }

	    @Override
	    public void methodB() {
	    }

	    @Override
	    public void methodA() {
	    }
	};
    }
    /**
     * 对外部暴露方法，方法内组合复杂处理方式
     */
    public void method(){
	component.methodA();
	component.methodB();
	component.methodC();
    }
}
