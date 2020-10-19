package java0924;

public class Ex4 {

	public static void main(String[] args) {
		Thread mainTread =Thread.currentThread();//이코드를 실행하고 있는 스레드 객체를 참조한다

		System.out.println(mainTread.getName());	//main
		System.out.println(mainTread.getPriority());	//5
		
		System.out.println(Thread.MAX_PRIORITY);	//10
		System.out.println(Thread.NORM_PRIORITY);	//5
		System.out.println(Thread.MIN_PRIORITY);	//1
		
		
		mainTread.setPriority(7);
		
	}	//main

}
