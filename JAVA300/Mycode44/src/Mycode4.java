import java.math.*;
/**
 * ������ϰ
 * @author Es������
 *
 */
public class Mycode4 {
	public static void main(String averg[]){
		long a = 555555555555L;//����long�������Ҫ��L�����������Ĭ��int����
		double f = 314e2;//��ѧ������
		double f2 = 314e-2;
		float f3 = 3.14F;//����FĬ��double����
		System.out.println(a+" "+f+" "+f2+" "+f3 );
		float f4 = 0.1f;
		double d = 1.1/10;
		System.out.println(f4 == d);//�����������
		//java.math�������������õ��ࣺBigInteger��BigDecimal��
		//BigIntegerʵ�������⾫�ȵ��������㣬BigDecimalʵ�������⾫�ȵĸ�������
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
		System.out.println(9%5);//�������������һ��
		
		int v=0;
		v++;
		/*
		 * �߼���   &			 *λ����
		 * ��·��  &&			 * ~ȡ��
		 * �߼���  |			 * &��λ��
		 * ��·��  ||			 * |��λ��	
		 * ���  ^				 * ^��λ���
		 * 					     * <<���������
		 * 					     * >>���������
		 * */
		boolean b3 = 1>2 && 2<(3/0);//��·��
		System.out.println(b3);
		
		
		
	}
	
}
