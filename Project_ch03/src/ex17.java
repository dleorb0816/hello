import java.util.Scanner;

//��ǻ�Ͱ� ���� ����

public class ex17 {

	public static void main(String[] args) {
		
		String str[]= {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do
		{
			int n = (int)(Math.random()*3);
			System.out.print("���� ���� ��! >>");
			Scanner sc= new Scanner(System.in);
			String a=sc.next();
			
			if(a.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			else if(str[n].equals(a))
			{
				System.out.println("����� = " + a +", ��ǻ�� = " +str[n]+", �����ϴ�");
			}
			else if(str[n].equals("����"))
			{
				
				if(a.equals("��"))
				System.out.println("����� = " + a +", ��ǻ�� = " +"����"+", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + a +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}
			else if(str[n].equals("����"))
			{
				
				if(a.equals("����"))
				System.out.println("����� = " + a +", ��ǻ�� = " +"����" + ", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + a +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}
			else if(str[n].equals("��"))
			{
				
				if(a.equals("����"))
				System.out.println("����� = " + a +", ��ǻ�� = " +"����" + ", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + a +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}
		} while(true);
	}
}