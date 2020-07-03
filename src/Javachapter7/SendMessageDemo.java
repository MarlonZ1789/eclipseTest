package Javachapter7;

/**
 * @author legendZHANG0915
 * @2020年3月2日上午10:35:38
 * @version 1.8
 * @copyright legendZHANG0915
 * @remark TODO
 */
public class SendMessageDemo {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
			
		
		// TODO Auto-generated method stub 
		//SendMessage("user", "世界", "发言", 5, 1);
		
		SendMessage("王");
	}
	/**
	 * 重载的喊话方法，用户提供默认参数即可进行默认喊话
	 * @param nickName
	 */
	public static void SendMessage(String nickName) {
		String[] contents = {
				"1**",
				"2**",
				"3**"
		};
		SendMessage(nickName,"默认频道",contents[(int)(Math.random() * 2)],10,1);
	}
	/**
	 * 实现游戏中的喊话功能
	 * @param name				喊话者的昵称
	 * @param channelname		喊话的频道
	 * @param message			喊话的内容
	 * @param count				喊话的次数
	 * @param interval			喊话的时间间隔（单位：秒）
	 */
	public static void SendMessage(String name,String channelname,String message,int count,int interval) {
		if (interval < 5) interval = 5;
		//拼接字符串以后打印
		String value = String.format("【%s】%s:%s", channelname,name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval * 1000);//发言间隔
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
