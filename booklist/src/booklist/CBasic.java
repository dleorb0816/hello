package booklist;



public class CBasic 
{
	public static void main(String args[]) { // �޼ҵ��̸鼭 ���α׷����࿡ ������
		
		//1.��ü bl1 �����
		BookList bl1 = new BookList();
		
		//2.å���� ��������
		bl1.getCon();
		bl1.selectBookList();
		bl1.closeDB();
		
		CustomerList cl1 = new CustomerList();
		//3.������ ��������
		cl1.getCon();
		cl1.selectCustomerList();
		cl1.closeDB();
		
//		new BookList().selectBookList();
//		new BookList().selectCustomerList();
		
	}
}
