package cn.wsx.Exception;
/**
 * 直接将异常抛出，谁使用谁处理异常
 * 声明异常原则：
 * 1.父类没有声明异常，子类也不能
 * 2.不可抛出原有方法异常类的父类或上层类
 * 3.抛出异常类型的数目不可以比原有的方法抛出的还多（不是指个数，指类型）
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException5 {

	public static void main(String[] args) {
		String str = null;
		try {
			str = new TestException5().openFile1();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(str);
	}
	
	String openFile1() throws IOException{
		
		FileInputStream reader = new FileInputStream("D:/JAVAworkpace/JAVA300/af.txt");//checked!
		char c = (char)reader.read();
		System.out.println(c);
		return""+c;
	}
}
