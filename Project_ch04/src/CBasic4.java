import java.util.Scanner;

//goods2
public class CBasic4 {
	

	//��ü�� ����ϴ� ��ġ main
	public static void main(String[] args) {
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//Ŭ������ static ���� ���� �������� ��ü ���� ���� Ŭ���������� �ٷ� ���� ����.
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
