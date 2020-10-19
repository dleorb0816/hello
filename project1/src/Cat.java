
public class Cat{
	
	//클래스의 구성요 3가지
	
	//1.멤버변수 -상태값을 저장
	int num_of_leg;
	float weight;
	String name;
	
	//2.생성자(메소드) -멤버변수에 초기값을 지정한다
	Cat() { //반환값 없다
		num_of_leg = 4;
		weight = 0.0f;
	}
	
	//3.(일반)메소드-동작
	void printCat( ) {
		System.out.println("고양이 다리 갯수는 ? "+ num_of_leg);
	}
	
	void runCat() {
		System.out.println("고양이가 달린다");
	}

}
