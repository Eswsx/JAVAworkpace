package cn.es.oop.polymorphism.myServlet;

public class HttpsServlet {
	public void service(){
		System.out.println("HttpsServlet.service()");
		doGet();
	}
	
	public void doGet(){
		System.out.println("HttpsServlet.doGet()");
		
	}
	

}
