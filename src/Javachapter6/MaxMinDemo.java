package Javachapter6;

public class MaxMinDemo {
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
		//�������е����ֵ����Сֵ
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("�����е����ֵΪ:" + max);
		System.out.println("�����е���СֵΪ:" + min);
		/*
		 * int min = nums[0]; for (int i = 1; i < nums.length; i++) { if (nums[i] < min)
		 * { min = nums[i]; } } System.out.println("�����е���СֵΪ:" + min);
		 */
	}

}
