package EX11;

import java.util.Scanner;

public class CalManager {
	Scanner s = new Scanner(System.in);
	
	public void run() {
		System.out.print("두정수와 연산자를 입력하시오");
		int a = s.nextInt();
		int b = s.nextInt();
		String cal = s.next();
		
		switch(cal) {
		
		case "+":
			Add add = new Add();
			add.setvalue(a, b);
			System.out.println(add.Calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setvalue(a, b);
			System.out.println(sub.Calculate());
			break;
		
		case "*":
			Mul mul = new Mul();
			mul.setvalue(a, b);
			System.out.println(mul.Calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setvalue(a, b);
			System.out.println(div.Calculate());
			break;
		}
	}
}
