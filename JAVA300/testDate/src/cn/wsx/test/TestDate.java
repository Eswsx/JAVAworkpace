package cn.wsx.test;

import java.util.Date;

/**
 * ����ʱ������÷�
 * @author Es������
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();//�Ժ��뷵�ص�ǰϵͳʱ��
		System.out.println(t);
		
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());//������ʹ��
		d2.setTime(123456789);
		System.out.println(d2.getTime());
		System.out.println(d2.getTime()<d.getTime());
		
	}
}
