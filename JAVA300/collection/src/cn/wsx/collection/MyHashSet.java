package cn.wsx.collection;
/**
 * �Զ����Լ���HashSet
 * 
 * @author Es������
 *
 */

import java.util.HashMap;

public class MyHashSet {
	HashMap map;
	private static final Object PRESENT = new Object();
	int size;
	public MyHashSet(){
		map = new HashMap();
	}
	public int size(){
		return map.size();
	}
	public void add(Object o){
		map.put(o, PRESENT);//set�Ĳ����ظ���������map���������Ĳ����ظ�
		size++;
	}
	
	public void remove(Object o){
		
	}
	
	public static void main(String[] args) {
		MyHashSet s = new MyHashSet();
		s.add("sssss");
		s.add(new String("sssss"));
		System.out.println(s.size());
	}
}
