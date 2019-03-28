package cn.wsx.collection;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList,�������ArrayList��ĵײ�ṹ
 * @author Es������
 *
 */
public class MyArrayList/*implements List*/ {
	
	private Object[] elementDate;
	private int size;
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	
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
		ensureCheck();
		elementDate[size++] = obj;
		
	}
	public Object get(int index){
		rangeCheck(index);
		return elementDate[index];
	}
	public void remove(int index){
		rangeCheck(index);
		//ɾ��ָ��λ�õĶ���
		int numMoved = size - index - 1;
		if(numMoved > 0){
			System.arraycopy(elementDate, index+1, elementDate, index, numMoved);
			elementDate[--size] = null;
		}
	}
	public void add(int index ,Object obj){
		rangeCheck(index);
		ensureCheck();
		System.arraycopy(elementDate, index, elementDate, index+1, size-index);
		elementDate[index] = obj;
		size++;
	}
	
	private void rangeCheck(int index){
		if(index<0 || index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	private void ensureCheck(){
		//�������������ݿ���
		if(size == elementDate.length){
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
	}
	public void remove(Object obj){
		for(int i=0;i<size;i++){
			if(get(i).equals(obj)){//ע��ײ���õ�equals����������==
				remove(i);
			}
		}
	}
	public Object set(int index,Object obj){
		rangeCheck(index);
		Object oldValue = elementDate[index];
		elementDate[index] = obj;
		return oldValue;
	}
	
	public static void main(String[] args) {
		MyArrayList list  = new MyArrayList(3);
		list.add("sssss");
		list.add("sssss");
		list.add("ss34ss233s");
		list.add("ss333ss");
		list.add("sssss");
		list.add("sssss");
		System.out.println(list.size());
		System.out.println(list.get(6));

		
	}
}
