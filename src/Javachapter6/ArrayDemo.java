package Javachapter6;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//�����������·����ڴ�ռ���׵�ַ
		Scanner input = new Scanner(System.in);
		final int N = 5;            //����
		double[] scores;
		scores = new double[N];      //�ɼ�����
		double sum = 0,avg;
		//��̬��ֵ
		for (int i = 0; i < N; i++) {
			System.out.printf("�������%d�ſεĳɼ�:",i + 1);
			scores[i] =input.nextDouble(); 
		}
		//��ӡ���
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];

			System.out.printf("��%d�ſεĳɼ���:%.2f\n",i + 1,scores[i]);
		}
		System.out.println("�ɼ��ܺ�Ϊ:" + sum );
		System.out.printf("ƽ���ɼ�Ϊ:%.2f", sum / scores.length );
	}

}
