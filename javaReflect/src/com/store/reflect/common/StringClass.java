package com.store.reflect.common;

import java.lang.reflect.Field;

/**
 * @Description:输出String类的属性，方法等。
 * @Package com.store.reflect.common
 * @ClassName: com.store.reflect.common.StringClass  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年8月9日 下午4:54:05
 */
public class StringClass {

	public static void main(String[] args) {
		StringClass ss=new StringClass();
		ss.getPrivateFiled(); 
		ss.getFields(); 
	}
	
	
	/**
	 * @Description:输出String类的公有属性。
	 * @author 张明明
	 * @date 2016年8月9日 下午4:55:44
	 */
	public void getPrivateFiled(){
		Class strClass=String.class;
		Field [] f =strClass.getDeclaredFields();
		System.out.println("String 类的公有属性有：");
		for (int i = 0; i < f.length; i++) {
			System.err.println(f[i]);
		}
	}
	/**
	 * @Description:String 类自己里的属性
	 * @author 张明明
	 * @date 2016年8月9日 下午5:09:12
	 */
	public void getFields(){
		Class strClass=String.class;
		Field [] f =strClass.getFields();
		System.out.println("String 类的属性有：");
		for (int i = 0; i < f.length; i++) {
			System.err.println(f[i]);
		}
	}
	
	
	
}
