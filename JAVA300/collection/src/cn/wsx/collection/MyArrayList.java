package cn.wsx.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList,帮助理解ArrayList类的底层结构
 * @author Es无语中
 *
 */
public class MyArrayList/*implements List*/ {
	
	private Object[] elementDate;
	private int size;
	
	
	public MyArrayList(){
		this(10);
	}
	public MyArrayList(int initalCapacity){
		if(initalCapacity<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		elementDate  = new Object[initalCapacity];
	}
	public void add (Object obj){
		elementDate[size++] = obj;
		
	}
}
