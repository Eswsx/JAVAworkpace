package cn.wsx.gen03;
/**
 * ���ͽӿ�:��̳�ͬ��
 * ��д�����游�����
 * @author Es������
 *
 * @param <T>
 */
public interface Comparable<T> {
	void compare(T t);
}
//��������ָ������
class Comp implements Comparable<Integer>{

	@Override
	public void compare(Integer t) {
		// TODO �Զ����ɵķ������
		
	}
}
//����
class Comp1 implements Comparable{

	@Override
	public void compare(Object t) {
		// TODO �Զ����ɵķ������
		
	}
	
}
//������������෺��
class Comp2<t> implements Comparable{

	@Override
	public void compare(Object t) {
		// TODO �Զ����ɵķ������
		
	}
	
}
//���෺��>=���෺��
class Comp3<T> implements Comparable<T>{

	@Override
	public void compare(T t) {
		// TODO �Զ����ɵķ������
		
	}
	
}
//���෺�ͣ����෺�ʹ���