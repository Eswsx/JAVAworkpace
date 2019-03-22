package cn.wsx.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("d:/algorithms/Labview/1.vi");
		File f2 = new File("d:/algorithms/Labview/");
		File f3 = new File(f2,"1.vi");
		File f4 = new File(f2,"test");
		File f5 = new File("d:/algorithms/dd");//只能创建单个目录
		File f6 = new File("d:/algorithms/d/aa/ss/d/d");
		f5.mkdir();
		f6.mkdirs();
//		try {
//			f4.createNewFile();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		f4.delete();
		if(f.isFile()){
			System.out.println("是一个文件");
		}
		if(f2.isDirectory()){
			System.out.println("是一个目录");
		}
	}
	
}
