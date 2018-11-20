package com.Es.oo2;

public class TestObject {
	public static void main(String[] args){
//Object obj;
		TestObject to = new TestObject();
		System.out.println(to);//== System.out.println(to。toString);
		
		Person2 p2 = new Person2("小华",6);
		System.out.println(p2.toString());
	}
	
	public String toString(){//重写Object中的toStirng方法
		return "I dont know!!!";
	}
		
	
}
class Person2{
	String name;
	int age;
	
	public String toString(){
		return name + "，年龄:" + age; 
	}
	
		public Person2(String name,int age){
			this.name = name;
			this.age = age;
		}
}
	

	
	
	

