package com.Es.oo2;
/**
 * 
 * ���Է�װ2
 * @author Es������
 *
 */
public class Person4Encapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public void setAge(int age){
		if(age>=1 && age<=130){
			this.age = age;
		}else{
			System.out.print("��������ȷ���䣡");
		}
	}
	public int getAge(){
		return age;
	}
	
}
