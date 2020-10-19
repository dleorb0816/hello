
public class ch03_3 {

	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char) (a+1);
		} while (a<='z');
	}
}