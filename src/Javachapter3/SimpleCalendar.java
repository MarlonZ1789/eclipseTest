package Javachapter3;

import java.util.Scanner;

public class SimpleCalendar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year,month,day;
		year = -1;
		month = -1;
		day = -1;
		System.out.print("�������:");
		year = input.nextInt();
		System.out.print("�����·�:");
		month = input.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:	
		case 6:	
		case 9:	
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			//���������
			boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
			if(isLeapYear) {
				day++;
				}
			break;
		default:
			System.err.println("�����·ݲ��Ϸ���");
			System.exit(0);
		}
		System.out.println(year+"��"+month+"��"+day+"��");

		}
	}


