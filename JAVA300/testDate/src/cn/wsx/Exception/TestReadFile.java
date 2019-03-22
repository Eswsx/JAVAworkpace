package cn.wsx.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.F2D;

public class TestReadFile {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("D:/JAVAworkpace/JAVA300/a.txt");
			char c = (char)reader.read();
			char c2 = (char)reader.read();
			System.out.println(""+c+c2);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();//Catch捕获异常时的捕获顺序：如果异常类之间有继承关系，
			//在顺序安排上需注意。越是顶层的类，越放在下面。再不然就直接把多余的catch省略。
		}finally{
			try {
				if(reader != null){			
					reader.close();//关闭资源
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
