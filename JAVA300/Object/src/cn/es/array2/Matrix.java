package cn.es.array2;

import java.util.Arrays;

public class Matrix {
	/**
	 * 
	 * ��ӡָ������
	 * @param c
	 */
	public static void print(int[][] c){
		//��ӡ����
		for (int i=0;i<c.length;i++){
			for (int j=0;j<c.length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	/**
	 * ����ӷ�
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][] a,int[][] b){
		int[][] c = new int[a.length][a.length];
		for (int i=0;i<c.length;i++){
			for (int j=0;j<c.length;j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[][] a = {
				{1,3},
				{2,4}
		};
		int[][] b = {
				{3,4},
				{5,6}
		};
		int[][] c = new int[2][2]; 
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
//		System.out.println(c[0][0]+"\t"+c[0][1]);
//		System.out.println(c[1][0]+"\t"+c[1][1]);
//	
		System.out.println(Arrays.toString(a));
	}
}
