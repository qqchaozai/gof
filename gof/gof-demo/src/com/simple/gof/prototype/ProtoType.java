package com.simple.gof.prototype;

/**
 * 实现Cloneable接口
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class ProtoType implements Cloneable {

    private static ProtoType protoType = new ProtoType();
    
    /**
     * 获取克隆对象
     * @return
     */
    public static ProtoType getCloneProtoType() {
	ProtoType cloneProtoType = (ProtoType) protoType.clone();
	return cloneProtoType;
    }

    @Override
    public ProtoType clone() {
	ProtoType clone = null;
	try {
	    clone = (ProtoType) super.clone();
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
	return clone;
    }
}
