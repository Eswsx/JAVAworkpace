package com.Es.oo2;
/**
 * 测试继承，重写（override）/覆盖
 * @author Es无语中
 *JAVA的类只有单继承，接口有多继承
 */
public class TestExtends {
	public static void main(String[] args){
		Student stu = new Student();
		stu.name = "小明";
		stu.height = 172;
		stu.rest();
		Student stu2 = new Student("小红",6,"挖掘机");
		
		System.out.println(stu2 instanceof Student);//测试是否属于
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person/*entends Object*/{//没有继承默认继承Object父类//Ctrl+t查看类的继承结构
	String name;
	int height;
	
	public void rest(){
		System.out.println("休息一会儿！");
	}
}

class Student extends Person{
	
	String major;
	
	public void study(){
		System.out.println("学习两小时！");
	}
	public void rest(){
		System.out.println("休息一个小时！！");
	}
	
	public Student(String name,int height,String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
	public Student(){
		
	}
	
}