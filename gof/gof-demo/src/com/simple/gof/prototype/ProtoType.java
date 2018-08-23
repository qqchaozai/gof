package com.simple.gof.prototype;

/**
 * ʵ��Cloneable�ӿ�
 * 
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class ProtoType implements Cloneable {

    private static ProtoType protoType = new ProtoType();
    
    /**
     * ��ȡ��¡����
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
