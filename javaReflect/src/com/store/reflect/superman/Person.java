package com.store.reflect.superman;

/**
 * @Description:
 * @Package com.store.reflect.superman
 * @ClassName: com.store.reflect.superman.Person  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年8月9日 下午4:53:11
 */
public class Person {
	
	public Person(int age, String name, String phone, String address) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
	}
	
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private int age;
    private String name;
    public String phone;
    protected String address;
    
    public void personMethod(){
    	System.out.println("我是父类Person 中的公有方法。");
    }
    
}
