package com.store.reflect.superman;

import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {

	/**
     * 为了看清楚Java反射部分代码，所有异常我都最后抛出来给虚拟机处理
     */
    @SuppressWarnings("static-access")
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
    	ReflectService ref=new ReflectService();
        System.out.println("demo1：通过Java反射机制得到类的包名和类名");
        ref.demo1();

        System.out.println("");
        System.out.println("demo2：验证所有的类都是Class类的实例对象");
        ref.demo2();

        System.out.println("");
        System.out.println("demo3：通过Java反射机制，用 Class 创建类对象，这也就是反射存在的意义所在");
        ref.demo3();

        System.out.println("");
        System.out.println("demo4：通过Java反射机制得到一个类的构造函数，并实现创建带参实例对象");
        ref.demo4();

        System.out.println("");
        System.out.println("demo5：通过Java反射机制操作成员变量, set 和 get");
        ref.demo5();

        System.out.println("");
        System.out.println("demo6：通过Java反射机制得到类的一些属性：继承的接口、父类、函数信息、成员信息、类型等");
        ref.demo6();

        System.out.println("");
        System.out.println("demo7：通过Java反射机制调用类方法");
        ref.demo7();

        System.out.println("");
        System.out.println("demo8：通过Java反射机制得到类加载器信息");
        ref.demo8();
    }

    
    
}
