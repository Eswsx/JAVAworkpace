package cn.es.stringbuilder;
/**
 * 测试可变字符序列：StringBuilder（线程不安全，效率高）,StringBuffer(线程安全，效率低)
 * String 不可变字符序列
 *@author Es无语中
 *
 */
public class stringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("abcd");
		sb2.append("efg");
		sb2.append(true).append(321).append("随便什么");//通过 return this 实现方法链
		
		System.out.println(sb2);
	}
}
