package cn.wsx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��a hh:mm:ss E z");
		
		Date d = new Date(12334566);
		String str = df.format(d);//��ʱ������ո�ʽ���ַ�����ת�����ַ���
		System.out.println(str);
		System.out.println("**********");
		String str2 = "1977-7-7 10:23:15";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
