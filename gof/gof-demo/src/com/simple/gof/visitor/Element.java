package com.simple.gof.visitor;
/**
 * ������Ԫ��
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public interface Element {
    public void accept(Visitor visitor);
}
