package cn.wsx.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Teat01 {
	public static void main(String[] args) throws ParseException {
		Employee e = new Employee(0301,"����",3000,"��Ŀ��","2007-10"); 
		Employee e2 = new Employee(0302,"����",3500,"��Ŀ��","2006-10"); 
		Employee e3 = new Employee(0303,"����",3550,"��Ŀ��","2007-10"); 
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e2);
		list.add(e3);
//		e.setId(0301);
//		e.setName("����");
//		e.setDepartment("��Ŀ��");
//		e.setSalary(3000);
//		String strDate = "2007-10";
//		DateFormat format = new SimpleDateFormat("yyyy-MM");
//		e.setHireDate(format.parse(strDate));
		printEmpName(list);
	}
	public static void printEmpName(List<Employee> list){
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	}
}
