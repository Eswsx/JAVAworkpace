package cn.wsx.test;
/**
 * ��װ���ʹ��
 * @author Es������
 *
 */
public class Test01 {
		public static void main(String[] args) {
			Integer i = new Integer(1000);
			System.out.println(Integer.MAX_VALUE);//���ֵ
			System.out.println(Integer.toHexString(i));//ת16����
			Integer i2 = Integer.parseInt("234");//�ַ���ת����
			Integer i3 = new Integer("333");//�ַ���ת����
			System.out.println(i3+10);
		}
}
