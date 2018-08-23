package com.simple.gof.memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
/**
 * 备忘录工具类
 * @author chaozai
 * @date 2018年8月22日
 *
 */
public class MementoUtil {
    
    /**
     * 发起备忘对象的所有属性及数值放入到Hashmap中
     * @param originator 发起对象
     * @return
     */
    public static HashMap<String, Object> backupProp(Object originator) {
	HashMap<String, Object> result = new HashMap<String, Object>();
	try {
	    // 获得Bean描述
	    BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
	    // 获得属性描述
	    PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
	    // 遍历所有属性
	    for (PropertyDescriptor des : descriptors) {
		// 属性名称
		String fieldName = des.getName();
		// 读取属性的方法
		Method getter = des.getReadMethod();
		// 读取属性值
		Object fieldValue = getter.invoke(originator, new Object[] {});
		if (!fieldName.equalsIgnoreCase("class")) {
		    result.put(fieldName, fieldValue);
		}
	    }
	} catch (Exception e) {
	    // 异常处理
	}
	return result;
    }

    /**
     * 
     * @param originator 待恢复的发起对象
     * @param memento	备忘对象
     */
    public static void restoreProp(Object originator, HashMap<String, Object> memento) {
	try {
	    // 获得Bean描述
	    BeanInfo beanInfo = Introspector.getBeanInfo(originator.getClass());
	    // 获得属性描述
	    PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
	    // 遍历所有属性
	    for (PropertyDescriptor des : descriptors) {
		// 属性名称
		String fieldName = des.getName();
		// 如果有这个属性
		if (memento.containsKey(fieldName)) {
		    // 写属性的方法
		    Method setter = des.getWriteMethod();
		    setter.invoke(originator, new Object[] { memento.get(fieldName) });
		}
	    }
	} catch (Exception e) {
	    // 异常处理
	    System.out.println("shit");
	    e.printStackTrace();
	}
    }
}
