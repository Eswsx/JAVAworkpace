package cn.es.oop.abstractClass;

public class Test {
	public static void main(String[] args) {
//		Animal a = new Animal();//抽象类不能实例化
		Animal a = new Cat();
		a.run();
	}
}
