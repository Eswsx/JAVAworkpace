package cn.es.stringbuilder;
/**
 * ���Կɱ��ַ����У�StringBuilder���̲߳���ȫ��Ч�ʸߣ�,StringBuffer(�̰߳�ȫ��Ч�ʵ�)
 * String ���ɱ��ַ�����
 *@author Es������
 *
 */
public class stringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("abcd");
		sb2.append("efg");
		sb2.append(true).append(321).append("���ʲô");//ͨ�� return this ʵ�ַ�����
		
		System.out.println(sb2);
	}
}
