package cn.wsx.sort.innerType;

import java.util.Arrays;
import java.util.List;

public class Utils {
	/**
	 * 容器排序（使用泛型方法）
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr);
		//第二部：改变容器中的值
		for(int i=0;i<arr.length;i++){
			list.set(i, (T) arr[i]);
		}
	}
	
	
	
	private static void sort(Object[] arr) {
		// TODO 自动生成的方法存根
		
	}



	/**
	 * 数组排序（使用泛型方法）
	 */
	public static <T extends Comparable<T>> void sort(T[] arr){
		//从大到小排序降序
		boolean sorted = true;
		int len = arr.length;
		for (int j=0;j<len-1;j++){
			sorted = true;//假定有序
			System.out.println("第"+(j+1)+"趟");
			for(int i=0;i<len-1-j;i++){
				System.out.print("第"+(i+1)+"次");
				if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
					T temp = arr[i];
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
}
