package EX08;

import java.util.Scanner;

public class PhoneBook {
	Scanner s = new Scanner(System.in);
	int num;
	phone phones[];
	String name;
	String tel;
	
	public void get_num() {
		System.out.print("인원수>>");
		num = s.nextInt();
		phones = new phone[num];
	}
	
	public void getInfo() {
		for(int i = 0; i<num;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name=s.next();
			tel = s.next();
			phones[i]= new phone(name,tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public void serch() {
		while(true) {
			boolean state= false;
			System.out.print("검색할 이름>>");
			name= s.next();
			
			if(name.equals("그만")) {
				break;
			}
			
			for(int i =0; i<num;i++) {
				if(name.equals(phones[i].getName())) {
					System.out.print(name+"의 번호는" + phones[i].getTel() +"입니다.");
					state = true;
				}
			}
				if(state == false)
					System.out.println(name+"이 없습니다.");
				
			}
		}
	}
