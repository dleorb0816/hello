package ex5_9;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("������������~~~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}

	@Override
	public void play() {
		System.out.println("���� ���");
	}

	@Override
	public void stop() {
		System.out.println("���� ����");
	}

	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ�");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��.");
	}
	
	public void schedule() {
		System.out.println("���� ���� �մϴ�");
	}
}
