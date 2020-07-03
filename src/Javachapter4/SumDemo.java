package Javachapter4;

public class SumDemo {
	public static void main(String[] args) {
		int i = 1; 
		int sum = 0;  //累加和
		while(i <= 100) {
			//sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println("1-100的累加和为"+ sum);
	}

}
