package com.store.reflect.common.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.store.reflect.superman.Person;

/**
 * @Description:获取person类的属性，方法等。
 * @Package com.store.reflect.common.bean
 * @ClassName: com.store.reflect.common.bean.TestPerson  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年8月9日 下午5:23:42
 */
public class TestStudent {

	public static void main(String[] args) {
		TestStudent tp=new TestStudent();
		tp.getPublicFiled();
		tp.getPrivateFiled();
		tp.getConstructors();
		tp.getPublicMethod();
		tp.getMethod();
	}
	
	
	
	
	/**
	 * @Description:返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
	 * @author 张明明
	 * @date 2016年8月9日 下午6:07:04
	 */
	public void getMethod(){
		Method[] mh = student.getClass().getMethods();
		System.out.println("Student 类的方法：");
		for (int i = 0; i < mh.length; i++) {
			System.out.println(mh[i]);
		}
		System.out.println();
	}
	
	
	
	
	
	/**
	 * @Description:返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
	 * @author 张明明
	 * @date 2016年8月9日 下午5:56:35
	 */
	public void getPublicMethod() {
		Method[] mh = student.getClass().getDeclaredMethods();
		System.out.println("Student 类的方法：");
		for (int i = 0; i < mh.length; i++) {
			System.out.println(mh[i]);
		}
		System.out.println();
	}
	
	
	/**
	 * @Description:获取类的构造方法。
	 * @author 张明明
	 * @date 2016年8月9日 下午5:49:01
	 */
	public void getConstructors(){
		Constructor<?>[]  cc=student.getClass().getConstructors();
		System.out.println("Student 类的构造方法：");
		for (int i = 0; i < cc.length; i++) {
			System.out.println(cc[i]);
		}
		System.out.println();
	}
	
	
	/**
	 * @Description:获取自己，父类。父接口的公有的属性。
	 * 自己类里声明的public修饰的属性，父类中public修饰的属性，接口中的所有属性。
	 * @author 张明明
	 * @date 2016年8月9日 下午5:25:52
	 */
	public void getPublicFiled(){
		Field[] pf=student.getClass().getFields();
		System.out.println("Student 类的公有属性,包括自己的和父类的：");
		for (int i = 0; i < pf.length; i++) {
			System.out.print(pf[i]+"\n");
		}
		System.out.println();
	}
	
	/**
	 * @Description:获取类的私有属性。
	 * @author 张明明
	 * @date 2016年8月9日 下午5:45:58
	 */
	public void getPrivateFiled(){
		Field[] pf=student.getClass().getDeclaredFields();
		System.out.println("Student 类的私有属性：");
		for (int i = 0; i < pf.length; i++) {
			System.out.print(pf[i]+"\n");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	Student student=new Student();
	Person person=new Person();
	
}
