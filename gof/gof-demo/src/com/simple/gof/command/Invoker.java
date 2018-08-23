package com.simple.gof.command;

/**
 * 命令的调用者
 * 
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Invoker {
    /**
     * 可以是一个命令集合，能够撤销，重做，清理等
     */
    private Command command;

    public void setCommand(Command command) {
	this.command = command;
    }

    public void action() {
	this.command.execute();
    }
}
