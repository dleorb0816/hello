
public class Customer {
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	public Customer() {}

	public Customer(int custid, String name, String address, String phone) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public void printCustomer_object()
	{
		System.out.println(custid + "\t" 
				 + name + "\t"
				 + address + "\t"
				 + phone + "\t"
				 );
	}
	
	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
