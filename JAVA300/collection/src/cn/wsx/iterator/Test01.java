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
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		Set set = new HashSet();
		set.add("1234");
		set.add("5678");
		set.add("1111");
		
//		Iterator iter = set.iterator();
//		while (iter.hasNext()){
		for(Iterator iter = set.iterator();iter.hasNext();){
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
}
