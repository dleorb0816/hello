//ex 4-4
public class Goods4 {
	//String name;
	//int price;
	//int numberOfstock;
	//int sold;
	
	

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


