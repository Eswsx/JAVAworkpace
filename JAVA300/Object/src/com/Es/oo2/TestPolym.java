package com.Es.oo2;
/**
 * ���Զ�̬
 * @author Es������
 *Ҫ�м̳У���д������Ӧ��ָ���������
 */
public class TestPolym {
	public static void main(String[] args){
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog();//�Զ�����ת��
		animalCry(d);//ʹ���˶�̬������Ӧ��ָ���������
		Dog d2 = (Dog)d;//ǿ������ת��
		d2.watchDoor();
	}
	
	static void animalCry(Animal a){
		a.shout();
	}

}

class Animal{
	public void shout(){
		System.out.println("����һ��!");
	}
}

class Dog extends Animal{
	public void shout(){
		System.out.println("wangwangwang");
	}
	public void watchDoor(){
		System.out.println("���ţ�");
	}
}

class Cat extends Animal{
	public void shout(){
		System.out.println("miaomiaomiao");
	}
}