package com.simple.gof.visitor;
/**
 * 被访问元素
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public interface Element {
    public void accept(Visitor visitor);
}
