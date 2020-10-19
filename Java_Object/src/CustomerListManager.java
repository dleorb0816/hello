
public class CustomerListManager {

	void run() {
		//1객체 cs1만들기
		CustomerList cs1 = new CustomerList();
		
		//2.고객정보를 가져오기
		cs1.getCon();//연결 정보 가져오기
		cs1.selectCustomerList();	
		
		//4번 객체 배열용 출력 메소드
		for(int i=0; i<cs1.customer1_arr.length; i++) {
			cs1.customer1_arr[i].printCustomer_object();
			
			cs1.closeDB();
		}
	}
}
