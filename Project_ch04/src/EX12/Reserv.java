package EX12;

import java.util.Scanner;

public class Reserv {
	Scanner sc = new Scanner(System.in);
	private Seat s[];
	private String SeatGrade[] = {"S", "A", "B"};
	
	public Reserv() {
		s = new Seat[3];
		for(int i=0; i<s.length;i++) {
			s[i]= new Seat();//��ü �����
		
		}
	}
	
	public void Reserve() {
		System.out.print("�¼� ���� S(1), A(2),B(3)>>");
		int grade = sc.nextInt();
		System.out.print(SeatGrade[grade-1]+">>");
		s[grade-1].show();
		System.out.print("�̸� >>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		s[grade-1].set(name, num);
	}
	
	public void check() {
		for(int i = 0; i<s.length; i++) {
			System.out.print(SeatGrade[i]+">>");
			s[i].show();
		}
		System.out.println("<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>");
	}
	
	public void cancel() {
		System.out.print("�¼� S :1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(SeatGrade[grade-1]+">>");
		s[grade-1].show();
		
		System.out.print("�̸�>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reset(name);
		if(result==true) {
			System.out.println("��� �Ϸ�");
		}
		else {
			System.out.println("�������� �ʴ� ����");
		}
	}
	
	
	public void finish() {
		sc.close();
	}
	
	public void run() {
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			
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
