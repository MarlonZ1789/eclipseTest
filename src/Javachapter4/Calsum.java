package Javachapter4;

import java.util.Scanner;

public class Calsum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������num:");
		int num = input.nextInt();   //Ҫ��ֵ���������
		int Tempnum = num;
		int i = 0;     //ѭ������
		int sum = 0;   //�ۼӺ�
		while(Tempnum >0) {
			sum += Tempnum % 10;
			Tempnum /= 10;
		}
		//��ӡ���
		System.out.println(num + "�ĸ�λ�����ۼ�֮��Ϊ" + sum);
	}

}
