package cn.wsx.collection;

import java.util.HashSet;
import java.util.Set;


/**
 * ����Set�ĳ��÷���
 * @author Es������
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
