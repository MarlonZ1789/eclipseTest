package Javachapter7;

import java.util.Scanner;

public class WeekDayDemo {
	public static void main(String[] args) {
		System.out.print("请输入今天是星期:");
		int dayOfWeek = new Scanner(System.in).nextInt();
		//中文
		ShowWeekDayByChinese(dayOfWeek - 1);
		//日文
		ShowWeekDayByJapanese(dayOfWeek - 1);
		//英文
		ShowWeekDayByEnglish(dayOfWeek - 1);
		

		//三种语言打印
	}
	
	private  static boolean isValid(int dayOfWeek) {
		if (dayOfWeek < 1 || dayOfWeek > 7) {
			//System.err.println("输入错误，必须输入1-7的整数");
			return false;
		}
		return true;
	}
	
	public  static void ShowWeekDayByChinese(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("输入错误，必须输入1-7的整数");
			return;
		}
		String[] weekdays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public  static void ShowWeekDayByJapanese(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("输入错误，必须输入1-7的整数");
			return;
		}
		String[] weekdays = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public  static void ShowWeekDayByEnglish(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("输入错误，必须输入1-7的整数");
			return;
		}
		String[] weekdays = {"Monday","Thesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}

}
