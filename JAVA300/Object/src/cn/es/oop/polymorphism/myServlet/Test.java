package cn.es.oop.polymorphism.myServlet;

public class Test {
	public static void main(String[] args) {
		HttpsServlet s = new MyService();
		s.service();
//		���Ϊ��
//		HttpsServlet.service()
//		MyServlet.doGet()
//		����ʱ����thisָ������
	}
}
