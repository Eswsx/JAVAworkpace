package cn.wsx.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		//ArrayList:�ײ�ʵ�������顣���ԣ���ѯ�졣�޸ģ����룬ɾ������
		//LinkList:�ײ�ʵ�����������ԣ���ѯ�����޸ģ����룬ɾ���졣
		//Vector:�̰߳�ȫ��Ч�ʵ͡�
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//��װ���Զ�װ��
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
//		list.remove(new Date());//hashcode �� equals
		System.out.println(list.size());
		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ccc");
		
		list.add(list2);
		System.out.println(list.size());
		
		//��˳��Ĳ���
		String str = (String)list.get(0);
		System.out.println(str);
		list.set(1,"aaaaba");
		list.remove(0);
	}
}
class Dog{
	
}