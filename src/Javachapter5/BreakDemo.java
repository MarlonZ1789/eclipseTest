package Javachapter5;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		int exp = 0;   //个人贡献度
		int sum = 0;   //个人总贡献度
		for (;;) {//死循环
			System.out.print("请输入本次的贡献度:");
			exp = new Scanner(System.in).nextInt();//匿名的方式调用对象方法
			if(exp < 0) {//贡献度为负跳出循环
				System.err.println("个人贡献度不能为负");
				break;
			}
			sum += exp;
		}
		System.out.println("您输入的贡献度总数为:" + sum);
	}

}
