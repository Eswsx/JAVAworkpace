package cn.wsx.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food
 * ͳ��ÿ�����ʳ��ֵĴ���
 * 
 * �洢��map��
 * key:String
 * value:�Զ�������
 * 
 * "�ּ�"˼·
 * 1.Ϊ����key��������
 * 	 ֮�������д�Ŷ�Ӧvalue
 * 2.��һ�δ��������������ֵvalue
 * 	 �ڶ���֮��ֱ��ʹ���������ֵ
 * @author Es������
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String str = "this is a cat and that is a mice and where is the food";
		//�ָ��ַ���
		String[] strArray = str.split(" ");
		//�洢��map��
		Map<String,Letter> letters = new HashMap<>();
		for(String temp:strArray){
			/*
			 // 1.Ϊ����key��������
			if(!letters.containsKey(temp)){
				Letter col = new Letter();
				col.setCount(1);//��һ��ֵ�������
				letters.put(temp,col);
			}else{
				//2.֮�������д�Ŷ�Ӧvalue
				Letter col = letters.get(temp);//ֱ��ʹ������
				col.setCount(col.getCount()+1);
			}
			*/
			Letter col = null;
			if(null == (col = letters.get(temp))){
				col = new Letter();
				col.setCount(1);//��һ��ֵ�������
				letters.put(temp,col);
			}else{
				//2.֮�������д�Ŷ�Ӧvalue
				col.setCount(col.getCount()+1);
			}
			
		}
		//���MAP��ֵ
				Set<String> keys = letters.keySet();
				for(String key:keys){
					Letter col = letters.get(key);
					System.out.println("��ĸ:"+key+",����"+ col.getCount());
				}
	}
	public static void test01(){
		String str = "this is a cat and that is a mice and where is the food";
		//�ָ��ַ���
		String[] strArray = str.split(" ");
		//�洢��map��
		Map<String,Letter> letters = new HashMap<>();
		/**
		for(String temp:strArray){
			**
			 * 1.Ϊ����key��������
			 * 	 ֮�������д�Ŷ�Ӧvalue
			 *
			if(!letters.containsKey(temp)){
				letters.put(temp,new Letter());
			}
		}
		for(String temp:strArray){
			**
			 * 	�����д�Ŷ�Ӧvalue
			 *
			Letter col = letters.get(temp);//ֱ��ʹ������
			col.setCount(col.getCount()+1);
			
		}
		*/	
		for(String temp:strArray){
			 // 1.Ϊ����key��������
			if(!letters.containsKey(temp)){
				letters.put(temp,new Letter());
			}
			//2.֮�������д�Ŷ�Ӧvalue
			Letter col = letters.get(temp);//ֱ��ʹ������
			col.setCount(col.getCount()+1);
		}
		//���MAP��ֵ
		Set<String> keys = letters.keySet();
		for(String key:keys){
			Letter col = letters.get(key);
			System.out.println("��ĸ:"+key+",����"+ col.getCount());
		}
	}
}

