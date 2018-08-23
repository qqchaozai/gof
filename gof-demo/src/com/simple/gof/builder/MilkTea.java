package com.simple.gof.builder;

import java.util.ArrayList;
import java.util.List;

import com.simple.gof.builder.item.BaseItem;
/**
 * 奶茶
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class MilkTea {
    private List<BaseItem> items = new ArrayList<BaseItem>();    
    /**
     * 添加奶茶基础项
     * @param item
     */
    public void addItem(BaseItem item){
       items.add(item);
    }
    /**
     * 获取总价格
     * @return
     */
    public float getCost(){
       float cost = 0.0f;
       for (BaseItem item : items) {
          cost += item.price();
       }        
       return cost;
    }
    /**
     * 展示奶茶包含内容
     */
    public void showItems(){
       for (BaseItem item : items) {
          System.out.print("Item : "+item.name());
          System.out.println(", Price : "+item.price());
       }        
    }    
}
