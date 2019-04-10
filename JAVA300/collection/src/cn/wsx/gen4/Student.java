package cn.wsx.gen4;
/**
 * 通配符
 * ？类型不定，使用时确定类型
 * ?使用:声明类型|声明方法上，不能声明类或在使用时使用
 * ？extends:<= 上限 指定类型为子类或自身
 * ？super:>= 下限 指定类型为 自身或父类	
 * @author Es无语中
 *
 */
public class Student<T> {
	T score;
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();
		test(new Student<Integer>());
		test2(new Student<Apple>());
//		test3(new Student<Apple>());//泛型没有多态
		
//		test4(new Student<Apple>());//<=
		test4(new Student<Object>());
		test4(new Student<Fruit>());
//		test4(new Student<stu>());//使用时确定类型
	}
	public static void test(Student<?> stu){
		
	}
	//<=
	public static void test2(Student<? extends Fruit> stu){
		
	}
	//>=
	public static void test4(Student<? super Fruit> stu){
		
	}
	public static void test3(Student<Fruit> stu){
		
	}
}
