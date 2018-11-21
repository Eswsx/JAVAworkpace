package com.Es.oo;

import com.Es.oo2.Human;

public class TestEncapsulation2 {
	public static void main(String[] args){
		Human h = new Human();
//		h.age = 13;
//		h.name = "小明";//name为default属性，不能被不同包的类访问
	}
}

class girl extends Human{
	void sayGood(){
		System.out.println(height);
	}
}
