package com.simple.gof.interpreter;
/**
 * ������
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class Interpreter {
    
    private String rule;
    /**
     * 
     * @param rule ���͹���
     */
    public Interpreter(String rule) {
	this.rule = rule;
    }
    /**
     * ���ͷ���
     * @param data ����������
     * @return
     */
    public boolean interpret(String data){
	if(data.contains(rule)){
	    return true;
	}
	return false;
    }
}
