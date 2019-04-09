package cn.wsx.gen03;
/**
 * 泛型接口:与继承同理
 * 重写方法随父类而定
 * @author Es无语中
 *
 * @param <T>
 */
public interface Comparable<T> {
	void compare(T t);
}
//声明子类指定类型
class Comp implements Comparable<Integer>{

	@Override
	public void compare(Integer t) {
		// TODO 自动生成的方法存根
		
	}
}
//擦除
class Comp1 implements Comparable{

	@Override
	public void compare(Object t) {
		// TODO 自动生成的方法存根
		
	}
	
}
//父类擦除，子类泛型
class Comp2<t> implements Comparable{

	@Override
	public void compare(Object t) {
		// TODO 自动生成的方法存根
		
	}
	
}
//子类泛型>=父类泛型
class Comp3<T> implements Comparable<T>{

	@Override
	public void compare(T t) {
		// TODO 自动生成的方法存根
		
	}
	
}
//父类泛型，子类泛型错误