package com.store.reflect.common.bean;

import com.store.reflect.superman.Person;

/**
 * @Description:persion 类的子类。
 * @Package com.store.reflect.common.bean
 * @ClassName: com.store.reflect.common.bean.Student  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年8月9日 下午5:12:07
 */
public class Student extends Person implements PersonInter{
	
	private String studentNo; //学号
	private String classNo;  //班级编号
	public String departmant; //院系名称
	
	public String getStudentNo() {
		return studentNo;
	}
	
	
	
	public Student() {
		super();
	}



	public Student(String studentNo, String classNo) {
		super();
		this.studentNo = studentNo;
		this.classNo = classNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getDepartmant() {
		return departmant;
	}
	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}
	@Override
	public void speak(String what) {
		System.out.println(what+",正在军训,不要打扰......");
	}
	@Override
	public void eat(String food) {
		System.out.println(food+" 学校的饭真不好吃......");
		
	}

	public void testExamCourse(){
		System.out.println("快考试了，要复习好......");
	}
	
	
	private void gotoPark(){
		System.out.println("今天是周末，出去玩玩......");
	}
	
	protected void hehehe(){
		System.out.println("这个方法是protected 修饰的...");
	}
	
}
