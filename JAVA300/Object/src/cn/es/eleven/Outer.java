package cn.es.eleven;

import cn.es.eleven.Face.Nose;

/**
 * 非静态类对象单独属于外部类的某个对象
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
	static String color = "红润";
	String shape = "瓜子脸";
	
	class Nose{
		String type = "高";
		
		void breath (){
			System.out.println(Face.this.type);
			System.out.println(type);
			System.out.println("呼吸！");
		}
	}
	static class Ear{
		void listen(){
			System.out.println(color);
			System.out.println("我在听");
		}
	}
}