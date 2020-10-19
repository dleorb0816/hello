import java.util.Scanner;

//goods2
public class CBasic3 {

	public static void main(String[] args) {
		// System.out.print("몇종류인지 입력하라>>");
		// Scanner sc = new Scanner(System.in);
		// int b=sc.nextInt();

		Goods2[] ga = new Goods2[3];//공간을 3개 만듬

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < ga.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int a = s.nextInt();
			int sold = s.nextInt();

			// 객체 배열(ga)의 각 원소(ex.ga[0],ga[1],ga[2]d에 객체 (new Goods(name,price,n,sold);를 만들어
			// 넣는다
			ga[i] = new Goods2(name, price, a, sold);

		}

		for (int i = 0; i < ga.length; i++) {
			System.out.print(ga[i].getName() + " ");
			System.out.print(ga[i].getPrice() + " ");
			System.out.print(ga[i].getNumberOfStock() + " ");
			System.out.println(ga[i].getSold() + " ");
		}
	}
}
