package java0924;

public class Ex11 {

	public static void methodA(int a, int b, int c) {
		
	}
	
	public static void methodB(int... num) {	// ...�� �������� �޼ҵ� �Ű������� ������� �𸦶� ���
		//�������� �޼ҵ��� �Ű������� �迭�� ��
		System.out.println(num.length);//num�� �迭�Ӽ��̶� .length�� ����
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println("\n");
		
	}
	
	public static void main(String[] args) {
		//Ex11.methodA();//ȣ���ϴ� �޼ҵ尡 �������� Ex11.��������
		methodA(10, 20, 30);
		
		methodB();
		methodB(100);
		methodB(100,200,300,400,500);
	}

}
