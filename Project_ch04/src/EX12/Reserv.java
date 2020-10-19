package EX12;

import java.util.Scanner;

public class Reserv {
	Scanner sc = new Scanner(System.in);
	private Seat s[];
	private String SeatGrade[] = {"S", "A", "B"};
	
	public Reserv() {
		s = new Seat[3];
		for(int i=0; i<s.length;i++) {
			s[i]= new Seat();//객체 만들기
		
		}
	}
	
	public void Reserve() {
		System.out.print("좌석 구분 S(1), A(2),B(3)>>");
		int grade = sc.nextInt();
		System.out.print(SeatGrade[grade-1]+">>");
		s[grade-1].show();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		s[grade-1].set(name, num);
	}
	
	public void check() {
		for(int i = 0; i<s.length; i++) {
			System.out.print(SeatGrade[i]+">>");
			s[i].show();
		}
		System.out.println("<<조회를 완료하였습니다.>>");
	}
	
	public void cancel() {
		System.out.print("좌석 S :1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(SeatGrade[grade-1]+">>");
		s[grade-1].show();
		
		System.out.print("이름>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reset(name);
		if(result==true) {
			System.out.println("취소 완료");
		}
		else {
			System.out.println("존재하지 않는 정보");
		}
	}
	
	
	public void finish() {
		sc.close();
	}
	
	public void run() {
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			
			int a = sc.nextInt();
			switch(a) {
			case 1:
				Reserve();
				break;
				
			case 2:
				check();
				break;
			
			case 3:
				cancel();
				break;
				
			case 4:
				finish();
				break;
			}
		}
	}
}
