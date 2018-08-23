package com.simple.gof.builder.item;
/**
 * ����
 * @author chaozai
 * @date 2018��8��20��
 *
 */
public class PearlItem extends BaseItem{

    @Override
    public String name() {
	return "pear";
    }

    @Override
    public float price() {
	return 1.0f;
    }

}