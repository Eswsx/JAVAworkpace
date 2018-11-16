/**
 * 
 * 对象，实例
 * @author Es无语中
 *
 */
public class Student {
	//属性fields
	int id;
	String name;
	int age;
	
	Computer comp;
	
	//方法
	void study(){
		System.out.println("studying!!" + comp.brand);
	}	
	void play(){
		System.out.println("i am playing!!");
	}
	Student(){//构造方法，用于创建类的对象，无参的构造可由系统自动创建	
	}
	
	//程序执行入口
	public static void main(String[] args){
		Student stu = new Student();//创建一个对象
		stu.id = 1001;
		stu.name = "wu";
		stu.age = 22;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		stu.play();
		stu.study();
	}
	
}

class Computer{
	String brand;
}
