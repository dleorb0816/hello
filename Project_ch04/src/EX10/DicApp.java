package EX10;

import java.util.Scanner;

public class DicApp {
	Scanner s = new Scanner(System.in);
	
	
	Dictionary d = new Dictionary();
	public void run() {
		
		while(true) {
			System.out.print("한글단어?");
			String word = s.next();
			
			if(word.equals("그만")) {
				break;
			}
			String result = Dictionary.Kor2Eng(word);
			
			if(result == null)
				System.out.println(word+"는 저의 사전에 없습니다.");
			else
				System.out.println(word +"는"+result);
		}
		
	}
}
