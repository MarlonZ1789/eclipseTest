package Javachapter6;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		//�������һ�����飬�������е����ֵ����Сֵ
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] =((int)(Math.random() * 101)) ; 
			
		}
		System.out.println("����Ԫ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		
		//�û�����Ҫ���ҵ�����
		//ѭ������,�������飬��ӡ�±�
		System.out.print("������Ҫ���ҵ�Ԫ��:");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;	//Ҫ���ҵ��±�
		//ѭ������
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				//System.out.println("Ҫ���ҵ�Ԫ�صĶ�Ӧ�±�Ϊ:" + i);
				searchIndex = i;
				break;
			}
		}
		//ѭ��������ж�
		if (searchIndex == -1) {
			System.err.println("Ҫ���ҵ�Ԫ�ز�����");
		}else {
			System.out.println("Ҫ���ҵ�Ԫ�صĶ�Ӧ�±�Ϊ:" + searchIndex);
		}

	}

}
