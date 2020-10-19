import java.util.Scanner;

//컴퓨터가 낸거 고를때

public class ex17 {

	public static void main(String[] args) {
		
		String str[]= {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do
		{
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보! >>");
			Scanner sc= new Scanner(System.in);
			String a=sc.next();
			
			if(a.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			else if(str[n].equals(a))
			{
				System.out.println("사용자 = " + a +", 컴퓨터 = " +str[n]+", 비겼습니다");
			}
			else if(str[n].equals("가위"))
			{
				
				if(a.equals("보"))
				System.out.println("사용자 = " + a +", 컴퓨터 = " +"가위"+", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + a +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}
			else if(str[n].equals("바위"))
			{
				
				if(a.equals("가위"))
				System.out.println("사용자 = " + a +", 컴퓨터 = " +"바위" + ", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + a +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}
			else if(str[n].equals("보"))
			{
				
				if(a.equals("바위"))
				System.out.println("사용자 = " + a +", 컴퓨터 = " +"바위" + ", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + a +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}
		} while(true);
	}
}