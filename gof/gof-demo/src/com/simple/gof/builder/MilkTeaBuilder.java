package com.simple.gof.builder;

import com.simple.gof.builder.item.MilkItem;
import com.simple.gof.builder.item.PearlItem;
import com.simple.gof.builder.item.TeaItem;

/**
 * 奶茶建造者
 * 
 * @author chaozai
 * @date 2018年8月20日
 *
 */
public class MilkTeaBuilder {
    /**
     * 创建纯茶
     * @return
     */
    public MilkTea prepareTea() {
	MilkTea milkTea = new MilkTea();
	milkTea.addItem(new TeaItem());
	return milkTea;
    }
    /**
     * 创建奶茶
     * @return
     */
    public MilkTea prepareMilkTea() {
	MilkTea milkTea = new MilkTea();
	milkTea.addItem(new MilkItem());
	milkTea.addItem(new TeaItem());
	return milkTea;
    }
    /**
     * 创建珍珠奶茶
     * @return
     */
    public MilkTea preparePearlMilkTea() {
	MilkTea milkTea = new MilkTea();
	milkTea.addItem(new MilkItem());
	milkTea.addItem(new TeaItem());
	milkTea.addItem(new PearlItem());
	return milkTea;
    }
}
