package cn.wsx.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试MAP的基本用法
 * @author Es无语中
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("wsx", new wife("LR?"));
		map.put("123", new wife("567"));
		
		map.remove("wsx");
		
		wife w = (wife) map.get("wsx");
		System.out.println(w.name);
	}
}

class wife{
	String name;
	public wife(String name){
		this.name = name;
	}
}