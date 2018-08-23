package com.simple.gof.composite;

import java.util.ArrayList;
/**
 * ���λ������������ܽӿ�
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public interface Component {
    
    // ����һ�������
    public void add(Component component);

    // ɾ��һ�������
    public void remove(Component component);

    // ��������
    public ArrayList<Component> getChildren();
}
