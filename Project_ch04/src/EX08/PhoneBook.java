package EX08;

import java.util.Scanner;

public class PhoneBook {
	Scanner s = new Scanner(System.in);
	int num;
	phone phones[];
	String name;
	String tel;
	
	public void get_num() {
		System.out.print("�ο���>>");
		num = s.nextInt();
		phones = new phone[num];
	}
	
	public void getInfo() {
		for(int i = 0; i<num;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name=s.next();
			tel = s.next();
			phones[i]= new phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public void serch() {
		while(true) {
			boolean state= false;
			System.out.print("�˻��� �̸�>>");
			name= s.next();
			
			if(name.equals("�׸�")) {
				break;
			}
			
			for(int i =0; i<num;i++) {
				if(name.equals(phones[i].getName())) {
					System.out.print(name+"�� ��ȣ��" + phones[i].getTel() +"�Դϴ�.");
					state = true;
				}
			}
				if(state == false)
					System.out.println(name+"�� �����ϴ�.");
				
			}
		}
	}
