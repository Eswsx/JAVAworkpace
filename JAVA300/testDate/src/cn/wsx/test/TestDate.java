package cn.wsx.test;

import java.util.Date;

/**
 * 测试时间类的用法
 * @author Es无语中
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();//以毫秒返回当前系统时间
		System.out.println(t);
		
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());//不建议使用
		d2.setTime(123456789);
		System.out.println(d2.getTime());
		System.out.println(d2.getTime()<d.getTime());
		
	}
}
