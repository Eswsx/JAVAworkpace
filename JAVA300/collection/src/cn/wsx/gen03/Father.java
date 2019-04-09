package cn.wsx.gen03;
/**
 * 父类为泛型
 * 1.属性
 * 2.方法
 * 要么同时擦除，要么子类大于等于父类的类型，
 * 不能子类擦除，父类泛型
 * 1.属性类型
 * 父类中，随父类定
 * 子类中，随子类定
 * 2.方法重写:
 * 随父类而定
 * @author Es无语中
 *
 * @param <T>
 */
public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);
}

/**
*子类声明时指定具体类型
*属性类型为具体类型
*方法同理
*/
class Child extends Father<String,Integer>{
	String t2;
	@Override
	public void test(String t) {	
	}
	
}
/**
 * 子类为泛型，类型在使用时确定
 * @author Es无语中
 *
 */
class Child2<T1,T> extends Father<T,T1>{
	T1 t2;
	@Override
	public void test(T t) {	
	}
}
/**
 * 子类为泛型类，父类不指定类型,泛型的擦除，使用Object替换
 */
class Child3<T1,T> extends Father{

	@Override
	public void test(Object t) {
		// TODO 自动生成的方法存根	
	}
}
/**
 * 子类与父类同时擦除
 */
class Child4 extends Father{

	@Override
	public void test(Object t) {
		
	}
}
/**
 * 错误：子类擦除，父类使用泛型

class Child5 extends Father<T,T1>{

	@Override
	public void test(cn.wsx.gen03.T t) {
		// TODO 自动生成的方法存根
		
	}

	
}
*/
