package cn.wsx.test;
/**
 * 
 * �����Զ�װ����Զ�װ��
 * @author Es������
 *
 */
public class test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000; //jdk5.0�� �Զ�װ�䣬�����������Ķ�����Integer a = new Integer(1000);
		Integer b = 2000;
//		int c = new Integer(1500);//��������new Integer(1500).intValue();
		int c = b;//�������Ľ���b.intValue();
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
		Integer d5 = 128;  //[-128,127]֮���������Ȼ����������������������
		Integer d6 = 128;
		System.out.println(d5==d6);
		System.out.println(d5.equals(d6));
	}
}
