package com.Es.oo2;

public class TestSuper2 {
	public static void main(String[] args){
		System.out.println("��ʼ����һ��ChildClass����");
		new ChildClass2();
	}
}

class FatherClass2{
	public FatherClass2(){
		System.out.println("����FatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	public ChildClass2(){
		super();//���й��췽��Ĭ�ϵ��ø��๹���� 
		System.out.println("����ChildClass");
	}
}