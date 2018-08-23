package com.simple.gof.command;

/**
 * 命令对象：接收者和调用者的纽带
 * 
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Command {
    /**
     * 可以是包含多个责任链的执行者
     */
    Receiver receiver;

    public Command(Receiver receiver) {
	this.receiver = receiver;
    }
    /**
     * 可以是一系列模板操作
     */
    public void execute() {
	receiver.executeCommand();
    }
}
