package com.Es.oo2;
/**
 * ���Լ̳У���д��override��/����
 * @author Es������
 *JAVA����ֻ�е��̳У��ӿ��ж�̳�
 */
public class TestExtends {
	public static void main(String[] args){
		Student stu = new Student();
		stu.name = "С��";
		stu.height = 172;
		stu.rest();
		Student stu2 = new Student("С��",6,"�ھ��");
		
		System.out.println(stu2 instanceof Student);//�����Ƿ�����
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person/*entends Object*/{//û�м̳�Ĭ�ϼ̳�Object����//Ctrl+t�鿴��ļ̳нṹ
	String name;
	int height;
	
	public void rest(){
		System.out.println("��Ϣһ�����");
	}
}

class Student extends Person{
	
	String major;
	
	public void study(){
		System.out.println("ѧϰ��Сʱ��");
	}
	public void rest(){
		System.out.println("��Ϣһ��Сʱ����");
	}
	
	public Student(String name,int height,String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
	public Student(){
		
	}
	
}