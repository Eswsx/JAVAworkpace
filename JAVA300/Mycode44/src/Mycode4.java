import java.math.*;
/**
 * 用于练习
 * @author Es无语中
 *
 */
public class Mycode4 {
	public static void main(String averg[]){
		long a = 555555555555L;//声明long类型最后要加L，否则编译器默认int类型
		double f = 314e2;//科学计数法
		double f2 = 314e-2;
		float f3 = 3.14F;//不加F默认double类型
		System.out.println(a+" "+f+" "+f2+" "+f3 );
		float f4 = 0.1f;
		double d = 1.1/10;
		System.out.println(f4 == d);//浮点数有误差
		//java.math包下面两个有用的类：BigInteger和BigDecimal，
		//BigInteger实现了任意精度的整数运算，BigDecimal实现了任意精度的浮点运算
		System.out.println("#############################");
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		System.out.println(bd2.equals(bd3));
		System.out.println(-9%5);
		System.out.println(9%-5);
		System.out.println(9%5);//与左操作数符号一致
		
		int v=0;
		v++;
		/*
		 * 逻辑与   &			 *位运算
		 * 短路与  &&			 * ~取反
		 * 逻辑或  |			 * &按位与
		 * 短路或  ||			 * |按位或	
		 * 异或  ^				 * ^按位异或
		 * 					     * <<左移运算符
		 * 					     * >>右移运算符
		 * */
		boolean b3 = 1>2 && 2<(3/0);//短路与
		System.out.println(b3);
		
		
		
	}
	
}
