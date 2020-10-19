import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		
		
		System.out.print("점(x,y)의 정수를 입력하시오>>>");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(((x>=100) && (x<=200)) && ((y>=100) && (y<=200) ))
				System.out.println("("+ x + "," +y+ ")는 사각형 안에 있습니다.");
			
		else	
				System.out.println("("+ x + "," +y+ ")는 사각형 안에 없습니다.");
		
	}
}
