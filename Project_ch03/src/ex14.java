import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5","��ǻ�� ����","�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		for(; ; ) {
		System.out.print("���� �̸�>>");
		String name = sc.next();
		
		if(name.equals("�׸�")) {
			break;
		}
		
		boolean bSame=false;
		int i=0;
		for(i= 0;i<5;i++) {
			if(course[i].equals(name)) {
				int n = score[i];
				System.out.println(course[i] + "�� ������ " +n);
				bSame = true;
				break;
			}
			if(i==4)//�ٵ������� 
				{
				System.out.println("���� ����");
			}
		}

		}
	}
}