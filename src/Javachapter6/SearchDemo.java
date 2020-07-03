package Javachapter6;

import java.util.Scanner;

public class SearchDemo {
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
		
		//用户输入要查找的数字
		//循环查找,遍历数组，打印下标
		System.out.print("请输入要查找的元素:");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;	//要查找的下标
		//循环查找
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				//System.out.println("要查找的元素的对应下标为:" + i);
				searchIndex = i;
				break;
			}
		}
		//循环后进行判断
		if (searchIndex == -1) {
			System.err.println("要查找的元素不存在");
		}else {
			System.out.println("要查找的元素的对应下标为:" + searchIndex);
		}

	}

}
