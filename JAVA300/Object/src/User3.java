/**
 * 
 * ���Ծ�̬��ʼ�����ʹ��
 * @author Es������
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	static String company;
	
	static{//����Ŀ������ʱ��ͳ�ʼ��
		System.out.println("ִ����ĳ�ʼ������");
		company = "�������޹�˾";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
	}
	public static void main(String[] args){
		User3 u3 = null;
	}
}
