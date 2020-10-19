//myexo
public class CBasic2 {
	
	
	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.setbase(2);
		number1.setexp(3);
		
		MyExp number2 = new MyExp();
		number2.setbase(3);
		number2.setexp(4);
		
		System.out.println("2ÀÇ 3½Â = " + number1.getValue());
		System.out.println("3ÀÇ 4½Â = " + number2.getValue());;
		
		
		
}
}
