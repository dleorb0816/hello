import java.util.Scanner;

public class ex8_1 {

	public static void main(String[] args) {
		/*
		System.out.print("���� �?");
		Scanner sc= new Scanner(System.in); 
		int a = sc.nextInt();
		//int num = (int)Math.random()*10+1;//�� ��������
		//System.out.println(num);
		
		int b[]= new int[a];
		int num = (int)(Math.random()*100+1);
		
		for(int i=0;i<b.length;i++) 
		{
			b[i]=(int)(Math.random()*100+1);
			for(int j=0;j<i;j++)
			{
				if(b[i]==b[j])
				{
					i--;
				}
			}
		}
		for (int c=0;c<b.length;c++)
		{
			System.out.print(b[c] + " ");
		}*/
		
		/*
		for(int i =0; i<b.length;i++)//���ֱ� 
		{
			int num = (int)(Math.random()*100+1);
			b[i]= num;
			b[i]=(int)(Math.random()*100+1);
		}
		
		for(int i =0; i<b.length;i++) //��������
		{
			for(int j =0; j<i; j++) {
				
			}
			
			System.out.print(b[i]+" ");
			
		}*/

		//for(int i=0; i<b.length; i++ )
		//{
		//	b[i]= num;
			//System.out.println();
		//}
		//for(int i =0; i<b.length; i++)
		//{
		//	System.out.print(b[i]);
		//}
		
		System.out.print("���� �?");
		Scanner sc= new Scanner(System.in); 
		int size = sc.nextInt();
		
		if(size<=0 || size>100)
		{
			System.out.println("1~100������ ���� �Է��ϼ���!");
			sc.close();
			return;
		}
		
			int arr[] = new int[size];
			//�������� üũ�ؼ� ������ �ȵȴ�
			for(int i =0;i<arr.length;i++) {
				int num = (int)(Math.random()*100+1);
				//�迭�� ���ҿ� ���ϰ� �ִ��� Ȯ��!
				
				boolean bSame = false;
				for(int j =0; j<i; j++)
				{
					if(arr[j]==num)//���� �Է°� num��, �迭�� ���ҿ� ���� ���� ������
					{
						bSame = true;
						break;
					}
					else
					{
						bSame =true;
					}
				}
				
				//if(bSame == true)
				if(bSame == true)
				{
					i--;
					continue;
				}
				arr[i]= num;
				
			}
			
			for(int i = 0;i<arr.length;i++)
			{
				if(i==0)
					System.out.print(arr[i]+ " ");
				else
				{
					if(i%10==0)
						System.out.print("\n");
					
					System.out.print(arr[i]+ " ");
				}

			}
		sc.close();
	}
}