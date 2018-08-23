package com.simple.gof.adapter;

/**
 * ͨ����ϱ��������ʵ��Ŀ�����ӿڣ���ʵ�����书��
 * 
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public class AdapteeAdapter implements Target {

    Adaptee adaptee;

    public AdapteeAdapter(Adaptee adaptee) {
	this.adaptee = adaptee;
    }

    /**
     * ����log������
     */
    @Override
    public void save(String type, String log) {
	if ("json".equals(type)) {
	    adaptee.saveLogWithJson(log);
	} else if ("xml".equals(type)) {
	    adaptee.saveLogWithXml(log);
	}
    }

}
