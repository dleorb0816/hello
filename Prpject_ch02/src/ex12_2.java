import java.util.Scanner;
public class ex12_2 {

	

	public static void main(String[] args) {
		
		
		System.out.print("연산>>");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			String operator = sc.next();
			int b = sc.nextInt();
			switch(operator) 
			{
			
				case  "+": 
					System.out.println(a+b);
					break;
				
				case  "-": 
					System.out.println(a-b);
					break;
					
				case  "*": 
					System.out.println(a*b);
					break;
					
				case  "/": 
					System.out.println(a/b);
					break;
				default:
					System.out.println("잘못입력");
			}

		
			
		}
		sc.close();	
		}		
	}
