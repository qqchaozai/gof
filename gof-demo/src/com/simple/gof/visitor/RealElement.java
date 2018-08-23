package com.simple.gof.visitor;
/**
 * 被访问者
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class RealElement implements Element{

    @Override
    public void accept(Visitor visitor) {
	visitor.visit(this);
    }

}
