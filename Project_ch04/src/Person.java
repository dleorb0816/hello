
//1.클래스 만들기(클래스 정의(define)
class Person 
{
	//1-1.멤버변수 만들기(변수 선언, declare)
	private String name;
	private int	age;
	private float height;
	
	//1-2.생성자 (메소드) 만들기(define).. 생략도 많이 하더라.
	//메소드이다. 조금 특별한(제한 사항있다 1.반환 자체가 없다. 2.메소드이름이 클래스 이름과 똑같이 써야한다.
	Person()//역할은 멤버변수에 초기값을 주는데 "사용"한다! 그 전에 객체를 만들때 "사용"한다.
	{
		name = "홍길동";
		age = 28 ;
		height = 169.4f;
	}
	
	//1-3.(일반) 메소드 만들기(define)
	void setAge(int a)
	{
		age = a;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}

	
	String getName()
	{
		return name;
	}
	

	
}
