package cn.wsx.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

public class TestException {
	public static void main(String[] args) {
//		int i = 1/0;
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}
		
//		Computer c = null;
//		if(c!=null){
//			c.start();//����Ϊ��null�������˶���ķ���������
//		}  
		
		
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		System.out.println(a);
		
//		String str  = "1234abcd";
//		Integer i = new Integer(str);
		
		File f = new File("D:/JAVAworkpace/JAVA300/tt.txt");
		if(!f.exists()){
			try {
				throw new FileNotFoundException("File cant be found!");
			} catch (FileNotFoundException e) {				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();//�Լ�new�Լ��׳�
			}
		}
	}
		
}
class Computer{
	void start(){
		System.out.println("�����������");
	}
}
