package hello;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
//		System.out.println(2+3 + "= 2 + 3 = " + (2+3));
//		System.out.println("100 - 23 = " + (100 - in.nextInt()));
		
//		final int price;
////		int amount = 100;
//		int amount = 100;
//		System.out.print("������Ʊ�棺");
////		println���滻�� print���治����
//		amount = in.nextInt();
//		System.out.print("�������");
//		price = in.nextInt();
//		System.out.println(amount + "-" + price + "=" +(amount - price));
		
//		int foot;
//		int inch;
//		Scanner in = new Scanner(System.in);
//		foot = in.nextInt();
//		inch = in.nextInt();
//		System.out.println((int)((foot+inch/12.0)*0.3048*100));//ǿ������ת����(int)
		
		Scanner in = new Scanner(System.in);
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		
		System.out.println("���㣺" + (amount - 10));
	}

}
