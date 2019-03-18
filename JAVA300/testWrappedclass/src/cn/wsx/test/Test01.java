package cn.wsx.test;
/**
 * 包装类的使用
 * @author Es无语中
 *
 */
public class Test01 {
		public static void main(String[] args) {
			Integer i = new Integer(1000);
			System.out.println(Integer.MAX_VALUE);//最大值
			System.out.println(Integer.toHexString(i));//转16进制
			Integer i2 = Integer.parseInt("234");//字符串转整型
			Integer i3 = new Integer("333");//字符串转整型
			System.out.println(i3+10);
		}
}
