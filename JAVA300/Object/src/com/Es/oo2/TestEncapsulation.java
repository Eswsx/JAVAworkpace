package com.Es.oo2;
/**
 * ���Է�װ
 * @author Es������
 *
 */
public class TestEncapsulation {
	public static void main(String[] args){
		Human h = new Human();
		//h.age = 13;
		h.name = "С��";
		h.height = 230;
		
		Person4Encapsulation p4 = new Person4Encapsulation();
//		p4.age = 14;
		p4.setAge(14);
	}

}

class Boy extends Human{
	void sayHello(){
		//System.out.println(age)//�����޷�ʹ�ø����˽�����Ժͷ���
	}
}
