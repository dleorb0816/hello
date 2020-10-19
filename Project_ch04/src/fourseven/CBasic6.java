package fourseven;

public class CBasic6 {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a=10;//되고
	//	aClass.b=10;//이게 정상!
		aClass.setb(20);
		aClass.c=10;//되고
		
		System.out.println(aClass.getb());
		

	}

}
