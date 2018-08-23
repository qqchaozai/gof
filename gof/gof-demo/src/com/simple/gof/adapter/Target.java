package com.simple.gof.adapter;
/**
 * 客户端期望使用的目标对象
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public interface Target {
    public void save(String type,String log);
}
