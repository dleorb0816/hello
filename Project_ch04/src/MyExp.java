
public class MyExp {
	int base;
	int exp;
	//�̷��� ���� �����ڰ� �����Ǿ��ִ�.
	MyExp()
	{
		
	}
	int getValue() {
		int res=1;
		for(int i=0; i<exp;i++)
			res=res*base;
		return res;
	}
	
	void setbase(int a){
		base = a;
	}
	
	void setexp(int a) {
		exp = a;
	}
	
	int getbase() {
		return base;
	}
	
	int getexp() {
		return exp;
	}
	
	
}


