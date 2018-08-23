package com.simple.gof.singleton;
/**
 * 饿汉+线程安全+枚举
 * </p>
 * 简洁，自动支持序列化机制，绝对防止多次实例化
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public enum EnumLazySingleton {  
    INSTANCE;  
    public void whateverMethod() {  
    }  
}
