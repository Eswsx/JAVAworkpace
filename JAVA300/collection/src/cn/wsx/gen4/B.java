package cn.wsx.gen4;

public class B<T> {
	T stu;
	
	public static void main(String[] args) {
		//���͵�Ƕ��
		B<Student<String>> room = new B<Student<String>>();
		//���⵽�ڲ��
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}
}
