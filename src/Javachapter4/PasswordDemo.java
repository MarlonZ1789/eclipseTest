package Javachapter4;

import java.util.Scanner;

public class PasswordDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String PASSWORD = "123456";//常量
		String password = null;  //密码
		//System.out.println(password.length());
		String userName = "";
		int i = 0;
		while(i < 3) {
			System.out.print("请输入密码:");
			password = input.next();
			//if(password.equals(123456))
			i++;
			if(!PASSWORD.equals(password)) {
				if(i == 3) {
					System.err.println("密码输入错误已达三次，强制退出系统！");
					System.exit(0);
				}
			}else {
				i = 4;
			}
		}
		System.out.println("密码正确，成功登陆系统");
	}

}
