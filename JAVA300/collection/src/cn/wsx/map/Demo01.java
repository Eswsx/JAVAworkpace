package cn.wsx.map;

import java.util.HashMap;
import java.util.Map;

/**
 * this is a cat and that is a mice and where is the food
 * 统计每个单词出现的次数
 * 
 * 存储到map中
 * key:String
 * value:自定义类型
 * 
 * "分拣"思路
 * 1.为所有key创建容器
 * 	 之后容器中存放对应value
 * 2.第一次创建容器，并存放值value
 * 	 第二次之后，直接使用容器存放值
 * @author Es无语中
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String str = "this is a cat and that is a mice and where is the food";
		//分割字符串
		String[] strArray = str.split(" ");
		//存储到map中
		Map<String,Letter> letters = new HashMap<>();
	}
}
