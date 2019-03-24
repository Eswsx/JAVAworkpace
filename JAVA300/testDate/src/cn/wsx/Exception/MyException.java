package cn.wsx.Exception;
/**
 * 
 * @author Es无语中
 *
 */
public class MyException extends Exception{
	
	public MyException(){
		
	}
	
	public MyException(String message){
		super (message);//super 调最近的父类应用
		
		
	}
}

class TestMyException{
	void test()throws MyException{
		
	}
	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}