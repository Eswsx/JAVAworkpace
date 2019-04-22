package cn.wsx.sort.innerType;
/**
 * 排序规则的业务类
 * @author Es无语中
 *
 */
public class StringComp implements java.util.Comparator<String>{

	@Override
	/**
	 * 按长度比较大小
	 */
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		
		
		return len1 - len2;
	}

}
