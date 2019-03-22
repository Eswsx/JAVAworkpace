package cn.wsx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author Es无语中
 *
 */
public class VisualCanlendar {
	public static void main(String[] args) {
		System.out.println("Please enter the date:XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		String temp = input;
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i=0;i<calendar.get(calendar.DAY_OF_WEEK)-1;i++){
				System.out.print("\t");
			}
			for(int i=1;i<maxDate;i++){
					System.out.print(i);
					if(i == day){
						System.out.print("*");
					}
					System.out.print("\t");
					int w = calendar.get(Calendar.DAY_OF_WEEK);
					if(w == Calendar.SATURDAY){
						System.out.print("\n");
					}
					calendar.add(Calendar.DATE,1);
				}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
}
