package Javachapter5;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		int exp = 0;   //���˹��׶�
		int sum = 0;   //�����ܹ��׶�
		for (;;) {//��ѭ��
			System.out.print("�����뱾�εĹ��׶�:");
			exp = new Scanner(System.in).nextInt();//�����ķ�ʽ���ö��󷽷�
			if(exp < 0) {//���׶�Ϊ������ѭ��
				System.err.println("���˹��׶Ȳ���Ϊ��");
				break;
			}
			sum += exp;
		}
		System.out.println("������Ĺ��׶�����Ϊ:" + sum);
	}

}
