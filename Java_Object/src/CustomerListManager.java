
public class CustomerListManager {

	void run() {
		//1��ü cs1�����
		CustomerList cs1 = new CustomerList();
		
		//2.�������� ��������
		cs1.getCon();//���� ���� ��������
		cs1.selectCustomerList();	
		
		//4�� ��ü �迭�� ��� �޼ҵ�
		for(int i=0; i<cs1.customer1_arr.length; i++) {
			cs1.customer1_arr[i].printCustomer_object();
			
			cs1.closeDB();
		}
	}
}
