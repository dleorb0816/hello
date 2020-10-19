package booklist;



public class CBasic 
{
	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함
		
		//1.객체 bl1 만들기
		BookList bl1 = new BookList();
		
		//2.책정보 가져오기
		bl1.getCon();
		bl1.selectBookList();
		bl1.closeDB();
		
		CustomerList cl1 = new CustomerList();
		//3.고객정보 가져오기
		cl1.getCon();
		cl1.selectCustomerList();
		cl1.closeDB();
		
//		new BookList().selectBookList();
//		new BookList().selectCustomerList();
		
	}
}
