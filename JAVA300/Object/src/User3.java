/**
 * 
 * 测试静态初始化块的使用
 * @author Es无语中
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	static String company;
	
	static{//在项目启动的时候就初始化
		System.out.println("执行类的初始化工作");
		company = "宇宙有限公司";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
	}
	public static void main(String[] args){
		User3 u3 = null;
	}
}
