//ex 4-4
public class Goods3 {
	//String name;
	//int price;
	//int numberOfstock;
	//int sold;
	
	//멤버변수 - 없음
	//생성자 - 없음, 생략되었다.
	
//3.메소드
	static void replaceSpace(char a[]) 
	{
		for(int i =0; i<a.length;i++) {
			if(a[i]==' ')
				a[i]=',';
		}
	}
	
	static void printCharArray(char a[]) 
	{
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]);
			
		}
		System.out.println();
	}
		
}


