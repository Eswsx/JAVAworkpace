package cn.wsx.gen03;
/**
 * ����Ϊ����
 * 1.����
 * 2.����
 * Ҫôͬʱ������Ҫô������ڵ��ڸ�������ͣ�
 * ����������������෺��
 * 1.��������
 * �����У��游�ඨ
 * �����У������ඨ
 * 2.������д:
 * �游�����
 * @author Es������
 *
 * @param <T>
 */
public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);
}

/**
*��������ʱָ����������
*��������Ϊ��������
*����ͬ��
*/
class Child extends Father<String,Integer>{
	String t2;
	@Override
	public void test(String t) {	
	}
	
}
/**
 * ����Ϊ���ͣ�������ʹ��ʱȷ��
 * @author Es������
 *
 */
class Child2<T1,T> extends Father<T,T1>{
	T1 t2;
	@Override
	public void test(T t) {	
	}
}
/**
 * ����Ϊ�����࣬���಻ָ������,���͵Ĳ�����ʹ��Object�滻
 */
class Child3<T1,T> extends Father{

	@Override
	public void test(Object t) {
		// TODO �Զ����ɵķ������	
	}
}
/**
 * �����븸��ͬʱ����
 */
class Child4 extends Father{

	@Override
	public void test(Object t) {
		
	}
}
/**
 * �����������������ʹ�÷���

class Child5 extends Father<T,T1>{

	@Override
	public void test(cn.wsx.gen03.T t) {
		// TODO �Զ����ɵķ������
		
	}

	
}
*/
