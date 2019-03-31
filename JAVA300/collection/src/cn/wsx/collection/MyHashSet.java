package cn.wsx.collection;
/**
 * 自定义自己的HashSet
 * 
 * @author Es无语中
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
		map.put(o, PRESENT);//set的不可重复就是利用map里面键对象的不可重复
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
