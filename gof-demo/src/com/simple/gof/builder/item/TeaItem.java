package com.simple.gof.builder.item;
/**
 * ��
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class TeaItem extends BaseItem{

    @Override
    public String name() {
	return "tea";
    }

    @Override
    public float price() {
	return 2.5f;
    }

}
