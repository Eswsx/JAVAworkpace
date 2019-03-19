package cn.wsx.test;
/**
 * 
 * 测试自动装箱和自动装箱
 * @author Es无语中
 *
 */
public class test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000; //jdk5.0后 自动装箱，编译器帮助改动代码Integer a = new Integer(1000);
		Integer b = 2000;
//		int c = new Integer(1500);//编译器：new Integer(1500).intValue();
		int c = b;//编译器改进：b.intValue();
		System.out.println(c);
		
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));
		System.out.println("***************");
		Integer d3 = 127;
		Integer d4 = 127;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
		System.out.println("***************");
		Integer d5 = 128;  //[-128,127]之间的数，仍然当做基本数据类型来处理
		Integer d6 = 128;
		System.out.println(d5==d6);
		System.out.println(d5.equals(d6));
	}
}
