package cn.es.oop.testInterface;
/**
 * 接口类似于目录
 * 一个类可实现多个接口
 * 接口支持多继承
 * @author Es无语中
 *
 */
public interface MyInterface {
	//接口中只有：常量、抽象方法
	/*public static final*/String MAX_GREAD = "BOSS";//定义的常量
	int MAX_SPEED = 120;
	
	/*public abstract*/public void test01();//只能public
	public int test02(int a,int b);
}

 interface test1{
	public void say();
}
