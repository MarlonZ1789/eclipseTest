package Javachapter4;

import java.util.Scanner;

public class PasswordDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String PASSWORD = "123456";//����
		String password = null;  //����
		//System.out.println(password.length());
		String userName = "";
		int i = 0;
		while(i < 3) {
			System.out.print("����������:");
			password = input.next();
			//if(password.equals(123456))
			i++;
			if(!PASSWORD.equals(password)) {
				if(i == 3) {
					System.err.println("������������Ѵ����Σ�ǿ���˳�ϵͳ��");
					System.exit(0);
				}
			}else {
				i = 4;
			}
		}
		System.out.println("������ȷ���ɹ���½ϵͳ");
	}

}
