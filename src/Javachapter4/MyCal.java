package Javachapter4;

import java.util.Scanner;

public class MyCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result;  //两个操作数和一个结果变量
		num1 = 0;
		num2 = 0;
		result = 0;
		String op = "";           //运算符，初值为空字符串
		String  choice = null;
		do {
			System.out.println("请输入两个操作数:");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			//计算运算结果
			System.out.println("请输入运算符:");
			op = input.next();
			//根据运算符的判断进行相应的计算
			switch (op) {
			case "+":
				//System.out.println(num1 + op + num2 + "=" + (num1 + num2)
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				//判断被除数是否为0
				if(num2 == 0) {
					System.err.println("除数不能为0!");
					result = 0;
				}else {
					result = num1 / num2;
				}
				break;
			case "%":
					result = num1 % num2;
				break;

			default:
				System.err.println("未知运算符！");
				result = 0;
				break;
			}
			//打印运算结果
			System.out.printf("%.2f %s %.2f = %.2f\n",num1,op,num2,result);
			System.out.print("是否继续计算？(y/n)");
			choice = input.next();
			
		} while ("y".equalsIgnoreCase(choice));
	}

}
