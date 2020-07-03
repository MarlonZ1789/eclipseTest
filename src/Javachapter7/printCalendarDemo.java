package Javachapter7;

import java.util.Scanner;

/**
 * 使用方法打印月历
 * @author legendZHANG0915
 * @2020年4月22日下午8:02:23
 * @version 1.8
 * @copyright legendZHANG0915
 * @remark TODO
 */
public class printCalendarDemo {
	/**
	 * 用户输入的年份
	 */
	public static int year = Integer.MIN_VALUE;
	/**
	 * 用户输入的月份
	 */
	public static int month = Integer.MIN_VALUE;
	private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		printCalendar();
		//getSumDayOfYears();
		//getSumDayOfMonth();
	}

	/**
	 * 打印月历的核心方法
	 */
	public static void printCalendar() {
		// 1.让用户输入年份月份
		InputYearMonth();
		// 2.计算1900-1-1到用户输入年份月份的总天数
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum += 1;
		if (isLeapYear(year)&&month >= 3) {
			sum = sum - 2;

		}
		System.out.println(sum % 7);
		// 3.打印年份和月份（英文）
		printMonthTitle();
		// 4.打印月份title（星期一到星期日）
		// 5.根据某月1日是星期*，打印月历内容
		printCalendarContent(sum % 7);
	}
	
	/**
	 * 根据当月1日是星期*打印月历内容
	 * @param dayOfWeek
	 */
	private static void printCalendarContent(int dayOfWeek) {
		int sepCount = 0;	//\t的数量
		if (dayOfWeek == 0) {
			sepCount = 6;
		}else {
			sepCount = dayOfWeek - 1;
		}
		//dayOfWeek取值范围0-6
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month - 1]; i++) {
			System.out.print(i + 1);
			if ((dayOfWeek + i) % 7 == 0) {
				//周日
				System.out.println();

			}else {
				System.out.print("\t");	
				}
			}
		}
	
	private static void printMonthTitle() {
		String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 1900到year的总天数
	 * @param year
	 * @return
	 */
	private static int getSumDayOfYears() {
		if (year == Integer.MIN_VALUE) {
			System.err.println("未赋值年份!");  
			InputYearMonth();
		}
		int sum = 0;
		for (int i = 1900; i < year; i++) {
			sum += 365;
			if (isLeapYear(i)) {
				sum += 1;//闰年
			}
		}
		return sum; 
	}
	
	/**
	 * year1月1日到year年month-1天的总天数
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += dayOfMonth[i];
			//year年是闰年且month>=3
			if (isLeapYear(year)) {
				dayOfMonth[1] = 29; 
				if (month >= 3) {
					sum += 1;
				}
			}
			
		}
		return sum;
	}
	
	/**
	 * 判断输入的year 是否为闰年
	 * @param year
	 * @return 是闰年，返回true
	 */
	private static boolean isLeapYear(int year) {
		return   year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ;
	}
	
	/**
	 * 接收用户输入的年份月份
	 */
	private static void InputYearMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		 year = input.nextInt();
		System.out.println("请输入月份：");
		 month = input.nextInt();
		 input.close();
		 input = null;
	}

}
