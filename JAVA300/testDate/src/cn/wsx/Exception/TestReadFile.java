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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();//Catch�����쳣ʱ�Ĳ���˳������쳣��֮���м̳й�ϵ��
			//��˳��������ע�⡣Խ�Ƕ�����࣬Խ�������档�ٲ�Ȼ��ֱ�ӰѶ����catchʡ�ԡ�
		}finally{
			try {
				if(reader != null){			
					reader.close();//�ر���Դ
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
