package cn.wsx.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("1234");
		set.add("5678");
		set.add("1111");
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String str =(String) iter.next();
			System.out.println(str);
		}
		
		
	}
}
