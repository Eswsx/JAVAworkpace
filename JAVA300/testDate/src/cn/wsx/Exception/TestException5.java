package cn.wsx.Exception;
/**
 * ֱ�ӽ��쳣�׳���˭ʹ��˭�����쳣
 * �����쳣ԭ��
 * 1.����û�������쳣������Ҳ����
 * 2.�����׳�ԭ�з����쳣��ĸ�����ϲ���
 * 3.�׳��쳣���͵���Ŀ�����Ա�ԭ�еķ����׳��Ļ��ࣨ����ָ������ָ���ͣ�
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
			// TODO �Զ����ɵ� catch ��
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
