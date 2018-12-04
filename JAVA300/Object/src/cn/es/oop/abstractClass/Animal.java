package cn.es.oop.abstractClass;
/**
 * 抽象类
 * 只有抽象类才能定义抽象方法
 * 子类必须重写父类 的抽象方法
 * @author Es无语中
 *
 */
public abstract class Animal {
	public abstract void run();
	public void Breath(){
		System.out.println("呼吸");
		run();
	}
}


class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("跑");
		
	}
	
}
class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("快跑");
		
	}
	
}