package cn.wsx.gen02;
/**
 * 泛型类：声明时使用泛型
 * @author Es无语中
 * T Type 表示类型
 * K V 分别表示键值中的Key Value
 * E 代表Element
 * ？ 代表不确定类型
 * 使用时确定类型
 * 
 * 注意：
 * 1.泛型只能使用引用类型，不能使用基本类型
 * 2.泛型声明时，字母不能使用 静态属性|静态方法
 * 
 * 泛型的擦柱
 * 1.继承 实现声明不指定类型
 * 2.使用时 不指定类型
 * 统一Object对待
 * 1.编译器警告 消除使用Object
 * 2.不完全等同于Object，编译不会类型检查
 * @param <T>
 */
public class Student<T> {
	public static class Student1<T>{
		private T javaScore;
		private T oracleScore;
		
		public T getJavaScore() {
			return javaScore;
		}
		public void setJavaScore(T javaScore) {
			this.javaScore = javaScore;
		}
		public T getOracleScore() {
			return oracleScore;
		}
		public void setOracleScore(T oracleScore) {
			this.oracleScore = oracleScore;
		}
		
	}
	
	public static void main(String[] args) {
		//使用时指定类型（引用类型）
		Student1<String> stu = new Student1<String>();
		//1.安全：类型检查
		stu.setJavaScore("优秀");
		//2.省心：类型转换
		
		Student stu1 = new Student();
		//消除警告使用Object
		Student<Object> stu11 = new Student<Object>();
//		stu.setJavaScore("af");以Object对待
		test(stu1);//stu1相当于Object但是不完全
		//擦除不会类型检查
		test(stu11);
		test1(stu1);
		test1(stu11);
	}
	public static void test (Student<Object> a){
	}
	public static void test1(Student<?> a){
		
	}
}
