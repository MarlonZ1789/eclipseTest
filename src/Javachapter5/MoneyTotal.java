package Javachapter5;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double money = -1;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "位玩家的消费金额");
			money = input.nextDouble();
			if (money >=500) 
				continue;   //跳过if情况，次数累加，直到下次循环
			count++;
			
			/*
			 * if(money < 500) { count++; }
			 */
		}
		System.out.println("消费金额小于500的总数为:" + count);
	}

}
