package cn.wsx.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
	public static void main(String[] args) {
		FileReader reader = null;
		try{
			reader = new FileReader("D:/JAVAworkpace/JAVA300/a.txt");
			char temp = (char)reader.read();
			System.out.println("读出的内容："+temp);
		}catch(FileNotFoundException e){
			System.out.println("文件没有找到！");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("读取文件错误！");
		}finally{
			System.out.println("不管有没有异常，肯定被执行！");
			try{
				reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
