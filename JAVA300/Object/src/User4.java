/**
 * 
 * 测试传参机制
 * @author Es无语中
 *
 */
public class User4 {
	int id ;
	String name;
	String pwd;
	
	public User4(int id,String name){
		this.id = id;
		this.name = name;
		
	}
	public void testParameterTransfer01(User4 u){
		u.name = "008";
	}
	
	public void testParameterTransfer02(User4 u){
		u = new User4(200,"00010");
	}
	
	public static void main(String[] args){
		User4 u1 = new User4(200,"00065");
		
		u1.testParameterTransfer01(u1);//此处传参 u1里放的是u1对象的地址
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
	}
}
