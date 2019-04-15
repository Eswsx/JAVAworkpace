package cn.wsx.col;

import java.util.Iterator;

/**
 * �򻯵�����ԭ�� ����ӿ� �ṩ����
 * hasNext
 * next
 * @author Es������
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String>{
	private String[] elem = {"a","b","c","d","e","f","g"};
	private int size = elem.length;
	/**
	 * �����ڲ���
	 * @return
	 */
	public Iterator<String> iterator(){
		return new Iterator <String>(){
			
			private int cursor = -1;
			/**
			 * �ж��Ƿ�����¸�Ԫ��
			 * 
			 */
			public boolean hasNext(){
				
				return cursor+1<size;
			}
			/**
			 * ��ȡ��һ��Ԫ��
			 */
			public String next(){
				cursor++;//�ƶ�һ��
				return elem[cursor];
			}
			//ɾ��Ԫ��
			public void remove(){
				//û��ʵ��
			}
		};
	}
	public static void main(String[] args) {
		MyArrayList3 list = new MyArrayList3();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();//ɾ��Ԫ��
		}
		System.out.println("��ǿfor������ʵ��java.lang.Iterrable�ӿڣ���дiterrator����");
		for(String temp:list){
			System.out.println(temp);
		}
	}
}