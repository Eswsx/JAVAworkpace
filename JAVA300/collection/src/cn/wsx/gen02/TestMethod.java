package cn.wsx.gen02;

import java.io.Closeable;
import java.io.IOException;

/**
 * ���ͷ���<> ��������ǰ��
 * ֻ�ܷ��ʶ������Ϣ�������޸���Ϣ
 * @author Es������
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a");
		test(1);
	}
	//���ͷ���
	public static <T> void test(T a){ 
		System.out.println(a);
	}
	public static <T extends Closeable> void test(T... a){
		for (T temp:a){
			try {
				if(temp!=null){
					temp.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
