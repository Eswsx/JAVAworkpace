package cn.wsx.Exception;
/**
 * �Ҽ����try/catch
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
