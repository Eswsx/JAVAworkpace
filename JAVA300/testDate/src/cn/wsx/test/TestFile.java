package cn.wsx.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("d:/algorithms/Labview/1.vi");
		File f2 = new File("d:/algorithms/Labview/");
		File f3 = new File(f2,"1.vi");
		File f4 = new File(f2,"test");
		File f5 = new File("d:/algorithms/dd");//ֻ�ܴ�������Ŀ¼
		File f6 = new File("d:/algorithms/d/aa/ss/d/d");
		f5.mkdir();
		f6.mkdirs();
//		try {
//			f4.createNewFile();
//		} catch (IOException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}
//		f4.delete();
		if(f.isFile()){
			System.out.println("��һ���ļ�");
		}
		if(f2.isDirectory()){
			System.out.println("��һ��Ŀ¼");
		}
	}
	
}
