package Javachapter4;

public class SumDemo {
	public static void main(String[] args) {
		int i = 1; 
		int sum = 0;  //�ۼӺ�
		while(i <= 100) {
			//sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println("1-100���ۼӺ�Ϊ"+ sum);
	}

}
