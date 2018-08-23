package com.simple.gof.builder;

import java.util.ArrayList;
import java.util.List;

import com.simple.gof.builder.item.BaseItem;
/**
 * �̲�
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class MilkTea {
    private List<BaseItem> items = new ArrayList<BaseItem>();    
    /**
     * ����̲������
     * @param item
     */
    public void addItem(BaseItem item){
       items.add(item);
    }
    /**
     * ��ȡ�ܼ۸�
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
     * չʾ�̲��������
     */
    public void showItems(){
       for (BaseItem item : items) {
          System.out.print("Item : "+item.name());
          System.out.println(", Price : "+item.price());
       }        
    }    
}
