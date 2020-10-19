package java0923;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");

		// 예외처리
		int a = 10, b = 0, c = 0;

		int[] arrNum = { 1, 2, 3 };

		String str = null;

		try {
			// 문장들....
//			c = a / b;

			System.out.println(str.length());
			// 문장들....

			arrNum[5] = 50;

			// 문장들.... c에서 예외 발생하면 바로 캐치로 넘어감
		} catch (ArithmeticException e) {
			e.printStackTrace(); // 어떤 예외인지 출력
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (RuntimeException e) { // 무조건 강제하지 않을 경우runtime을 사용
			e.printStackTrace();
		} catch (Exception e) { // 예외 처리를 무조건 강제하는 경우 exception사용
			e.printStackTrace();
		}
		
		

		System.out.println("c = " + c);

		System.out.println("=== 프로그램 종료 ===");
	} // main
}
