package Javachapter4;

import java.util.Scanner;

public class MyCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result;  //������������һ���������
		num1 = 0;
		num2 = 0;
		result = 0;
		String op = "";           //���������ֵΪ���ַ���
		String  choice = null;
		do {
			System.out.println("����������������:");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			//����������
			System.out.println("�����������:");
			op = input.next();
			//������������жϽ�����Ӧ�ļ���
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
				//�жϱ������Ƿ�Ϊ0
				if(num2 == 0) {
					System.err.println("��������Ϊ0!");
					result = 0;
				}else {
					result = num1 / num2;
				}
				break;
			case "%":
					result = num1 % num2;
				break;

			default:
				System.err.println("δ֪�������");
				result = 0;
				break;
			}
			//��ӡ������
			System.out.printf("%.2f %s %.2f = %.2f\n",num1,op,num2,result);
			System.out.print("�Ƿ�������㣿(y/n)");
			choice = input.next();
			
		} while ("y".equalsIgnoreCase(choice));
	}

}
