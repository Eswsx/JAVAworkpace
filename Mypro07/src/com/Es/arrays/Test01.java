package com.Es.arrays;

public class Test01 {
	public static void main(String[] args){
		int[] arr01 = new int[10];
		//int[] s = null;
		//s = new int[10];
		String arr02[] = new String[5];
		
		//ͨ��ѭ����ʼ������
		for(int i = 0;i<arr01.length;i++){
			arr01[i] = 10*i;
		}
		//ͨ��ѭ������������е�Ԫ�ص�ֵ
		for(int i=0;i<arr01.length;i++){
			System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[3];
		arr03[0] = new User(1001,"С��");
		arr03[1] = new User(1002,"С��");
		arr03[2] = new User(1003,"С��");
		
		for(int i=0;i<arr03.length;i++){
			System.out.println(arr03[i].getName());
		}
	}
}

