package Javachapter7;

import java.util.Scanner;

public class WeekDayDemo {
	public static void main(String[] args) {
		System.out.print("���������������:");
		int dayOfWeek = new Scanner(System.in).nextInt();
		//����
		ShowWeekDayByChinese(dayOfWeek - 1);
		//����
		ShowWeekDayByJapanese(dayOfWeek - 1);
		//Ӣ��
		ShowWeekDayByEnglish(dayOfWeek - 1);
		

		//�������Դ�ӡ
	}
	
	private  static boolean isValid(int dayOfWeek) {
		if (dayOfWeek < 1 || dayOfWeek > 7) {
			//System.err.println("������󣬱�������1-7������");
			return false;
		}
		return true;
	}
	
	public  static void ShowWeekDayByChinese(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("������󣬱�������1-7������");
			return;
		}
		String[] weekdays = {"����һ","���ڶ�","������","������","������","������","������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public  static void ShowWeekDayByJapanese(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("������󣬱�������1-7������");
			return;
		}
		String[] weekdays = {"������","������","ˮ����","ľ����","������","������","������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public  static void ShowWeekDayByEnglish(int dayOfWeek) {
		if (!isValid(dayOfWeek + 1)) {
			System.err.println("������󣬱�������1-7������");
			return;
		}
		String[] weekdays = {"Monday","Thesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}

}
