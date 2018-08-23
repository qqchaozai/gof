package com.simple.gof.visitor;
/**
 * ��������
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class RealElement implements Element{

    @Override
    public void accept(Visitor visitor) {
	visitor.visit(this);
    }

}
