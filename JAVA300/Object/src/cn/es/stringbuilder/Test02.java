package cn.es.stringbuilder;
/*
 * 
 * StringBulider�ĳ��÷���
 */
public class Test02 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvdxyz");
		sb.delete(3,5).delete(2,4);//��������
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
