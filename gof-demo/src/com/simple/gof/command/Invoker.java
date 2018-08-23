package com.simple.gof.command;

/**
 * ����ĵ�����
 * 
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class Invoker {
    /**
     * ������һ������ϣ��ܹ������������������
     */
    private Command command;

    public void setCommand(Command command) {
	this.command = command;
    }

    public void action() {
	this.command.execute();
    }
}
