package EX10;

import java.util.Scanner;

public class DicApp {
	Scanner s = new Scanner(System.in);
	
	
	Dictionary d = new Dictionary();
	public void run() {
		
		while(true) {
			System.out.print("�ѱ۴ܾ�?");
			String word = s.next();
			
			if(word.equals("�׸�")) {
				break;
			}
			String result = Dictionary.Kor2Eng(word);
			
			if(result == null)
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			else
				System.out.println(word +"��"+result);
		}
		
	}
}
