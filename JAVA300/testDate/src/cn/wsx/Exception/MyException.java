package cn.wsx.Exception;
/**
 * 
 * @author Es������
 *
 */
public class MyException extends Exception{
	
	public MyException(){
		
	}
	
	public MyException(String message){
		super (message);//super ������ĸ���Ӧ��
		
		
	}
}

class TestMyException{
	void test()throws MyException{
		
	}
	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}