import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		int n[] = new int[10];
		
		for(int i =0; i<n.length;i++)//값넣기 
		{
			//int num = (int)(Math.random()*10+1);
			//n[i]= num;
			n[i]=(int)(Math.random()*10+1);
		}
		int sum=0;
		for(int i =0; i<n.length;i++) //값꺼내기
		{
			System.out.print(n[i]+" ");
			sum = sum + n[i];
		}
		System.out.println();
		System.out.println("합계는 "+ sum + "평균은 " + sum/n.length);
		//int sum = 0;
		//for(int i =0; i<n.length;i++) //합계
		//{
		//	sum = sum + n[i];
		//}
		
		
	}
}