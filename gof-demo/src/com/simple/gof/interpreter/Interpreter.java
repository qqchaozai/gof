package com.simple.gof.interpreter;
/**
 * 解释器
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class Interpreter {
    
    private String rule;
    /**
     * 
     * @param rule 解释规则
     */
    public Interpreter(String rule) {
	this.rule = rule;
    }
    /**
     * 解释方法
     * @param data 被解释内容
     * @return
     */
    public boolean interpret(String data){
	if(data.contains(rule)){
	    return true;
	}
	return false;
    }
}
