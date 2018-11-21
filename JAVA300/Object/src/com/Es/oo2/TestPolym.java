package com.Es.oo2;
/**
 * 测试多态
 * @author Es无语中
 *要有继承，重写，父类应用指向子类对象
 */
public class TestPolym {
	public static void main(String[] args){
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();//自动向上转型
		animalCry(d);//使用了多态，父类应用指向子类对象
		Dog d2 = (Dog)d;//强制向下转型
		d2.watchDoor();
	}
	
	static void animalCry(Animal a){
		a.shout();
	}

}

class Animal{
	public void shout(){
		System.out.println("叫了一声!");
	}
}

class Dog extends Animal{
	public void shout(){
		System.out.println("wangwangwang");
	}
	public void watchDoor(){
		System.out.println("看门！");
	}
}

class Cat extends Animal{
	public void shout(){
		System.out.println("miaomiaomiao");
	}
}