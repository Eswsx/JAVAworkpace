package cn.wsx.Exception;
/**
 * 执行顺序：
 * 1.执行try/catch给返回值
 * 2.执行finally
 * 3.return
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExcepution4 {

	public static void main(String[] args) {
		String str = new TestExcepution4().openFile();
		System.out.println(str);
	}
	
	String openFile(){
		try {
			System.out.println("aaa");
			FileInputStream fis = new FileInputStream("D:/JAVAworkpace/JAVA300/af.txt");//checked!
			int a = fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching!!!!");
			e.printStackTrace();
			return"step2";
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return"step3";
		}finally{
			System.out.println("finally!!!");//不要在Finally里使用return，会覆盖前面的return语句的值
		}
	}
}
