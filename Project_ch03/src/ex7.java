import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		int n[] = new int[10];
		
		for(int i =0; i<n.length;i++)//���ֱ� 
		{
			//int num = (int)(Math.random()*10+1);
			//n[i]= num;
			n[i]=(int)(Math.random()*10+1);
		}
		int sum=0;
		for(int i =0; i<n.length;i++) //��������
		{
			System.out.print(n[i]+" ");
			sum = sum + n[i];
		}
		System.out.println();
		System.out.println("�հ�� "+ sum + "����� " + sum/n.length);
		//int sum = 0;
		//for(int i =0; i<n.length;i++) //�հ�
		//{
		//	sum = sum + n[i];
		//}
		
		
	}
}