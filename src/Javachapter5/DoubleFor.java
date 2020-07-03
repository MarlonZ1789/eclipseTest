package Javachapter5;

public class DoubleFor {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");//打印" ",不换行
			}
			//打印完" "后，再打印星号
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//外层循环控制的换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");//打印" ",不换行
			} 
			//打印完" "后，再打印星号
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//外层循环控制的换行
		}
		/*
		 * char ch = 'A'; for (int i = 0; i < 4; i++) { for (int j = 0; j <= 2 - i; j++)
		 * { System.out.print(" ");//打印" ",不换行 } //打印完" "后，再打印星号 for (int j = 0; j <= 2
		 * * i; j++) { System.out.print((char)ch); } ch++;
		 * System.out.println();//外层循环控制的换行 } for (int i = 0; i < 3; i++) { for (int j =
		 * 0; j <= i; j++) { System.out.print(" ");//打印" ",不换行 } //打印完" "后，再打印星号 for
		 * (int j = 0; j <= 4 - 2 * i; j++) { System.out.print((char)ch); } ch++;
		 * System.out.println();//外层循环控制的换行 }
		 */
		/*
		 * for (int i = 0; i < 4; i++) { for (int j = 0; j <= 2 - i; j++) {
		 * System.out.print(" ");//打印" ",不换行 } //打印完" "后，再打印星号 for (int j = 0; j <= 2 *
		 * i; j++) { System.out.print("*"); } System.out.println();//外层循环控制的换行 } for
		 * (int i = 0; i < 3; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print(" ");//打印" ",不换行 } //打印完" "后，再打印星号 for (int j = 0; j <= 4 -
		 * 2 * i; j++) { System.out.print("*"); } System.out.println();//外层循环控制的换行 }
		 */
	}

}
