import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5","컴퓨터 구조","안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		for(; ; ) {
		System.out.print("과목 이름>>");
		String name = sc.next();
		
		if(name.equals("그만")) {
			break;
		}
		
		boolean bSame=false;
		int i=0;
		for(i= 0;i<5;i++) {
			if(course[i].equals(name)) {
				int n = score[i];
				System.out.println(course[i] + "의 점수는 " +n);
				bSame = true;
				break;
			}
			if(i==4)//다돌았을때 
				{
				System.out.println("없는 과목");
			}
		}

		}
	}
}