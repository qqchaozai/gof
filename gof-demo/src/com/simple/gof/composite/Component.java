package com.simple.gof.composite;

import java.util.ArrayList;
/**
 * 树形混合组件基础功能接口
 * @author chaozai
 * @date 2018年8月21日
 *
 */
public interface Component {
    
    // 增加一个子组件
    public void add(Component component);

    // 删除一个子组件
    public void remove(Component component);

    // 获得子组件
    public ArrayList<Component> getChildren();
}
