import java.util.Scanner;

/**
 * ���Է����Ļ���ʹ��
 * @author Es������
 *
 */
public class TestMethod {
	public static void main(String[] args){
		//ͨ�����������ͨ����
		//������C����һ��ֱ�ӵ��ú���
		TestMethod tm = new TestMethod();
//		tm.printSxt();
//		tm.printSxt();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your three number: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int sum = tm.add(x,y,z);
		System.out.println("sum = " + sum);
		int q = tm.add(2, 3);
		int p = tm.add(6, 5, 9);
		System.out.print("2 , 3 = "+ q +" "+ p);
	}


	
	void printSxt(){
		System.out.println("������һ�Ρ�����");
	}
	
	int add(int a,int b,int c){
		int sum;
		sum = a + b + c;
		return sum;
	}
	//��������
	int add(int a,int b){
		int sum;
		sum = a +b;
		return sum;
	}
	
	
}