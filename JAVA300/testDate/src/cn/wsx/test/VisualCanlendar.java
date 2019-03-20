package cn.wsx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历程序
 * @author Es无语中
 *
 */
public class VisualCanlendar {
	public static void main(String[] args) {
		String temp = "2030-5-10";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			calendar.set(Calendar.DATE, 1);
			
			System.out.println(calendar.get(calendar.DAY_OF_WEEK));
			System.out.println(calendar.getActualMaximum(Calendar.DATE));
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			int j=0;
			for(int i=0;i<31;i++){
					System.out.print(i+"\t");
					j++;
					if(j%7==0){
						System.out.print("\n");
					}
				}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
}
