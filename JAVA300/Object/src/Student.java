/**
 * 
 * ����ʵ��
 * @author Es������
 *
 */
public class Student {
	//����fields
	int id;
	String name;
	int age;
	
	Computer comp;
	
	//����
	void study(){
		System.out.println("studying!!" + comp.brand);
	}	
	void play(){
		System.out.println("i am playing!!");
	}
	Student(){//���췽�������ڴ�����Ķ����޲εĹ������ϵͳ�Զ�����	
	}
	
	//����ִ�����
	public static void main(String[] args){
		Student stu = new Student();//����һ������
		stu.id = 1001;
		stu.name = "wu";
		stu.age = 22;
		
		Computer c1 = new Computer();
		c1.brand = "����";
		
		stu.comp = c1;
		stu.play();
		stu.study();
	}
	
}

class Computer{
	String brand;
}
