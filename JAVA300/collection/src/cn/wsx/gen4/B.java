package cn.wsx.gen4;

public class B<T> {
	T stu;
	
	public static void main(String[] args) {
		//泛型的嵌套
		B<Student<String>> room = new B<Student<String>>();
		//从外到内拆分
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}
}
