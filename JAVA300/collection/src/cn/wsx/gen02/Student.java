package cn.wsx.gen02;
/**
 * �����ࣺ����ʱʹ�÷���
 * @author Es������
 * T Type ��ʾ����
 * K V �ֱ��ʾ��ֵ�е�Key Value
 * E ����Element
 * �� ����ȷ������
 * ʹ��ʱȷ������
 * 
 * ע�⣺
 * 1.����ֻ��ʹ���������ͣ�����ʹ�û�������
 * 2.��������ʱ����ĸ����ʹ�� ��̬����|��̬����
 * 
 * ���͵Ĳ���
 * 1.�̳� ʵ��������ָ������
 * 2.ʹ��ʱ ��ָ������
 * ͳһObject�Դ�
 * 1.���������� ����ʹ��Object
 * 2.����ȫ��ͬ��Object�����벻�����ͼ��
 * @param <T>
 */
public class Student<T> {
	public static class Student1<T>{
		private T javaScore;
		private T oracleScore;
		
		public T getJavaScore() {
			return javaScore;
		}
		public void setJavaScore(T javaScore) {
			this.javaScore = javaScore;
		}
		public T getOracleScore() {
			return oracleScore;
		}
		public void setOracleScore(T oracleScore) {
			this.oracleScore = oracleScore;
		}
		
	}
	
	public static void main(String[] args) {
		//ʹ��ʱָ�����ͣ��������ͣ�
		Student1<String> stu = new Student1<String>();
		//1.��ȫ�����ͼ��
		stu.setJavaScore("����");
		//2.ʡ�ģ�����ת��
		
		Student stu1 = new Student();
		//��������ʹ��Object
		Student<Object> stu11 = new Student<Object>();
//		stu.setJavaScore("af");��Object�Դ�
		test(stu1);//stu1�൱��Object���ǲ���ȫ
		//�����������ͼ��
		test(stu11);
		test1(stu1);
		test1(stu11);
	}
	public static void test (Student<Object> a){
	}
	public static void test1(Student<?> a){
		
	}
}
