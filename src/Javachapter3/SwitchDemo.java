package Javachapter3;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;   //保存用户选择
		
		System.out.println("1、登录游戏");
		System.out.println("2、退出游戏");
		choice = input.nextInt();
		if (choice == 1) //进入主菜单
		{
			System.out.println("1、传音入密");
			System.out.println("2、举目四望");
			System.out.println("3、会会老友");
			System.out.println("4、自我欣赏");
			System.out.println("5、观察地形");
			System.out.println("6、到此一游");
			System.out.print("请输入选择:");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("笑傲江湖>会会老友");
				System.out.println("1、显示所有好友信息");
				System.out.println("2、添加好友");
				System.out.println("3、删除好友");
				System.out.println("4、修改好友信息");
				System.out.println("5、查找好友");
				System.out.print("请输入选择:");
				choice = input.nextInt();
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("笑傲江湖>观察地形");
				System.out.println("1、查看敌情");
				System.out.println("2、切磋武艺");
				System.out.println("3、浏览武器店");
				System.out.println("4、光顾防具店");
				System.out.println("5、充值送元宝");
				System.out.print("请输入选择:");
				choice = input.nextInt();
				break;
			case 6:
				
				break;
			default:
				System.err.println("输入错误，必须输入1-6的整数");
				System.exit(0);
				//break;
			}
		}else if(choice == 2) //退出游戏
		{
			System.exit(0);  //正常退出程序
		}else {
			System.err.println("输入错误，游戏已退出!");
		}
	}

}
