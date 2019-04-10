package cn.wsx.gen4;
/**
 * 泛型没有多态
 * @author Es无语中
 *
 */
public class APP {
	public static void main(String[] args) {
//		A<Fruit> f  = new A <APP>();
		A<Fruit> f = new A<Fruit>();
	}
	//形参使用多态
		public static void test(A<Fruit> f){
			
		}
		//返回类型使用多态
		public static A<Fruit> test2(){
//			return new A<Apple>();
		return null;
		}
}
