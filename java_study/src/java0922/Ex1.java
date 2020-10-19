package java0922;

abstract class Animal extends Object {
	// �������(�ʵ�)
	int age;
	String gender;

	Animal(int age, String gender){
		this.age = age;
		this.gender = gender;
	}
	
	// �޼ҵ�
	abstract void speak();	//�߻�޼���
}

interface Robot{
	void guardAndRecord();	//����Ű�� ��ȭ�ϱ�
}


class Puppy extends Animal implements Robot {
	private String color;
	
	
	public Puppy() {
		super(3, "����");
		color = "���";
	}
	
	public Puppy(int age, String gender) {
		super(age, gender);
	}

	@Override // �޼ҵ� ������
	void speak() {

		System.out.println("�۸�~!");
	}

	@Override
	public void guardAndRecord() {
		System.out.println("����Ű�� ��ȭ�ϱ�");
		
	}
	
	@Override
	public String toString() {
		return age + "��" + gender + "������";
	}

}

class Cat extends Animal {
	Cat() {
		super(4,"����");
	}
	
	public Cat(int age, String gender) {
		super(age, gender);
	}
	
	@Override // �޼ҵ� ������
	void speak() {
		System.out.println("�߿�!");
	}
	
	public String toString() {
		return age + "��" + gender + "�����";
	}
}


class Duck extends Animal {
	public Duck() {
		super(5,"����");
	}
	
	public Duck(int age, String gender) {
		super(age, gender);
	}
	
	
	
	@Override // �޼ҵ� ������
	void speak() {
		System.out.println("�в�!");
	}
	
	public String toString() {
		return age + "��" + gender + "����";
	}
}


class Vet { //���ǻ�
	
//	void giveShot(Puppy puppy) {//�ֻ����
//		//���������� �ֻ������ �������� ¢�´�.
//		puppy.speak();
//	}
//	
//	void giveShot(Cat cat) {//�ֻ����
//		//��������� �ֻ������ ����̰� ¢�´�.
//		cat.speak();
//	}
	
	
	void giveShot(Animal animal) {
		//�������� �����ؼ� ����
		animal.speak();
	}
		
}
public class Ex1 {

	public static void main(String[] args) {

		// puppy��ü�� puppy���������� �����ؼ� ���ÿ���
		// ����(�����Ͻð�) ���ε��� �߻���.
		Puppy puppy = new Puppy(); //��ü Puppy
		puppy.speak();

		// Puppy��ü�� Animal���������� �����ؼ� �޼ҵ� ȣ��ÿ���
		// �������ε� �� ����(����ð�) ���ε����� �߻���.
		Animal animal = new Puppy();//���⼭ ��ü�� Puppy
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
	
	}// main �޼ҵ�

}
