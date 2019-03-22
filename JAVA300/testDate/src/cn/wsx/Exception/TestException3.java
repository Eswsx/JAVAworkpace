package cn.wsx.Exception;
/**
 * 右键快捷try/catch
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException3 {
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
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
