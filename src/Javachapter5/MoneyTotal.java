package Javachapter5;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double money = -1;
		for (int i = 0; i < 5; i++) {
			System.out.println("�������" + (i + 1) + "λ��ҵ����ѽ��");
			money = input.nextDouble();
			if (money >=500) 
				continue;   //����if����������ۼӣ�ֱ���´�ѭ��
			count++;
			
			/*
			 * if(money < 500) { count++; }
			 */
		}
		System.out.println("���ѽ��С��500������Ϊ:" + count);
	}

}
