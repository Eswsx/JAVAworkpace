package cn.es.oop.abstractClass;
/**
 * ������
 * ֻ�г�������ܶ�����󷽷�
 * ���������д���� �ĳ��󷽷�
 * @author Es������
 *
 */
public abstract class Animal {
	public abstract void run();
	public void Breath(){
		System.out.println("����");
		run();
	}
}


class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("��");
		
	}
	
}
class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("����");
		
	}
	
}