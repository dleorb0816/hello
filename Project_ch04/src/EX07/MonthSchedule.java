package EX07;

import java.util.Scanner;

public class MonthSchedule {
	//�������
	int day;
	Day days[];//������ ������ߵ�
	Scanner sc = new Scanner(System.in);

	public MonthSchedule(int day) {
		this.day = day;
		this.days = new Day[day];
		boolean state = true;
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();// ��ü�迭 ����
		}
	}

	private void input() {
		System.out.print("��¥(1~" + day + ")?");
		int day = sc.nextInt();
		System.out.print("����(��ĭ���� �Է�)?");
		String works = sc.next();
		days[day - 1].set(works);
	}

	private void view() {
		System.out.print("��¥(1~" + day + ")?");
		int day = sc.nextInt();
		System.out.print(day + "�� ������ ");
		days[day - 1].show();
	}

	private void finish() {
		System.out.print("���α׷��� �����մϴ�");
		sc.close();
	}

	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");

		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)>> ");

			int a = sc.nextInt();
			switch (a) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;

			}
		}
	}

}
