import java.util.Scanner;

public class ch02_13 {

	public static void main(String[] args) {
		char grade='A';
		
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("참 잘하였습니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("좀더 노력 하세요.");
			break;
		case 'F':
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");
		}
	}
}