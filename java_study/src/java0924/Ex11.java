package java0924;

public class Ex11 {

	public static void methodA(int a, int b, int c) {
		
	}
	
	public static void methodB(int... num) {	// ...은 가변인자 메소드 매개변수가 몇개들어올지 모를때 사용
		//가변인자 메소드의 매개변수는 배열이 됨
		System.out.println(num.length);//num이 배열속성이라서 .length가 가능
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println("\n");
		
	}
	
	public static void main(String[] args) {
		//Ex11.methodA();//호출하는 메소드가 같을때는 Ex11.생략가능
		methodA(10, 20, 30);
		
		methodB();
		methodB(100);
		methodB(100,200,300,400,500);
	}

}
