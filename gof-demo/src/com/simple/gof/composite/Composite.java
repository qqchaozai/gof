package com.simple.gof.composite;

import java.util.ArrayList;
/**
 * ���λ�����
 * @author chaozai
 * @date 2018��8��21��
 *
 */
public class Composite implements Component {
    // �ӽڵ㼯��
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component component) {
	children.add(component);
    }

    @Override
    public void remove(Component component) {
	children.remove(component);
    }
    
    @Override
    public ArrayList<Component> getChildren() {
	return children;
    }

}
