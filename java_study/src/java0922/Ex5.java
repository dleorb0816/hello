package java0922;


class Parent {
	int num;
	
	
	
	Parent(int num) {//�������� ���� �ڱ� Ŭ�����ȿ��� ������� �ʵ带 �ʱ�ȭ ���ִ� ����
		super();
		num = num;
	}
}



class Child extends Parent {
	String str;
	
	Child() {
		//�����Ϸ��� ������ ��� �ȿ��� ������ ù���ο� �θ� Ŭ������ �⺻ ������ ȣ�⹮�� ������.
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
		super();	//������ ù���ο��� ������ �ڵ����� ������
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
