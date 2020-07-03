package Javachapter3;

import java.util.Scanner;

public class SymbleDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈënum1\t");
		System.out.print("ÇëÊäÈënum2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int result = num1 > num2 ? 90 : 80;
		System.out.println(result);
		/*
		 * num1++; int result1 = num1++; ++num2; int result2 = ++num2;
		 * System.out.println(result1); System.out.println(num1);
		 * System.out.println(result2); System.out.println(num2);
		 */
	}

}
