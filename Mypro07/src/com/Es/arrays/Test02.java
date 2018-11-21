package com.Es.arrays;

/**
 * 测试数组的三种初始化方式
 * @author Es无语中
 *
 */

public class Test02 {
	public static void main(String args){
		//静态初始化
		int[] a = {2,3,4};
		User[] b = {
					new User(1001,"小明"),
					new User(1002,"张三"),
					new User(1003,"小华")
					};
		
		//默认初始化
		int[] c = new int[3];//默认给数组元素进行赋值
		
		//动态初始化
		int[] a1 = new int[2];
		a1[0] = 1;
		a1[1] = 2;
	
	}
}
