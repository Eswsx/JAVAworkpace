import java.util.Scanner;

/**
 * 测试方法的基本使用
 * @author Es无语中
 *
 */
public class TestMethod {
	public static void main(String[] args){
		//通过对象调用普通方法
		//不能像C语言一样直接调用函数
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
		System.out.println("调用了一次。。。");
	}
	
	int add(int a,int b,int c){
		int sum;
		sum = a + b + c;
		return sum;
	}
	//方法重载
	int add(int a,int b){
		int sum;
		sum = a +b;
		return sum;
	}
	
	
}