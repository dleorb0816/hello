import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>> ");
		Scanner sc = new Scanner(System.in);
	
		int [] arr = new int[10];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i]= sc.nextInt();
		}//�迭�� ��ä���
		System.out.print("3�� ����� ");
		for(int i = 0; i<10; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}//�迭�� ���ִ� �� ������ ����ϱ�
	}
}