package Javachapter6;

import java.util.Scanner;

public class SortDemo {
	public static void main(String[] args) {
		//һ���Ƚ�����Ԫ�ظ���-1��
		//ÿһ�ֱȽϴ�������һ����1��
		System.out.print("������������ֵ:");
		Scanner input = new Scanner(System.in);
		int[] nums = new int[8];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		System.out.println("����Ԫ��:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		int temp;	//��ʱ����
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		
		//��ӡ���
		System.out.println("�����:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}

	}

}
