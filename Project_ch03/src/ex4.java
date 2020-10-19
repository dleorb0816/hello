import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c1 = s.charAt(0);

		for (char i=c1;i>='a';i--) {

			for(char j = 'a'; j<=i;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		//System.out.println(c1);
		//System.out.println((int)c1);
		
		sc.close();
		
	}
}