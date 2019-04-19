package cn.wsx.sort.bubble;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] arr = {9,1,2,3,4};
		//第二版本，减少每一趟的次数
		sort1(arr);
		System.out.println("----------------------");
		arr = new int[]{9,1,2,3,4};
		sortFinal(arr);
	}
	public static void sortFinal(int[] arr){
		boolean sorted = true;
		int len = arr.length;
		for (int j=0;j<len-1;j++){
			sorted = true;//假定有序
			System.out.println("第"+(j+1)+"趟");
			for(int i=0;i<len-1-j;i++){
				System.out.print("第"+(i+1)+"次");
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;//假定失败
				}
				System.out.println(Arrays.toString(arr));
				}
			if(sorted){
				break;//减少趟数
			}
		}
	}
	public static void sort1(int[] arr){
		int len = arr.length;
		for (int j=0;j<len-1;j++){
			System.out.println("第"+(j+1)+"趟");
			for(int i=0;i<len-1-j;i++){
				System.out.print("第"+(i+1)+"次");
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
