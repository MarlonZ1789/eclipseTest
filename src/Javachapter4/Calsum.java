package Javachapter4;

import java.util.Scanner;

public class Calsum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入num:");
		int num = input.nextInt();   //要拆分的整形数字
		int Tempnum = num;
		int i = 0;     //循环变量
		int sum = 0;   //累加和
		while(Tempnum >0) {
			sum += Tempnum % 10;
			Tempnum /= 10;
		}
		//打印结果
		System.out.println(num + "的各位数字累加之和为" + sum);
	}

}
