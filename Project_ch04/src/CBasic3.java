import java.util.Scanner;

//goods2
public class CBasic3 {

	public static void main(String[] args) {
		// System.out.print("���������� �Է��϶�>>");
		// Scanner sc = new Scanner(System.in);
		// int b=sc.nextInt();

		Goods2[] ga = new Goods2[3];//������ 3�� ����

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < ga.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int a = s.nextInt();
			int sold = s.nextInt();

			// ��ü �迭(ga)�� �� ����(ex.ga[0],ga[1],ga[2]d�� ��ü (new Goods(name,price,n,sold);�� �����
			// �ִ´�
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
