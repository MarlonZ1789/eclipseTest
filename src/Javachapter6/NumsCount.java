package Javachapter6;

public class NumsCount {
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

		int count1 = 0,count2 = 0;   //������ż���ĸ���
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count2++;
			}else {
				count1++;
			}
		}
		System.out.println("��������"+ count1 +"������");
		System.out.println("��������"+ count2 +"��ż��");
	}

}
