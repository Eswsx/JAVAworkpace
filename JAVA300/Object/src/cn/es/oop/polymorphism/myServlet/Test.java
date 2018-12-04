package cn.es.oop.polymorphism.myServlet;

public class Test {
	public static void main(String[] args) {
		HttpsServlet s = new MyService();
		s.service();
//		结果为：
//		HttpsServlet.service()
//		MyServlet.doGet()
//		调用时所有this指向子类
	}
}
