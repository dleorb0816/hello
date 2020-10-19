import java.util.Scanner;
public class ex12 {

	

	public static void main(String[] args) {
		
		
		System.out.print("¿¬»ê>>");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		String operator = sc.next();
		double b = sc.nextDouble();

		double result = 0.0;
			
		if( operator.equals("+")) {
				result = a +b;
			}
		else if( operator.equals("-")) {
			result = a - b;
		}
		else if( operator.equals("*")) {
			result = a * b;
		}
		else if( operator.equals("/")) {
			result = a / b;
		}
			
		}		
}