package cn.wsx.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����MAP�Ļ����÷�
 * @author Es������
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