package com.Es.arrays;

public class Test01 {
	public static void main(String[] args){
		int[] arr01 = new int[10];
		//int[] s = null;
		//s = new int[10];
		String arr02[] = new String[5];
		
		//通过循环初始化数组
		for(int i = 0;i<arr01.length;i++){
			arr01[i] = 10*i;
		}
		//通过循环输出数组找中的元素的值
		for(int i=0;i<arr01.length;i++){
			System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[3];
		arr03[0] = new User(1001,"小明");
		arr03[1] = new User(1002,"小话");
		arr03[2] = new User(1003,"小红");
		
		for(int i=0;i<arr03.length;i++){
			System.out.println(arr03[i].getName());
		}
	}
}

