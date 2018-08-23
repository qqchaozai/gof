package com.simple.gof.command;

/**
 * ������󣺽����ߺ͵����ߵ�Ŧ��
 * 
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class Command {
    /**
     * �����ǰ��������������ִ����
     */
    Receiver receiver;

    public Command(Receiver receiver) {
	this.receiver = receiver;
    }
    /**
     * ������һϵ��ģ�����
     */
    public void execute() {
	receiver.executeCommand();
    }
}
