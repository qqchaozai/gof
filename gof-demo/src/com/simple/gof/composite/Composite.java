package com.simple.gof.composite;

import java.util.ArrayList;
/**
 * 树形混合组件
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public class Composite implements Component {
    // 子节点集合
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
