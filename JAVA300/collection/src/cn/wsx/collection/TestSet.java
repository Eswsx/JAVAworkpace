package cn.wsx.collection;

import java.util.HashSet;
import java.util.Set;


/**
 * 测试Set的常用方法
 * @author Es无语中
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaaa");
		System.out.println(set.size());
		System.out.println(set.contains("aaaa"));
	}
}
