package Javachapter5;

public class DoubleFor {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");//��ӡ" ",������
			}
			//��ӡ��" "���ٴ�ӡ�Ǻ�
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//���ѭ�����ƵĻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");//��ӡ" ",������
			} 
			//��ӡ��" "���ٴ�ӡ�Ǻ�
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//���ѭ�����ƵĻ���
		}
		/*
		 * char ch = 'A'; for (int i = 0; i < 4; i++) { for (int j = 0; j <= 2 - i; j++)
		 * { System.out.print(" ");//��ӡ" ",������ } //��ӡ��" "���ٴ�ӡ�Ǻ� for (int j = 0; j <= 2
		 * * i; j++) { System.out.print((char)ch); } ch++;
		 * System.out.println();//���ѭ�����ƵĻ��� } for (int i = 0; i < 3; i++) { for (int j =
		 * 0; j <= i; j++) { System.out.print(" ");//��ӡ" ",������ } //��ӡ��" "���ٴ�ӡ�Ǻ� for
		 * (int j = 0; j <= 4 - 2 * i; j++) { System.out.print((char)ch); } ch++;
		 * System.out.println();//���ѭ�����ƵĻ��� }
		 */
		/*
		 * for (int i = 0; i < 4; i++) { for (int j = 0; j <= 2 - i; j++) {
		 * System.out.print(" ");//��ӡ" ",������ } //��ӡ��" "���ٴ�ӡ�Ǻ� for (int j = 0; j <= 2 *
		 * i; j++) { System.out.print("*"); } System.out.println();//���ѭ�����ƵĻ��� } for
		 * (int i = 0; i < 3; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print(" ");//��ӡ" ",������ } //��ӡ��" "���ٴ�ӡ�Ǻ� for (int j = 0; j <= 4 -
		 * 2 * i; j++) { System.out.print("*"); } System.out.println();//���ѭ�����ƵĻ��� }
		 */
	}

}
