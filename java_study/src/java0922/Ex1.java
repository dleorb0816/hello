package java0922;

abstract class Animal extends Object {
	// 멤버변수(필드)
	int age;
	String gender;

	Animal(int age, String gender){
		this.age = age;
		this.gender = gender;
	}
	
	// 메소드
	abstract void speak();	//추상메서드
}

interface Robot{
	void guardAndRecord();	//집지키고 녹화하기
}


class Puppy extends Animal implements Robot {
	private String color;
	
	
	public Puppy() {
		super(3, "암컷");
		color = "흰색";
	}
	
	public Puppy(int age, String gender) {
		super(age, gender);
	}

	@Override // 메소드 재정의
	void speak() {

		System.out.println("멍멍~!");
	}

	@Override
	public void guardAndRecord() {
		System.out.println("집지키고 녹화하기");
		
	}
	
	@Override
	public String toString() {
		return age + "살" + gender + "강아지";
	}

}

class Cat extends Animal {
	Cat() {
		super(4,"수컷");
	}
	
	public Cat(int age, String gender) {
		super(age, gender);
	}
	
	@Override // 메소드 재정의
	void speak() {
		System.out.println("야옹!");
	}
	
	public String toString() {
		return age + "살" + gender + "고양이";
	}
}


class Duck extends Animal {
	public Duck() {
		super(5,"수컷");
	}
	
	public Duck(int age, String gender) {
		super(age, gender);
	}
	
	
	
	@Override // 메소드 재정의
	void speak() {
		System.out.println("꽥꽥!");
	}
	
	public String toString() {
		return age + "살" + gender + "오리";
	}
}


class Vet { //수의사
	
//	void giveShot(Puppy puppy) {//주사놓기
//		//강아지한테 주사놓으면 강아지가 짖는다.
//		puppy.speak();
//	}
//	
//	void giveShot(Cat cat) {//주사놓기
//		//고양이한테 주사놓으면 고양이가 짖는다.
//		cat.speak();
//	}
	
	
	void giveShot(Animal animal) {
		//다형성을 적용해서 구현
		animal.speak();
	}
		
}
public class Ex1 {

	public static void main(String[] args) {

		// puppy객체를 puppy참조변수로 저장해서 사용시에는
		// 정적(컴파일시간) 바인딩만 발생함.
		Puppy puppy = new Puppy(); //객체 Puppy
		puppy.speak();

		// Puppy객체를 Animal참조변수로 저장해서 메소드 호출시에는
		// 정적바인딩 후 동적(실행시간) 바인딩까지 발생함.
		Animal animal = new Puppy();//여기서 객체는 Puppy
		//...
		animal = new Cat();
		
		animal.speak();

		System.out.println("///////////////////////////////////////");
		
		Vet vet = new Vet();
		
		Puppy poodle = new Puppy();
		Cat nero = new Cat();
		Duck duck = new Duck();
		
		vet.giveShot(poodle);
		vet.giveShot(nero);
		vet.giveShot(duck);
		
	System.out.println("//////////////");
	
	Robot Puppyrobot = new Puppy();
	Puppyrobot.guardAndRecord();
	
	Duck duck1 = new Duck();
	System.out.println(duck1.toString());
	
	
//	Animal ani = (Animal) Puppyrobot;
//	ani.speak();
	
	}// main 메소드

}
