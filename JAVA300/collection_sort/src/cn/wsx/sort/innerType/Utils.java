package cn.wsx.sort.innerType;

import java.util.Arrays;
import java.util.List;

public class Utils {
	/**
	 * ��������ʹ�÷��ͷ�����
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		//��һ����ת������
		Object[] arr = list.toArray();
		sort(arr);
		//�ڶ������ı������е�ֵ
		for(int i=0;i<arr.length;i++){
			list.set(i, (T) arr[i]);
		}
	}
	
	
	
	private static void sort(Object[] arr) {
		// TODO �Զ����ɵķ������
		
	}



	/**
	 * ��������ʹ�÷��ͷ�����
	 */
	public static <T extends Comparable<T>> void sort(T[] arr){
		//�Ӵ�С������
		boolean sorted = true;
		int len = arr.length;
		for (int j=0;j<len-1;j++){
			sorted = true;//�ٶ�����
			System.out.println("��"+(j+1)+"��");
			for(int i=0;i<len-1-j;i++){
				System.out.print("��"+(i+1)+"��");
				if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
					T temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;//�ٶ�ʧ��
				}
				System.out.println(Arrays.toString(arr));
				}
			if(sorted){
				break;//��������
			}
		}
	}
}
