package cn.wsx.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList,�������ArrayList��ĵײ�ṹ
 * @author Es������
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		elementDate  = new Object[initalCapacity];
	}
	public void add (Object obj){
		elementDate[size++] = obj;
		
	}
}
