package com.simple.gof.builder.item;

/**
 * ţ��
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class MilkItem extends BaseItem{

    @Override
    public String name() {
	return "milk";
    }

    @Override
    public float price() {
	return 5.5f;
    }

}
