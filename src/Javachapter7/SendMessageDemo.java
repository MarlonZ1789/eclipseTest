package Javachapter7;

/**
 * @author legendZHANG0915
 * @2020��3��2������10:35:38
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
		//SendMessage("user", "����", "����", 5, 1);
		
		SendMessage("��");
	}
	/**
	 * ���صĺ����������û��ṩĬ�ϲ������ɽ���Ĭ�Ϻ���
	 * @param nickName
	 */
	public static void SendMessage(String nickName) {
		String[] contents = {
				"1**",
				"2**",
				"3**"
		};
		SendMessage(nickName,"Ĭ��Ƶ��",contents[(int)(Math.random() * 2)],10,1);
	}
	/**
	 * ʵ����Ϸ�еĺ�������
	 * @param name				�����ߵ��ǳ�
	 * @param channelname		������Ƶ��
	 * @param message			����������
	 * @param count				�����Ĵ���
	 * @param interval			������ʱ��������λ���룩
	 */
	public static void SendMessage(String name,String channelname,String message,int count,int interval) {
		if (interval < 5) interval = 5;
		//ƴ���ַ����Ժ��ӡ
		String value = String.format("��%s��%s:%s", channelname,name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval * 1000);//���Լ��
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
