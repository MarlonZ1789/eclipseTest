package Javachapter3;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		//ʹ�ó����ж��û�������ַ��Ƿ��ǺϷ���Ӳ���̷�
		Scanner input = new Scanner(System.in);
		System.out.print("������Ӳ���̷�:");
		char ch = input.next().charAt(0);
		if(ch>='A' && ch<='Z') //�ȼ�д��:!(ch<'A' || ch>'Z')
		{
			System.out.println("������̷��ǺϷ��̷�");
		}
		else {
			System.err.println("������̷��ǷǷ��̷�");
		}
	}

}
