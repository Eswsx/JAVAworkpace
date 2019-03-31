package cn.wsx.collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.PrinterIsAcceptingJobs;

import org.xml.sax.HandlerBase;

public class Tset02 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", 0302);
		map.put("name", "张三");
		map.put("salary", 3500);
		map.put("department", "教学部");
		map.put("hireDate", "2007-10");
		
		Map map2 = new HashMap();
		map2.put("id", 0303);
		map2.put("name", "李四");
		map2.put("salary", 3550);
		map2.put("department", "教学部");
		map2.put("hireDate", "2007-10");
		
		Map map3 = new HashMap();
		map3.put("id", 0304);
		map3.put("name", "王五");
		map3.put("salary", 4500);
		map3.put("department", "教学部");
		map3.put("hireDate", "2007-10");
		
		List<Map> list = new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		printEmpName(list);
		
	}
	public static void printEmpName(List<Map> list){
		for (int i=0;i<list.size();i++){
			Map tempMap = list.get(i);
			System.out.println(tempMap.get("name")+"---"+tempMap.get("salary"));
		}
	}
}
