package EX07;

import java.util.Scanner;

public class MonthSchedule {
	//멤버변수
	int day;
	Day days[];//변수명만 적어줘야됨
	Scanner sc = new Scanner(System.in);

	public MonthSchedule(int day) {
		this.day = day;
		this.days = new Day[day];
		boolean state = true;
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();// 객체배열 생성
		}
	}

	private void input() {
		System.out.print("날짜(1~" + day + ")?");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		String works = sc.next();
		days[day - 1].set(works);
	}

	private void view() {
		System.out.print("날짜(1~" + day + ")?");
		int day = sc.nextInt();
		System.out.print(day + "의 할일은 ");
		days[day - 1].show();
	}

	private void finish() {
		System.out.print("프로그램을 종료합니다");
		sc.close();
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>> ");

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
