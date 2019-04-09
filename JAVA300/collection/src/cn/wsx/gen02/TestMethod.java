package cn.wsx.gen02;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法<> 返回类型前面
 * 只能访问对象的信息，不能修改信息
 * @author Es无语中
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a");
		test(1);
	}
	//泛型方法
	public static <T> void test(T a){ 
		System.out.println(a);
	}
	public static <T extends Closeable> void test(T... a){
		for (T temp:a){
			try {
				if(temp!=null){
					temp.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
