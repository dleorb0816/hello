import java.util.Scanner;
public class ex11_2 {

	

	public static void main(String[] args) {
		
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		Scanner sc = new Scanner(System.in);


		while(sc.hasNext()) {
			int a=sc.nextInt();
			
			switch(a) {
			case 1: case 2: case 12:
				System.out.println("�ܿ�");
				break;

			case 3: case 4: case 5:
				System.out.println("��");
				break;

			case 6: case 7: case 8:
				System.out.println("����");
				break;

			case 9: case 10: case 11:
				System.out.println("����");
				break;
			
			default:
				System.out.println("�߸��Է�");
			}

				
			
		}
		
	}
}
