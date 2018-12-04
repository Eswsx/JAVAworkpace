package cn.es.oop.testInterface;

public class MyClass implements MyInterface,test1{

	@Override
	public void test01() {
		System.out.println("test01");
		
	}

	@Override
	public int test02(int a, int b) {
		System.out.println("MyClass.test02()");
		return a+b;
	}

	@Override
	public void say() {
		System.out.println("I can say!");
		
	}
	
}

class MyCalss1 implements test1{

	@Override
	public void say() {
		System.out.println("I can say 2!");
		
	}
	
}