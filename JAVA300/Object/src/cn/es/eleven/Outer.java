package cn.es.eleven;

import cn.es.eleven.Face.Nose;

/**
 * �Ǿ�̬����󵥶������ⲿ���ĳ������
*/
public class Outer {
	public static void main(String[] args){
		Face f = new Face();
		Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	int type = 20;
	static String color = "����";
	String shape = "������";
	
	class Nose{
		String type = "��";
		
		void breath (){
			System.out.println(Face.this.type);
			System.out.println(type);
			System.out.println("������");
		}
	}
	static class Ear{
		void listen(){
			System.out.println(color);
			System.out.println("������");
		}
	}
}