package java0924;

public class Ex4 {

	public static void main(String[] args) {
		Thread mainTread =Thread.currentThread();//���ڵ带 �����ϰ� �ִ� ������ ��ü�� �����Ѵ�

		System.out.println(mainTread.getName());	//main
		System.out.println(mainTread.getPriority());	//5
		
		System.out.println(Thread.MAX_PRIORITY);	//10
		System.out.println(Thread.NORM_PRIORITY);	//5
		System.out.println(Thread.MIN_PRIORITY);	//1
		
		
		mainTread.setPriority(7);
		
	}	//main

}
