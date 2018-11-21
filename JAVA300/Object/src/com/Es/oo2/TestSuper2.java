package com.Es.oo2;

public class TestSuper2 {
	public static void main(String[] args){
		System.out.println("开始创建一个ChildClass对象");
		new ChildClass2();
	}
}

class FatherClass2{
	public FatherClass2(){
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	public ChildClass2(){
		super();//所有构造方法默认调用父类构造器 
		System.out.println("创建ChildClass");
	}
}