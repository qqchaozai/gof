package com.simple.gof.memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
/**
 * ����¼������
 * @author chaozai
 * @date 2018��8��22��
 *
 */
public class MementoUtil {
    
    /**
     * ������������������Լ���ֵ���뵽Hashmap��
     * @param originator �������
     * @return
     */
    public static HashMap<String, Object> backupProp(Object originator) {
	HashMap<String, Object> result = new HashMap<String, Object>();
	try {
	    // ���Bean����
	    BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
	    // �����������
	    PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
	    // ������������
	    for (PropertyDescriptor des : descriptors) {
		// ��������
		String fieldName = des.getName();
		// ��ȡ���Եķ���
		Method getter = des.getReadMethod();
		// ��ȡ����ֵ
		Object fieldValue = getter.invoke(originator, new Object[] {});
		if (!fieldName.equalsIgnoreCase("class")) {
		    result.put(fieldName, fieldValue);
		}
	    }
	} catch (Exception e) {
	    // �쳣����
	}
	return result;
    }

    /**
     * 
     * @param originator ���ָ��ķ������
     * @param memento	��������
     */
    public static void restoreProp(Object originator, HashMap<String, Object> memento) {
	try {
	    // ���Bean����
	    BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
	    // �����������
	    PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
	    // ������������
	    for (PropertyDescriptor des : descriptors) {
		// ��������
		String fieldName = des.getName();
		// ������������
		if (memento.containsKey(fieldName)) {
		    // д���Եķ���
		    Method setter = des.getWriteMethod();
		    setter.invoke(originator, new Object[] { memento.get(fieldName) });
		}
	    }
	} catch (Exception e) {
	    // �쳣����
	    System.out.println("shit");
	    e.printStackTrace();
	}
    }
}
