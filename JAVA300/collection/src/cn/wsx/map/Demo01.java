package cn.wsx.map;

import java.util.HashMap;
import java.util.Map;

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
	}
}
