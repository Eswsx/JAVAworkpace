package com.Es.arrays;
/**
 * 数组的遍历
 * @author Es无语中
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
		//for-each循环：用于读取数组元素的值，不能修改
		for(int m:a){
			System.out.println(m);
		}
	}
}
