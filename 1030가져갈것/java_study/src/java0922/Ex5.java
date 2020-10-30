package java0922;


class Parent {
	int num;
	
	
	
	Parent(int num) {//생성자의 역할 자기 클래스안에서 만들어진 필드를 초기화 해주는 역할
		super();
		num = num;
	}
}



class Child extends Parent {
	String str;
	
	Child() {
		//컴파일러는 생성자 블록 안에서 무조건 첫라인에 부모 클래스의 기본 생성자 호출문을 삽입함.
		super(10);
	}
	
}

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A{
	B() {
		super();	//생성자 첫라인에는 무조건 자동으로 생성됨
		System.out.println("B");
	}
}

class C extends B{
	C() {
		super();
		System.out.println("C");
	}
}






public class Ex5 {
	
	public static void main(String[] args) {
		new C();
		
		
		
		
		//Child child = new Child();
	}

}
