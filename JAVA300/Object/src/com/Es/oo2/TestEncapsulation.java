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
	}

}

class Boy extends Human{
	void sayHello(){
		//System.out.println(age)//�����޷�ʹ�ø����˽�����Ժͷ���
	}
}
