package com.simple.gof.adapter;
/**
 * 被适配对象，仅能提供的
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public interface Adaptee {
    public void saveLogWithJson(String json);
    public void saveLogWithXml(String xml);
}
