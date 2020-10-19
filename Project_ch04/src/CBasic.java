
public class CBasic 
{
	public static void main(String[] args) 
	{
		//2.Person 클래스 "사용"
		int p2;
		//클래스는 객체변수를 만드는데 "사용"한다!
		Person p1;//p1변수는 "객체변수"라고 한다. 객체가 덜 된놈! 미생~!
		p1 = new Person(); //new와 생성자-> 찐객체 , 찐객체를 p1에 담으면 완생! 객체가 된다
		//p1 객체 "만들기"
		
//		System.out.println(p1.age);//객체 사용( 출력하는데다가)
		System.out.println(p1.getAge());//객체 사용( 출력하는데다가)
		
		Person p3 = new Person();//p3 객체 "만들기"
		
//		p1.age = 51;//객체 "사용"하기 - 객체의 "멤버 변수"를 "사용하기"
		p1.setAge(51);
		
		System.out.println(p1.getName());
//		p1.name = "강감찬";
		p1.setName("강감찬");
		
		System.out.println(p1.getName());
		
		
//		System.out.println(p1.age);
		System.out.println(p1.getAge());
		
		//객체 사용, 객체의 "메소드" 사용
		p1.setAge(53);//메소드 사용
//		System.out.println(p1.age);//멤버 변수 사용
		System.out.println(p1.getAge());//멤버 변수 사용
		
	}
}
