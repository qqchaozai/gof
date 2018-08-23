package com.simple.gof.builder;

import com.simple.gof.builder.item.MilkItem;
import com.simple.gof.builder.item.PearlItem;
import com.simple.gof.builder.item.TeaItem;

/**
 * �̲轨����
 * 
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class MilkTeaBuilder {
    /**
     * ��������
     * @return
     */
    public MilkTea prepareTea() {
	MilkTea milkTea = new MilkTea();
	milkTea.addItem(new TeaItem());
	return milkTea;
    }
    /**
     * �����̲�
     * @return
     */
    public MilkTea prepareMilkTea() {
	MilkTea milkTea = new MilkTea();
	milkTea.addItem(new MilkItem());
	milkTea.addItem(new TeaItem());
	return milkTea;
    }
    /**
     * ���������̲�
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
