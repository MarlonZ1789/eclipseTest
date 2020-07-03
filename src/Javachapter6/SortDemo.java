package Javachapter6;

import java.util.Scanner;

public class SortDemo {
	public static void main(String[] args) {
		//一共比较数组元素个数-1次
		//每一轮比较次数比上一轮少1次
		System.out.print("请输入数组数值:");
		Scanner input = new Scanner(System.in);
		int[] nums = new int[8];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		System.out.println("数组元素:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		
		int temp;	//临时变量
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		
		//打印结果
		System.out.println("排序后:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}

	}

}
