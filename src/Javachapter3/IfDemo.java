package Javachapter3;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		//使用程序判断用户输入的字符是否是合法的硬盘盘符
		Scanner input = new Scanner(System.in);
		System.out.print("请输入硬盘盘符:");
		char ch = input.next().charAt(0);
		if(ch>='A' && ch<='Z') //等价写法:!(ch<'A' || ch>'Z')
		{
			System.out.println("输入的盘符是合法盘符");
		}
		else {
			System.err.println("输入的盘符是非法盘符");
		}
	}

}
