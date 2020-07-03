package Javachapter6;

public class MaxMinDemo {
	public static void main(String[] args) {
		//随机生成一个数组，求数组中的最大值和最小值
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] =((int)(Math.random() * 101)) ; 
			
		}
		System.out.println("数组元素");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		//求数组中的最大值和最小值
		
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
		System.out.println("数组中的最大值为:" + max);
		System.out.println("数组中的最小值为:" + min);
		/*
		 * int min = nums[0]; for (int i = 1; i < nums.length; i++) { if (nums[i] < min)
		 * { min = nums[i]; } } System.out.println("数组中的最小值为:" + min);
		 */
	}

}
