package com.Es.arrays;
/**
 * ����ı���
 * @author Es������
 *
 */
public class Test03 {
	public static void main(String[] args){
		int[] a = new int[4];
		for(int i = 0;i<a.length;i++){
			a[i] = 10*i;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("############");
		//for-eachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�������޸�
		for(int m:a){
			System.out.println(m);
		}
	}
}
