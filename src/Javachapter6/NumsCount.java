package Javachapter6;

public class NumsCount {
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

		int count1 = 0,count2 = 0;   //奇数和偶数的个数
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count2++;
			}else {
				count1++;
			}
		}
		System.out.println("数组中有"+ count1 +"个奇数");
		System.out.println("数组中有"+ count2 +"个偶数");
	}

}
