package Javachapter5;

public class CalendarJuly {
	public static void main(String[] args) {
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		System.out.print("\t");
		//System.out.print("1\t2\t3\t4\t5\t6\n");
		
		int dayOfMonth = 31;   //1997��7����31��
		for (int i = 1; i < dayOfMonth; i++) {
			System.out.print(i);
			//�ж�������\n
			if((i + 1) % 7 == 0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
		
	}

}
