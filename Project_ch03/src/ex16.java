import java.util.Scanner;

//����ڰ� ���� ����

public class ex16 {

	public static void main(String[] args) {
		
		String str[]= {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do
		{
			int n = (int)(Math.random()*3);
			System.out.print("���� ���� ��! >>");
			Scanner sc= new Scanner(System.in);
			String me=sc.next();
			
			if(me.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			else if(me.equals(str[n]))
			{
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", �����ϴ�");
			}
			else if(me.equals("����"))
			{
				if(n==1)
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}
			else if(me.equals("����"))
			{
				if(n==2)
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}
			else if(me.equals("��"))
			{
				if(n==0)
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �����ϴ�");
				else
				System.out.println("����� = " + me +", ��ǻ�� = " +str[n]+", ����ڰ� �̰���ϴ�");
			}

		} while(true);
	}
}