package cn.wsx.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		//通过索引遍历list
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//通过迭代器遍历list
		for(Iterator iter = list.iterator();iter.hasNext();){
			String str = (String) iter.next();
			System.out.println(str);
		}
		Set set = new HashSet();
		set.add("1234");
		set.add("5678");
		set.add("1111");
		
		//通过迭代器遍历set
//		Iterator iter = set.iterator();
//		while (iter.hasNext()){
		for(Iterator iter = set.iterator();iter.hasNext();){
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
}
