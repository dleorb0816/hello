package java0923;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("=== ���α׷� ���� ===");

		// ����ó��
		int a = 10, b = 0, c = 0;

		int[] arrNum = { 1, 2, 3 };

		String str = null;

		try {
			// �����....
//			c = a / b;

			System.out.println(str.length());
			// �����....

			arrNum[5] = 50;

			// �����.... c���� ���� �߻��ϸ� �ٷ� ĳġ�� �Ѿ
		} catch (ArithmeticException e) {
			e.printStackTrace(); // � �������� ���
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (RuntimeException e) { // ������ �������� ���� ���runtime�� ���
			e.printStackTrace();
		} catch (Exception e) { // ���� ó���� ������ �����ϴ� ��� exception���
			e.printStackTrace();
		}
		
		

		System.out.println("c = " + c);

		System.out.println("=== ���α׷� ���� ===");
	} // main
}