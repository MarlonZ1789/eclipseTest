package Javachapter5;

public class CalendarJuly {
	public static void main(String[] args) {
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		System.out.print("\t");
		//System.out.print("1\t2\t3\t4\t5\t6\n");
		
		int dayOfMonth = 31;   //1997年7月有31天
		for (int i = 1; i < dayOfMonth; i++) {
			System.out.print(i);
			//判断星期日\n
			if((i + 1) % 7 == 0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
		
	}

}
