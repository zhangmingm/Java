package com.store.reflect.common.bean;

/**
 * @Description:人类的接口。
 * @Package com.store.reflect.common.bean
 * @ClassName: com.store.reflect.common.bean.PersonInter  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年8月9日 下午5:15:29
 */
public interface PersonInter {

	/*
	 * 接口中属性与方法 的修饰符都是public的，因此不管写不写都是public。
	 */
	public int perAge=15;
	
	String pName="hahaha";
	
	void speak(String what);
	
	void eat(String food);
}
