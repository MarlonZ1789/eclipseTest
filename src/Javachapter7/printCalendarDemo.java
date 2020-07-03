package Javachapter7;

import java.util.Scanner;

/**
 * ʹ�÷�����ӡ����
 * @author legendZHANG0915
 * @2020��4��22������8:02:23
 * @version 1.8
 * @copyright legendZHANG0915
 * @remark TODO
 */
public class printCalendarDemo {
	/**
	 * �û���������
	 */
	public static int year = Integer.MIN_VALUE;
	/**
	 * �û�������·�
	 */
	public static int month = Integer.MIN_VALUE;
	private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		printCalendar();
		//getSumDayOfYears();
		//getSumDayOfMonth();
	}

	/**
	 * ��ӡ�����ĺ��ķ���
	 */
	public static void printCalendar() {
		// 1.���û���������·�
		InputYearMonth();
		// 2.����1900-1-1���û���������·ݵ�������
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum += 1;
		if (isLeapYear(year)&&month >= 3) {
			sum = sum - 2;

		}
		System.out.println(sum % 7);
		// 3.��ӡ��ݺ��·ݣ�Ӣ�ģ�
		printMonthTitle();
		// 4.��ӡ�·�title������һ�������գ�
		// 5.����ĳ��1��������*����ӡ��������
		printCalendarContent(sum % 7);
	}
	
	/**
	 * ���ݵ���1��������*��ӡ��������
	 * @param dayOfWeek
	 */
	private static void printCalendarContent(int dayOfWeek) {
		int sepCount = 0;	//\t������
		if (dayOfWeek == 0) {
			sepCount = 6;
		}else {
			sepCount = dayOfWeek - 1;
		}
		//dayOfWeekȡֵ��Χ0-6
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month - 1]; i++) {
			System.out.print(i + 1);
			if ((dayOfWeek + i) % 7 == 0) {
				//����
				System.out.println();

			}else {
				System.out.print("\t");	
				}
			}
		}
	
	private static void printMonthTitle() {
		String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"����һ","���ڶ�","������","������","������","������","������"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 1900��year��������
	 * @param year
	 * @return
	 */
	private static int getSumDayOfYears() {
		if (year == Integer.MIN_VALUE) {
			System.err.println("δ��ֵ���!");  
			InputYearMonth();
		}
		int sum = 0;
		for (int i = 1900; i < year; i++) {
			sum += 365;
			if (isLeapYear(i)) {
				sum += 1;//����
			}
		}
		return sum; 
	}
	
	/**
	 * year1��1�յ�year��month-1���������
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += dayOfMonth[i];
			//year����������month>=3
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
	 * �ж������year �Ƿ�Ϊ����
	 * @param year
	 * @return �����꣬����true
	 */
	private static boolean isLeapYear(int year) {
		return   year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ;
	}
	
	/**
	 * �����û����������·�
	 */
	private static void InputYearMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		 year = input.nextInt();
		System.out.println("�������·ݣ�");
		 month = input.nextInt();
		 input.close();
		 input = null;
	}

}
