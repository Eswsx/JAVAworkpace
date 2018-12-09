package cn.es.array2;

public class Test01 {
	public static void main(String[] args) {
		
		
		int [][] a={
				{1,2,3},
				{2,3,4},
				{6,7,8}
		};//静态初始化
		
		int[][] b = new int[3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		for(int i=0;i<3;i++){
			for(int j=0;j<i+1;j++){
				b[i][j] = j;
			}
		}
		//动态初始化	
		for(int i=0;i<3;i++){
			for(int j=0;j<i+1;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}