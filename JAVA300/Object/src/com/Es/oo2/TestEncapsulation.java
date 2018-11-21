package com.Es.oo2;
/**
 * 测试封装
 * @author Es无语中
 *
 */
public class TestEncapsulation {
	public static void main(String[] args){
		Human h = new Human();
		//h.age = 13;
		h.name = "小明";
		h.height = 230;
	}

}

class Boy extends Human{
	void sayHello(){
		//System.out.println(age)//子类无法使用父类的私有属性和方法
	}
}
