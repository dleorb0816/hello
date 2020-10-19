import java.util.Scanner;

//goods2
public class CBasic4 {
	

	//객체를 사용하는 위치 main
	public static void main(String[] args) {
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//클래스에 static 으로 지정 되있으면 객체 생성 없이 클래스명으로 바로 참조 가능.
		//Goods3 gd = new Goods3();
		Goods3.printCharArray(c);
		Goods3.replaceSpace(c);
		Goods3.printCharArray(c);
		
		System.out.println();
		Goods3 gd = new Goods3();
		gd.printCharArray(c);
		gd.replaceSpace(c);
		gd.printCharArray(c);
	}
}
