package Javachapter6;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//数组名就是新分配内存空间的首地址
		Scanner input = new Scanner(System.in);
		final int N = 5;            //常量
		double[] scores;
		scores = new double[N];      //成绩数组
		double sum = 0,avg;
		//动态赋值
		for (int i = 0; i < N; i++) {
			System.out.printf("请输入第%d门课的成绩:",i + 1);
			scores[i] =input.nextDouble(); 
		}
		//打印结果
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];

			System.out.printf("第%d门课的成绩是:%.2f\n",i + 1,scores[i]);
		}
		System.out.println("成绩总和为:" + sum );
		System.out.printf("平均成绩为:%.2f", sum / scores.length );
	}

}
