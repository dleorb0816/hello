import java.util.Scanner;

//사용자가 낸거 고를때

public class ex16 {

	public static void main(String[] args) {
		
		String str[]= {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do
		{
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보! >>");
			Scanner sc= new Scanner(System.in);
			String me=sc.next();
			
			if(me.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			else if(me.equals(str[n]))
			{
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 비겼습니다");
			}
			else if(me.equals("가위"))
			{
				if(n==1)
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}
			else if(me.equals("바위"))
			{
				if(n==2)
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}
			else if(me.equals("보"))
			{
				if(n==0)
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 졌습니다");
				else
				System.out.println("사용자 = " + me +", 컴퓨터 = " +str[n]+", 사용자가 이겼습니다");
			}

		} while(true);
	}
}