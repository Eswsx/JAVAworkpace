package cn.wsx.gen4;
/**
 * ͨ���
 * �����Ͳ�����ʹ��ʱȷ������
 * ?ʹ��:��������|���������ϣ��������������ʹ��ʱʹ��
 * ��extends:<= ���� ָ������Ϊ���������
 * ��super:>= ���� ָ������Ϊ �������	
 * @author Es������
 *
 */
public class Student<T> {
	T score;
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();
		test(new Student<Integer>());
		test2(new Student<Apple>());
//		test3(new Student<Apple>());//����û�ж�̬
		
//		test4(new Student<Apple>());//<=
		test4(new Student<Object>());
		test4(new Student<Fruit>());
//		test4(new Student<stu>());//ʹ��ʱȷ������
	}
	public static void test(Student<?> stu){
		
	}
	//<=
	public static void test2(Student<? extends Fruit> stu){
		
	}
	//>=
	public static void test4(Student<? super Fruit> stu){
		
	}
	public static void test3(Student<Fruit> stu){
		
	}
}
